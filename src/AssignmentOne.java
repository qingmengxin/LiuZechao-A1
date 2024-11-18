public class AssignmentOne {
    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        System.out.println("Creating GeneralPractitioner objects...");

        // Create GeneralPractitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "General Practice", "8 AM to 6 PM");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob", "General Practice", "9 AM to 5 PM");

        // Create Nurse objects
        Nurse nurse1 = new Nurse(3, "Nurse Carol", "Pediatrics", true);
        Nurse nurse2 = new Nurse(4, "Nurse Emma", "Cardiology", false);

        // Create AppointmentManager to manage appointments
        AppointmentManager appointmentManager = new AppointmentManager();

        // Part 5 – Collection of appointments
        // Create some appointments
        appointmentManager.createAppointment("John Doe", "123-456-7890", "10:00", gp1);
        appointmentManager.createAppointment("Jane Smith", "987-654-3210", "14:30", gp2);
        appointmentManager.createAppointment("Chris Johnson", "555-555-5555", "08:30", nurse1);
        appointmentManager.createAppointment("Patricia Brown", "555-555-1234", "11:00", nurse2);

        // Print existing appointments
        appointmentManager.printExistingAppointments();
        System.out.println("------------------------------");

        // Cancel an appointment
        appointmentManager.cancelBooking("555-555-5555");

        // Print existing appointments again to show updated list
        appointmentManager.printExistingAppointments();
        System.out.println("------------------------------");
    }
}
