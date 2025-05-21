package ProjectDev;

public class menuHandler {
    public static void handleMenuChoice(int choice) {
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
                default:
                    System.out.println(color.RED + "Invalid choice! Please select 1-5 only." + color.RESET);
            }
        } catch (Exception e) {
            System.out.println(color.RED + "An error occurred: " + e.getMessage() + color.RESET);
        }
    }
}