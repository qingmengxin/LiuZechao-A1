public class Appointment {
    private String patientName;
    private String patientMobile;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {
        this.patientName = "";
        this.patientMobile = "";
        this.preferredTimeSlot = "";
        this.selectedDoctor = null; // Doctor is not assigned initially
    }

    // Parameterized constructor
    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Method to print appointment details
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Patient Mobile: " + this.patientMobile);
        System.out.println("Preferred Time Slot: " + this.preferredTimeSlot);

        // Print selected doctor details if available
        if (this.selectedDoctor != null) {
            System.out.println("Selected Doctor: " + this.selectedDoctor.getName());
            System.out.println("Doctor Specialty: " + this.selectedDoctor.getSpecialty());
        } else {
            System.out.println("No doctor selected.");
        }
    }

    // Getter and Setter methods
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}
