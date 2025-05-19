package ProjectDev;

import java.util.Scanner;

public class menuHandler {
    
    // I-handle ang user choice mula sa menu
    public static void handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in);
        String toExit = "no";
        try {
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
                    System.out.print("Are you sure to exit? (yes/no): ");
                    toExit = scanner.nextLine();
                    
                if (toExit == "no") {
                    menu.displayMenu();
                } else
                    System.out.println(color.GREEN + "Exiting Program..." + color.RESET);
                    System.exit(0);
                    break;
                default:
                    System.out.println(color.RED + "Invalid choice! Please select 1-5 only." + color.RESET);
            }
        } catch (Exception e) {
            System.out.println(color.RED + "An error occurred: " + e.getMessage() + color.RESET);
        }
    }
}