package Interface;

public class Student implements MathOperations, PrintDetails {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printDetails() {
        System.out.println("Student Details - Name: " + name + ", Age: " + age);
    }

    @Override
    public int performOperation(int a, int b) {
        return a + b; // You can change this to any desired mathematical operation
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);

        // Accessing methods from both interfaces
        student.printDetails();

        int result = student.performOperation(5, 3);
        System.out.println("Result of the operation: " + result);
    }
}

interface MathOperations {
    int performOperation(int a, int b);
}

interface PrintDetails {
    void printDetails();
}

