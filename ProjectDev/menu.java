package ProjectDev;

import java.util.Scanner;

public class menu {
    public static void displayMenu() {
        cls.clearScreen();
        System.out.println(color.CYAN + "\nSTUDENTS INFORMATION" + color.RESET);
        System.out.println(color.GREEN + "[1] Create Person");
        System.out.println("[2] Read All Person");
        System.out.println("[3] Update Person");
        System.out.println("[4] Delete Person");
        System.out.println("[5] Back" + color.RESET);
        System.out.print("Select your choice: ");
    }
    
    public static int getMenuChoice(Scanner scanner) {
        while (true) {
            try {
                int choice = scanner.nextInt();
                
                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.out.println(color.RED + "Invalid! Please select 1-5 only." + color.RESET);
                    System.out.print("Select your choice: ");
                }
            } catch (Exception e) {
                System.out.println(color.RED + "Invalid! Please enter a number." + color.RESET);
                System.out.print("Select your choice: ");
            }
        }
    }
}