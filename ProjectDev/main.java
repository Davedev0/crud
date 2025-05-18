package ProjectDev;

import java.util.Scanner;
public class main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean running = true;
        
        while (running) {
            menu.displayMenu();
            int choice = menu.getMenuChoice(scanner); 
            scanner.nextLine();
            if (choice == -1) continue;
            menuHandler.handleMenuChoice(choice);
         }
        scanner.close();
    }
}