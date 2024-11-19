/**
 * Appointment class for managing patient bookings with a health professional.
 * Author: zliu48  24274371
 */
public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor;

    // Default constructor initializing default values for an appointment
    public Appointment() {
        this.patientName = "undefined";
        this.mobilePhone = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = null;
    }

    // Constructor for creating an appointment with specific details
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Gets the mobile phone number of the patient
    public String getMobilePhone() {
        return mobilePhone;
    }

    // Prints the details of the appointment
    public void printDetails() {
        System.out.println("Patient: " + patientName);
        System.out.println("Contact: " + mobilePhone);
        System.out.println("Scheduled Time: " + timeSlot);
        System.out.println("Assigned Doctor:");
        if (doctor != null) {
            doctor.printDetails();
        } else {
            System.out.println("No doctor found for this appointment.");
        }
    }
}
