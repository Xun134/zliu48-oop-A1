/**
 * GeneralPractitioner class for the assignment.
 * Author: zliu48  24274371
 */
public class GeneralPractitioner extends HealthProfessional {
    private String clinic;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.clinic = "Default Clinic";
    }

    // Constructor with specified values
    public GeneralPractitioner(int id, String name, String specialization, String clinic) {
        super(id, name, specialization);
        this.clinic = clinic;
    }

    // Prints the details of the General Practitioner
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Clinic: " + clinic);
    }

    // Returns the availability of the General Practitioner
    public String getAvailability() {
        return "Mon-Fri, 9:00 AM - 5:00 PM";
    }
}
