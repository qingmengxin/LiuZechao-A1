public class Nurse extends HealthProfessional {
    private boolean isCertified;

    // Default constructor
    public Nurse() {
        super(); // Call the parent class constructor
        this.isCertified = false; // Default to not certified
    }

    // Parameterized constructor
    public Nurse(int ID, String name, String specialty, boolean isCertified) {
        super(ID, name, specialty); // Call the parent class constructor
        this.isCertified = isCertified;
    }

    // Overridden method to print details
    @Override
    public void printDetails() {
        super.printDetails(); // Print details from the parent class
        System.out.println("Health Professional Type: Nurse");
        System.out.println("Certified: " + (this.isCertified ? "Yes" : "No"));
    }

    // Getter and Setter for isCertified
    public boolean isCertified() {
        return isCertified;
    }

    public void setCertified(boolean isCertified) {
        this.isCertified = isCertified;
    }
}
