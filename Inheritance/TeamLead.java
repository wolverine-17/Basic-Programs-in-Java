package Inheritance;

// Base class
class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}

// Derived class 1
class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    public void manageTeam() {
        System.out.println("Manager is managing a team in the " + department + " department.");
    }
}

// Derived class 2
class TeamLead extends Manager {
    private int teamSize;

    public TeamLead(String name, int employeeId, String department, int teamSize) {
        super(name, employeeId, department);
        this.teamSize = teamSize;
    }

    public void leadTeam() {
        System.out.println("Team Lead is leading a team of " + teamSize + " members.");
    }

    public static void main(String[] args) {
        // Creating an object of the most derived class
        TeamLead teamLead = new TeamLead("Jane Smith", 201, "Engineering", 8);

        // Accessing methods from all levels of inheritance
        teamLead.displayDetails();
        teamLead.manageTeam();
        teamLead.leadTeam();
    }
}
