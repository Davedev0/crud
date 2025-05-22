// Person.java
package ProjectDev;

//Encapsulation 
public class Person {
    private int id;
    private String name;
    private String course;
    private String section;
    private int age;

    // Constructor para sa Person
    public Person(int id, String name, String course, String section, int age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.section = section;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // I-format ang person details para sa table display
    public String toTableRow() {
        return String.format("| %-3d | %-22s | %-9s | %-8s | %-3d |", 
                           id, name, course, section, age);
    }
}