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
            menuHandler.handleMenuChoice(choice);
        }
        scanner.close();
    }
}