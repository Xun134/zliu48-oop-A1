/**
 * HealthProfessional class for the assignment.
 * Author: zliu48  24274371
 */
public class HealthProfessional {
    private int id;
    private String name;
    private String specialization;

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "undefined";
        this.specialization = "general";
    }

    // Constructor with specified values
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // Prints the details of the HealthProfessional
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    // Gets the ID of the HealthProfessional
    public int getId() {
        return id;
    }

    // Gets the name of the HealthProfessional
    public String getName() {
        return name;
    }
}
