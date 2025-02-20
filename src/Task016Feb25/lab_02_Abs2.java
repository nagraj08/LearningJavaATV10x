package Task016Feb25;

public class lab_02_Abs2 {
    public static void main(String[] args) {
        WagonR w = new WagonR();
       // w.startengine();
        w.drive();
        //w.stopengine();
    }
}
abstract class engine{
    abstract void startengine();
    abstract void stopengine();

}

class WagonR extends engine{

    @Override
    void startengine() {
        System.out.println("Start");
    }

    @Override
    void stopengine() {
        System.out.println("Stop");
    }
    void drive(){
        startengine();
        System.out.println("I am driving");
        stopengine();
    }
}