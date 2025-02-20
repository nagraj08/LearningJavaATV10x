package Task016Feb25.SuperKeyword;

public class lab_04_Interface {
    public static void main(String[] args) {
        P p = new P();
        p.icm1();
        p.icm2();

    }
}
class P implements T1{
    @Override
    public void icm1() {
        System.out.println("ICM1 completed");
    }

    @Override
    public void icm2() {
        System.out.println("ICM2 completed");
    }
}
interface T1{
    void icm1();
    void icm2();
}
interface T2{
    void icm3();
}
