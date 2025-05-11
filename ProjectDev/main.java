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
            menu.displayMenu();
            int choice = menu.getMenuChoice(scanner); 
            scanner.nextLine();
            
            switch (choice) {
                case 1: 
                    crud.createPerson();
                    break;
                case 2: 
                    crud.readAllPeople();
                    break;
                case 3:
                    crud.updatePerson();
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