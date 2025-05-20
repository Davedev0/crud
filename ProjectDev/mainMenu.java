package ProjectDev;

import java.util.Scanner;

public class mainMenu {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void displayMainMenu() {
        System.out.println(color.CYAN + "\nSTUDENT SYSTEM MANAGAMENT" + color.RESET);
        System.out.println(color.GREEN + "[1] Home");
        System.out.println("[2] About Us");
        System.out.println("[3] Exit" + color.RESET);
        System.out.print("Select your choice: ");
    }
    
    public static void handleMainMenu() {
        boolean running = true;
        
        try {
            while (running) {
                displayMainMenu();
                int choice = getMenuChoice(scanner);
                scanner.nextLine();
                
                switch (choice) {
                    case 1:
                        studentSystem.start();
                        break;
                    case 2:
                        displayAboutUs();
                        break;
                    case 3:
                        System.out.println(color.GREEN + "Exiting Program..." + color.RESET);
                        running = false;
                        break;
                    default:
                        System.out.println(color.RED + "Invalid choice! Please select 1-3 only." + color.RESET);
                }
            }
        } finally {
            scanner.close();
            System.out.println(color.GREEN + "Program closed properly." + color.RESET);
        }
    }
    
    private static int getMenuChoice(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println(color.RED + "Invalid Choice! Please enter a number (1-3)." + color.RESET);
            return -1;
        }
    }
    
    private static void displayAboutUs() {
        System.out.println(color.YELLOW + "\nAbout Us:");
        System.out.println("This is a Student Information System");
        System.out.println("Created for educational purposes" + color.RESET);
        System.out.print("\nPress enter to return to main menu...");
        new Scanner(System.in).nextLine();
    }
}