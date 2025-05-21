package ProjectDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class crud {
    private static List<Person> people = new ArrayList<>();
    private static int nextId = 1;
    private static Scanner scanner = new Scanner(System.in);

    // Gumawa ng bagong person
    public static void createPerson() {
        cls.clearScreen();
        try {
            System.out.println("CREATE STUDENT INFO");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Linisin ang buffer
            
            Person person = new Person(nextId++, name, age);
            people.add(person);
            
            System.out.println(color.YELLOW + "\nPerson created successfully!" + color.RESET);
            ui.printSinglePerson(person);
            
            while (true) {
            System.out.print("\nCreate a new student (yes/no): ");
            String createNewStudent = scanner.nextLine().toLowerCase();
            
            if (createNewStudent.equals("yes")) {
                createPerson();
                return;
           } else if (createNewStudent.equals("no")) {
                cls.pressEnterToDelete();
                cls.clearScreen();
                return;
           } else {
                System.out.println(color.RED + "\nInvalid input! Please enter 'yes' or 'no' only!" + color.RESET);
              }
            }
            
        } catch (InputMismatchException e) {
            System.out.println(color.RED + "Invalid input! Age must be a number." + color.RESET);
            scanner.nextLine();
        }
    }

    // Ipakita ang lahat ng mga persons
    public static void readAllPeople() {
        cls.clearScreen();
        if (people.isEmpty()) {
            ui.printRowEmpty();
            cls.pressEnterToDelete();
            cls.clearScreen();
            return;
        }

        System.out.println(color.YELLOW + "\nList of students:" + color.RESET);
        ui.printTableHeader();
        //enhanced loop 
        for (Person person : people) {
            System.out.println(person.toTableRow());
            ui.printRowSeparate();
        }
        
            cls.pressEnterToDelete();
            cls.clearScreen();
    }

    // I-update ang isang person
    public static void updatePerson() {
        cls.clearScreen();
        try {
            System.out.print("Enter ID of person to update: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            Person personToUpdate = null;
            for (Person person : people) {
                if (person.getId() == id) {
                    personToUpdate = person;
                    break;
                }
            }

            if (personToUpdate == null) {
                System.out.print(color.RED + "\nPerson with ID " + id + " not found." + color.RESET);
                ui.printRowEmpty();
                cls.pressEnterToDelete();
                cls.clearScreen();
                return;
            }

            System.out.println(color.YELLOW + "\nCurrent details:" + color.RESET);
            ui.printSinglePerson(personToUpdate);

            System.out.print("\nEnter new name (current: " + personToUpdate.getName() + "): ");
            String newName = scanner.nextLine();
            System.out.print("Enter new age (current: " + personToUpdate.getAge() + "): ");
            int newAge = scanner.nextInt();
            scanner.nextLine(); 

            personToUpdate.setName(newName);
            personToUpdate.setAge(newAge);
            System.out.println(color.YELLOW + "\nPerson updated successfully!" + color.RESET);
            ui.printSinglePerson(personToUpdate);
            cls.pressEnterToDelete();
            cls.clearScreen();
        } catch (InputMismatchException e) {
            System.out.println(color.RED + "Invalid input! Please enter a valid number for ID and age." + color.RESET);
            scanner.nextLine(); 
        }
    }

    // Tanggalin ang isang person
    public static void deletePerson() {
        cls.clearScreen();
        try {
            System.out.print("Enter ID of person to delete: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            Person personToDelete = null;
            for (Person person : people) {
                if (person.getId() == id) {
                    personToDelete = person;
                    break;
                }
            }

            if (personToDelete == null) {
                System.out.print(color.RED + "\nPerson with ID " + id + " not found." + color.RESET);
                ui.printRowEmpty();
                cls.pressEnterToDelete();
                cls.clearScreen();
                return;
            } 
            
            while (true) {
            System.out.print("\nAre you sure to delete (yes/no): ");
            String toDeletePerson = scanner.nextLine().toLowerCase();
            
            if (toDeletePerson.equals("yes")) {
                System.out.println(color.RED + "\nPerson deleted successfully!" + color.RESET);
                ui.printSinglePerson(personToDelete);
                people.remove(personToDelete);
                cls.pressEnterToDelete();
                cls.clearScreen();
                return;
           } else if (toDeletePerson.equals("no")) {
                System.out.println(color.RED + "\nCancel delete student!" + color.RESET);
                cls.pressEnterToDelete();
                cls.clearScreen();
                return;
           } else {
                System.out.println(color.RED + "\nInvalid input! Please enter 'yes' or 'no' only!" + color.RESET);
              }
            }
        } catch (InputMismatchException e) {
            System.out.println(color.RED + "Invalid input! ID must be a number." + color.RESET);
            scanner.nextLine();
        }
    }
}