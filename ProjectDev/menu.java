package ProjectDev;

import java.util.Scanner;
import java.util.InputMismatchException;  

public class menu {
    public static void displayMenu() {
        
            System.out.println(color.CYAN + "\nSTUDENTS INFORMATION" + color.RESET);
            System.out.println(color.GREEN + "[1] Create Person");
            System.out.println("[2] Read All People");
            System.out.println("[3] Update Person");
            System.out.println("[4] Delete Person");
            System.out.println("[5] Exit" + color.RESET);
            System.out.print("Select your choice: ");
    }
    
    public static int getMenuChoice(Scanner scanner) {
        try {
        return scanner.nextInt();
        } catch (InputMismatchException e){
            scanner.nextLine();
            System.out.print("Invalid Choice!, Please Enter Again To Continue");
            return -1;
        }
    }
}