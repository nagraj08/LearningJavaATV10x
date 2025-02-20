package Task016Feb25.SuperKeyword;

import Task016Feb25.Inheritance.Inheritance_multilevel.Father;

public class lab_05_MultipleInheritanceSolvedusingInterface {
    public static void main(String[] args) {
        kid k1 = new kid();
        k1.FF();
        k1.MM();
        k1.money();
        k1.FExtra();
        k1.MExtra();

    }
}
class kid implements Mother1, Father1{

    @Override
    public void FF() {
        System.out.println("From Father");
    }

    @Override
    public void money() {
        System.out.println("Only 1 money i.e Same Money");
    }

    @Override
    public void MM() {
        System.out.println("From Mother");
    }

    @Override
    public void MExtra() {
        Father1.super.MExtra();
    }

    @Override
    public void FExtra() {
        Mother1.super.FExtra();
    }
}
interface Mother1{
    void money();
    void MM();
    default void FExtra(){
        System.out.println("I am default from Father Interface");
    }
}
interface Father1{
    void money();
    void FF();
    default void MExtra(){
        System.out.println("I am default from Mother Interface");
    }
}
