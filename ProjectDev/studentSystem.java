package ProjectDev;

import java.util.Scanner;

public class studentSystem {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void start() {
        boolean inStudentSystem = true;
        
        try {
            while (inStudentSystem) {
                menu.displayMenu();
                int choice = menu.getMenuChoice(scanner); 
                scanner.nextLine();
                
                if (choice == -1) continue;
                if (choice == 5) {
                    inStudentSystem = false;
                } else {
                    menuHandler.handleMenuChoice(choice);
                }
            }
        } catch (Exception e) {
            System.out.println(color.RED + "An error occurred: " + e.getMessage() + color.RESET);
        }
    }
}