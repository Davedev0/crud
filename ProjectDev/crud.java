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
        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Linisin ang buffer
            
            Person person = new Person(nextId++, name, age);
            people.add(person);
            System.out.println(color.YELLOW + "\nPerson created successfully!" + color.RESET);
            ui.printSinglePerson(person);
        } catch (InputMismatchException e) {
            System.out.println(color.RED + "Invalid input! Age must be a number." + color.RESET);
            scanner.nextLine();
        }
    }

    // Ipakita ang lahat ng mga persons
    public static void readAllPeople() {
        if (people.isEmpty()) {
            ui.printRowEmpty();
            return;
        }

        System.out.println(color.YELLOW + "\nList of People:" + color.RESET);
        ui.printTableHeader();
        //enhanced loop 
        for (Person person : people) {
            System.out.println(person.toTableRow());
            ui.printRowSeparate();
        }
    }

    // I-update ang isang person
    public static void updatePerson() {
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
                System.out.print("\nPerson with ID " + id + " not found.");
                ui.printRowEmpty();
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
        } catch (InputMismatchException e) {
            System.out.println(color.RED + "Invalid input! Please enter a valid number for ID and age." + color.RESET);
            scanner.nextLine(); 
        }
    }

    // Tanggalin ang isang person
    public static void deletePerson() {
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
                System.out.print("\nPerson with ID " + id + " not found.");
                ui.printRowEmpty();
                return;
            } 
            
            System.out.print("Are you sure to delete (yes/no): ");
            String toDelete = scanner.nextLine();
            System.out.println();
            
            switch(toDelete) {
                case "yes":
            System.out.println(color.RED + "Person deleted successfully!" + color.RESET);
            ui.printSinglePerson(personToDelete);
            people.remove(personToDelete);
                break;
                
                case "no":
                System.out.println("Cancel delete person!");
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println(color.RED + "Invalid input! ID must be a number." + color.RESET);
            scanner.nextLine();
        }
    }
}