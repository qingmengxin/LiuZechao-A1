public class AssignmentOne {
    public static void main(String[] args) {
        System.out.println("Creating GeneralPractitioner with parameterized constructor...");
        // 创建一个带参数的 GeneralPractitioner 实例
        GeneralPractitioner gp = new GeneralPractitioner(1, "Dr. Alice", "General Practice", true);
        gp.printDetails();  // 打印全科医生的详细信息

        System.out.println("\nCreating Nurse with parameterized constructor...");
        // 创建一个带参数的 Nurse 实例
        Nurse nurse = new Nurse(2, "Nurse Betty", "Pediatrics", true);
        nurse.printDetails();  // 打印护士的详细信息

        System.out.println("\nCreating Nurse with default constructor...");
        // 创建一个带默认构造器的 Nurse 实例
        Nurse nurse2 = new Nurse();
        nurse2.printDetails();  // 打印护士的详细信息
    }
}
