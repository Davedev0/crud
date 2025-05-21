package ProjectDev;

import java.util.Scanner;

public class mainMenu {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void displayMainMenu() {
        cls.clearScreen();
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
                
                // Keep trying until we get valid input
                while (true) {
                    try {
                        int choice = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        
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
                                System.out.println(color.RED + "\nInvalid! Please select 1-3 only." + color.RESET);
                                System.out.print("\nSelect your choice: ");
                                continue; // show menu again
                        }
                        break; // exit the input loop if we got valid input
                    } catch (Exception e) {
                        scanner.nextLine(); // clear invalid input
                        System.out.println(color.RED + "\nInvalid! Please enter a number." + color.RESET);
                        System.out.print("\nSelect your choice: ");
                    }
                }
            }
        } finally {
            scanner.close();
            System.out.println(color.GREEN + "Program closed properly..." + color.RESET);
        }
    }
    
    private static void displayAboutUs() {
        cls.clearScreen();
        System.out.println(color.YELLOW + "\nAbout Us:");
        System.out.println("This is a Student Information System");
        System.out.println("Created for educational purposes" + color.RESET);
        cls.pressEnterToReturn();
    }
}