public class Nurse extends HealthProfessional {
    private boolean isRegistered;

    // 默认构造器
    public Nurse() {
        super(); // 调用父类的默认构造器
        this.isRegistered = false; // 默认没有注册
    }

    // 带参数的构造器
    public Nurse(int ID, String name, String specialty, boolean isRegistered) {
        super(ID, name, specialty); // 调用父类的构造器
        this.isRegistered = isRegistered;
    }

    // 重写 printDetails 方法
    @Override
    public void printDetails() {
        super.printDetails(); // 调用父类的 printDetails 方法
        System.out.println("Registered: " + this.isRegistered);
    }

    // Getter 和 Setter 方法
    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }
}
