public class HealthProfessional {
    private int ID;
    private String name;
    private String specialty;

    // Default constructor
    public HealthProfessional() {
        this.ID = 0;
        this.name = "";
        this.specialty = "";
    }

    // Parameterized constructor
    public HealthProfessional(int ID, String name, String specialty) {
        this.ID = ID;
        this.name = name;
        this.specialty = specialty;
    }

    // Print health professional details
    public void printDetails() {
        System.out.println("Health Professional Details:");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.name);
        System.out.println("Specialty: " + this.specialty);
    }

    // Getter and Setter methods
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
