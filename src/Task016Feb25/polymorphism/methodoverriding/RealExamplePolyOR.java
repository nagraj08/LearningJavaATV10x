package Task016Feb25.polymorphism.methodoverriding;

public class RealExamplePolyOR {
    public static void main(String[] args) {
    TC1 t1 = new TC1();
    t1.openBrowser();
    TC2 t2 = new TC2();
    t2.openBrowser();
    }
}
class COMMONTOALL {
    void openBrowser() {
        System.out.println("Open the Browser in 5sec");
    }
}
class TC1 extends COMMONTOALL{
    void start(){
        openBrowser();
    }
}
class    TC2 extends COMMONTOALL{
    @Override
    void openBrowser() {
        System.out.println("Open the browser in 2sec");;
    }
}

