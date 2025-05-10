package ProjectDev;

public class ui {
    public static void printTableHeader() {
        System.out.println("+------+----------------------+------+");
        System.out.println("| ID   | Name                 | Age  |");
        System.out.println("+------+----------------------+------+");
    }
    
    public static void printRowEmpty() {
        System.out.println();
        System.out.println("+------+----------------------+------+");
        System.out.println("| ID   | Name                 | Age  |");
        System.out.println("+------+----------------------+------+");
        System.out.println("| #    | Student Not found.   |  0   |");
        System.out.println("+------+----------------------+------+");
    }

    public static void printRowSeparate() {
        System.out.println("+------+----------------------+------+");
    }

    public static void printSinglePerson(Person person) {
        printTableHeader();
        System.out.println(person.toTableRow());
        printRowSeparate();
    }
}