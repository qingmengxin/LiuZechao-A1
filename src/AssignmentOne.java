public class AssignmentOne {
    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        System.out.println("Creating GeneralPractitioner objects...");

        // Create three GeneralPractitioner objects with parameterized and default constructors
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "General Practice", "8 AM to 6 PM");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob", "General Practice", "9 AM to 5 PM");
        GeneralPractitioner gp3 = new GeneralPractitioner(); // Default constructor

        // Print details of GeneralPractitioner objects
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");

        System.out.println("Creating Nurse objects...");

        // Create two Nurse objects with parameterized and default constructors
        Nurse nurse1 = new Nurse(3, "Nurse Carol", "Pediatrics", true);
        Nurse nurse2 = new Nurse(); // Default constructor

        // Print details of Nurse objects
        nurse1.printDetails();
        System.out.println("------------------------------");
        nurse2.printDetails();
        System.out.println("------------------------------");
    }
}
