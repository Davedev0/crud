package ProjectDev;

import java.util.Scanner;
public class main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        try {
            while (running) {
                menu.displayMenu();
                int choice = menu.getMenuChoice(scanner); 
                scanner.nextLine();
                if (choice == -1) continue;
                menuHandler.handleMenuChoice(choice);
            }
        } finally {
            scanner.close(); // Isara ang scanner
            System.out.println(color.GREEN + "Program closed properly." + color.RESET);
        }
    }
}