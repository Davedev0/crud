package ProjectDev;

//Encalpsulation 
public class Person {
    private int id;
    private String name;
    private int age;

    // Constructor para sa Person
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Mga getter at setter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // I-format ang person details para sa table display
    public String toTableRow() {
        return String.format("| %-4d | %-20s | %-4d |", id, name, age);
    }
}