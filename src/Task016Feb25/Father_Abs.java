package Task016Feb25;

public class Father_Abs {
    public static void main(String[] args) {
        child c = new child();
        c.loan50k();
        c.loan25k();
    }
}

abstract class fatherLoan{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Given loan of 25k ");
    }

}
class child extends fatherLoan{
    @Override
    void loan50k() {
        System.out.println("Given loan of 50k");
    }
}