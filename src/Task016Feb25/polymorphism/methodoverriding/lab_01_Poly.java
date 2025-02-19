package Task016Feb25.polymorphism.methodoverriding;

import Task016Feb25.Inheritance.Inheritance_Hierarchical.Nagraj;

public class lab_01_Poly {
    public static void main(String[] args) {
        SonPloy nb = new SonPloy();
        nb.home();
        nb.N1();
        FatherPoly vb = new FatherPoly();
        vb.home();
        vb.f1();
        FatherPoly vb2 = new SonPloy();//Dynamic Dispatch
        vb2.home();// method overriding - ridden the father method

    }
}
