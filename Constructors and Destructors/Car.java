public class Car {
    // Attributes
    private String brand;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println("Parameterized constructor called.");
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Creating objects using constructors
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry", 2022);

        // Displaying car information
        System.out.println("\nCar1 Information:");
        car1.displayInfo();

        System.out.println("\nCar2 Information:");
        car2.displayInfo();
    }
}

