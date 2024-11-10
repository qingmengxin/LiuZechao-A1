public class GeneralPractitioner extends HealthProfessional {
    private String clinicHours; // Clinic hours for General Practitioner

    // Default constructor
    public GeneralPractitioner() {
        super(); // Call the parent class constructor
        this.clinicHours = "9 AM to 5 PM"; // Default clinic hours
    }

    // Parameterized constructor
    public GeneralPractitioner(int ID, String name, String specialty, String clinicHours) {
        super(ID, name, specialty); // Call the parent class constructor
        this.clinicHours = clinicHours; // Initialize clinic hours
    }

    // Overridden method to print details
    @Override
    public void printDetails() {
        super.printDetails(); // Print details from the parent class
        System.out.println("Health Professional Type: General Practitioner");
        System.out.println("Clinic Hours: " + this.clinicHours);
    }

    // Getter and Setter methods for clinicHours
    public String getClinicHours() {
        return clinicHours;
    }

    public void setClinicHours(String clinicHours) {
        this.clinicHours = clinicHours;
    }
}
