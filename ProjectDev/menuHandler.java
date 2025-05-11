package ProjectDev;

public class menuHandler {
    public static void handleMenuChoice(int choice) {
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
                System.out.println("Exiting Program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}