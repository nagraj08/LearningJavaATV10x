package Task016Feb25.polymorphism.methodoverloading;

public class lab_01_Overloaidng {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        System.out.println("Sum of "+3+" and " +4+" is "+m1.add(3,4));
        System.out.println("Sum of "+3+"," +4+" and "+5+" is "+m1.add(3,4,5));
        System.out.println("Sum of "+3.5+" and " +4.5+" is "+m1.add(3.5,4.5));

    }
}
