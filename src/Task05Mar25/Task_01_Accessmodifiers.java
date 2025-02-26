package Task05Mar25;

// Another Class in the Same Package
public class Task_01_Accessmodifiers {
    public static void main(String[] args) {
        Parent parent = new Parent();

        // System.out.println(parent.privateVar);  Not accessible (private)
        System.out.println(parent.defaultVar);   //  Accessible (same package)
        System.out.println(parent.protectedVar); //  Accessible (same package)
        System.out.println(parent.publicVar);    //  Accessible (public)

        // parent.privateMethod();  Not accessible (private)
        parent.defaultMethod();   //  Accessible (same package)
        parent.protectedMethod(); //  Accessible (same package)
        parent.publicMethod();    //  Accessible (public)

        parent.accessPrivateMethod(); //  Can access private method indirectly

        System.out.println("\n--- Accessing from Child Class ---");
        Child child = new Child();
        child.display(); // Calls the child's method to access Parent's variables/methods
    }
}
// Superclass (Parent Class)
class Parent {
    private String privateVar = "Private Variable";   // Accessible only within Parent class
    String defaultVar = "Default Variable";          // Accessible within the same package
    protected String protectedVar = "Protected Variable"; // Accessible in same package & subclasses
    public String publicVar = "Public Variable";     // Accessible everywhere

    // Method to access private variable within the same class
    private void privateMethod() {
        System.out.println("Private Method: " + privateVar);
    }

    void defaultMethod() {
        System.out.println("Default Method: " + defaultVar);
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: " + protectedVar);
    }

    public void publicMethod() {
        System.out.println("Public Method: " + publicVar);
    }

    // Method to call privateMethod (Since private methods are not directly accessible)
    public void accessPrivateMethod() {
        privateMethod();  // Calling private method inside the same class
    }
}

// Subclass (Child Class) in the Same Package
class Child extends Parent {
    void display() {
        // System.out.println(privateVar);  Not accessible (private)
        System.out.println(defaultVar);   //  Accessible (same package)
        System.out.println(protectedVar); // Accessible (inherited)
        System.out.println(publicVar);    // Accessible (public)

        // privateMethod();  Not accessible (private)
        defaultMethod();   //  Accessible (same package)
        protectedMethod(); // Accessible (inherited)
        publicMethod();    //  Accessible (public)
    }
}

