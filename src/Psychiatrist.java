/**
 * Psychiatrist class for the assignment.
 * Author: zliu48  24274371
 */
public class Psychiatrist extends HealthProfessional {
    private String practiceLocation;

    // Default constructor
    public Psychiatrist() {
        super();
        this.practiceLocation = "Default Clinic";
    }

    // Constructor with specified values
    public Psychiatrist(int id, String name, String specialization, String practiceLocation) {
        super(id, name, specialization);
        this.practiceLocation = practiceLocation;
    }

    // Prints the details of the Psychiatrist
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: Psychiatrist");
        System.out.println("Practice Location: " + practiceLocation);
    }

    // Returns the shift information of the Psychiatrist
    public String getShiftInfo() {
        return "Shift: Day shift from 7:00 AM to 7:00 PM";
    }
}
