package ProjectDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class crud {
    private static List<Person> people = new ArrayList<>();
    private static int nextId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void createPerson() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        Person person = new Person(nextId++, name, age);
        people.add(person);
        System.out.println("\nPerson created successfully!");
        ui.printSinglePerson(person);
    }

    public static void readAllPeople() {
        if (people.isEmpty()) {
            ui.printRowEmpty();
            return;
        }

        System.out.println("\nList of People:");
        ui.printTableHeader();
        for (Person person : people) {
            System.out.println(person.toTableRow());
            ui.printRowSeparate();
        }
    }

    public static void updatePerson() {
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
            System.out.println("\nPerson with ID " + id + " not found.");
            return;
        }

        System.out.println("\nCurrent details:");
        ui.printSinglePerson(personToUpdate);

        System.out.print("\nEnter new name (current: " + personToUpdate.getName() + "): ");
        String newName = scanner.nextLine();
        System.out.print("Enter new age (current: " + personToUpdate.getAge() + "): ");
        int newAge = scanner.nextInt();
        scanner.nextLine(); 

        personToUpdate.setName(newName);
        personToUpdate.setAge(newAge);
        System.out.println("\nPerson updated successfully!");
        ui.printSinglePerson(personToUpdate);
    }

    public static void deletePerson() {
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

        System.out.println("\nDeleting this person:");
        ui.printSinglePerson(personToDelete);
        
        people.remove(personToDelete);
        ui.printRowEmpty();
    }
}