// Classes and Objects ...
public class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + " years");
    }

    // Getter and setter methods
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

    public static void main(String[] args) {
        // Creating objects of the Person class
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        // Using the displayInfo method
        System.out.println("Information about person1:");
        person1.displayInfo();

        System.out.println("\nInformation about person2:");
        person2.displayInfo();

        // Modifying attributes using setter methods
        person1.setName("Bob");
        person1.setAge(28);

        // Displaying updated information
        System.out.println("\nUpdated information about person1:");
        person1.displayInfo();
    }
}
