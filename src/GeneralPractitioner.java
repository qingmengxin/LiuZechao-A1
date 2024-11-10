public class GeneralPractitioner extends HealthProfessional {
    private boolean acceptsNewPatients;

    // 默认构造器
    public GeneralPractitioner() {
        super(); // 调用父类的默认构造器
        this.acceptsNewPatients = false;
    }

    // 带参数的构造器
    public GeneralPractitioner(int ID, String name, String specialty, boolean acceptsNewPatients) {
        super(ID, name, specialty); // 调用父类的带参数构造器
        this.acceptsNewPatients = acceptsNewPatients;
    }

    // 重写 printDetails 方法
    @Override
    public void printDetails() {
        super.printDetails(); // 调用父类的 printDetails 方法
        System.out.println("Accepts New Patients: " + this.acceptsNewPatients);
    }

    // Getter 和 Setter 方法
    public boolean isAcceptsNewPatients() {
        return acceptsNewPatients;
    }

    public void setAcceptsNewPatients(boolean acceptsNewPatients) {
        this.acceptsNewPatients = acceptsNewPatients;
    }
}
