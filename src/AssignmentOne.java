import java.util.ArrayList;

/**
 * Main class for the assignment.
 * Author: zliu48  24274371
 */
public class AssignmentOne {
    // ArrayList for appointments
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     * Creates a new appointment and adds it to the appointments list.
     */
    public static void createAppointment(String patientName, String timeSlot, String mobilePhone, HealthProfessional doctor) {
        if (patientName == null || mobilePhone == null || timeSlot == null || doctor == null) {
            System.out.println("Some information is missing. Phone number is required.");
            return;
        }
        appointments.add(new Appointment(patientName, mobilePhone, timeSlot, doctor));
    }

    /**
     * Prints the details of all existing appointments.
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        appointments.forEach(appointment -> {
            System.out.println("------------------------------");
            appointment.printDetails();
        });
    }

    /**
     * Cancels a booking by the phone number.
     */
    public static void cancelBooking(String mobilePhone) {
        boolean removed = appointments.removeIf(appointment -> appointment.getMobilePhone().equals(mobilePhone));

        if (removed) {
            System.out.println("Appointment canceled for mobile: " + mobilePhone);
        } else {
            System.out.println("No related record with: " + mobilePhone);
        }
    }

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        // Creating instances of health professionals (Psychiatrists)
        Psychiatrist psychiatrist1 = new Psychiatrist(1, "Dr. Alice Johnson", "Psychiatry", "Sydney Mind Clinic");
        Psychiatrist psychiatrist2 = new Psychiatrist(2, "Dr. John Smith", "Psychiatry", "Melbourne Wellness Centre");

        // Printing health professional details
        psychiatrist1.printDetails();
        psychiatrist2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        // Creating appointments for patients
        createAppointment("Sarah Lee", "09:30", "0412345678", psychiatrist1);
        createAppointment("James Bond", "11:00", "0487654321", psychiatrist2);
        createAppointment("Emily Davis", "14:30", "0433222111", psychiatrist1);
        createAppointment("Michael Brown", "16:45", "0422333444", psychiatrist2);

        // Print existing appointments
        System.out.println("Existing Appointments:");
        printExistingAppointments();

        // Canceling appointments
        cancelBooking("0412345678");
        cancelBooking("0000");

        // Print updated appointments
        System.out.println("Updated Appointments:");
        printExistingAppointments();
        System.out.println("------------------------------");
    }
}
