package Task016Feb25.SuperKeyword;

public class lab_03_Interface {
    public static void main(String[] args) {
        carInterface c1 = new carInterface();
        c1.drive();

    }
}
class carInterface implements Engine1,brakes{
    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

    @Override
    public void applybrakes() {
        System.out.println("Apply brakes");
    }

    void drive(){
        startEngine();
        applybrakes();
        stopEngine();
        test();
    }
}
interface Engine1{
    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("concrete complete");
    }
}
interface brakes{
    void applybrakes();
}
