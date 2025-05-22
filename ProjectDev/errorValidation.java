package ProjectDev;

public class errorValidation {
    
    //Kapag wala sa menu ang number or lumagpas sa hinihingi
    public static void invalidChoice() {
        System.out.println(color.RED + "\nInvalid choice, Please select correctly!" + color.RESET);
    }
    
    //Kapag letter ang input 
    public static void inputNumberOnly() {
        System.out.println(color.RED + "\nInvalid input, Please enter a number only!" + color.RESET);
    }
    
    //Validation kapag ang hinihingi lang ay yes or no 
    public static void inputYesOrNoOnly() {
        System.out.println(color.RED + "\nInvalid input, Please enter 'yes' or 'no' only!" + color.RESET);
    }
    
    public static void invalidAge() {
        System.out.println(color.RED + "\nInvalid input! Age must be a number." + color.RESET);
    }
    
    public static void invalidId() {
        System.out.println(color.RED + "\nInvalid input! ID must be a number.\n" + color.RESET);
    }
}