import java.util.ArrayList;

public class AppointmentManager {
    // Declare ArrayList to store Appointment objects
    private ArrayList<Appointment> appointments;

    // Constructor
    public AppointmentManager() {
        this.appointments = new ArrayList<>();
    }

    // Method to create a new appointment and add it to the ArrayList
    public void createAppointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        if (patientName.isEmpty() || patientMobile.isEmpty() || preferredTimeSlot.isEmpty() || selectedDoctor == null) {
            System.out.println("Error: All information must be supplied to create an appointment.");
            return;
        }

        // Create a new Appointment object
        Appointment newAppointment = new Appointment(patientName, patientMobile, preferredTimeSlot, selectedDoctor);

        // Add the appointment to the ArrayList
        appointments.add(newAppointment);
        System.out.println("Appointment created successfully for " + patientName + " with Dr. " + selectedDoctor.getName() + " at " + preferredTimeSlot);
    }

    // Method to print all existing appointments
    public void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }

        System.out.println("Existing Appointments:");
        for (Appointment appointment : appointments) {
            appointment.printAppointmentDetails();
            System.out.println("------------------------------");
        }
    }

    // Method to cancel an appointment using the patient's mobile number
    public void cancelBooking(String patientMobile) {
        boolean found = false;

        // Loop through appointments to find a matching mobile number
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                appointments.remove(i);
                found = true;
                System.out.println("Appointment cancelled for patient with mobile " + patientMobile);
                break;
            }
        }

        if (!found) {
            System.out.println("Error: No appointment found for mobile " + patientMobile);
        }
    }
}
