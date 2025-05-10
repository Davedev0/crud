package ProjectDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static List<Person> people = new ArrayList<>();
    private static int nextId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            System.out.println(color.CYAN + "\nSTUDENTS INFORMATION" + color.RESET);
            System.out.println(color.GREEN + "[1] Create Person");
            System.out.println("[2] Read All People");
            System.out.println("[3] Update Person");
            System.out.println("[4] Delete Person");
            System.out.println("[5] Exit" + color.RESET);
            System.out.print("Select your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: 
                    crud.createPerson();
                    break;
                case 2: 
                    crud.readAllPeople();
                    break;
                case 3:
                    if (people.isEmpty()) 
                       ui.printRowEmpty();
                    else crud.updatePerson();
                    break;
                case 4:
                    crud.deletePerson();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
         }
       scanner.close();
    }
}