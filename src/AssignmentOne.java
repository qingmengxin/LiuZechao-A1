public class AssignmentOne {
    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        System.out.println("Creating GeneralPractitioner objects...");

        // Create a GeneralPractitioner object
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "General Practice", "8 AM to 6 PM");

        // Create an Appointment object
        Appointment appointment1 = new Appointment("John Doe", "123-456-7890", "10:00", gp1);

        // Print the appointment details
        appointment1.printAppointmentDetails();
        System.out.println("------------------------------");

        // Create another GeneralPractitioner object
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob", "General Practice", "9 AM to 5 PM");

        // Create another Appointment object
        Appointment appointment2 = new Appointment("Jane Smith", "987-654-3210", "14:30", gp2);

        // Print the second appointment details
        appointment2.printAppointmentDetails();
        System.out.println("------------------------------");

        // Create a Nurse object
        Nurse nurse1 = new Nurse(3, "Nurse Carol", "Pediatrics", true);

        // Create an appointment with a nurse
        Appointment appointment3 = new Appointment("Chris Johnson", "555-555-5555", "08:30", nurse1);

        // Print the appointment details with nurse
        appointment3.printAppointmentDetails();
        System.out.println("------------------------------");
    }
}
