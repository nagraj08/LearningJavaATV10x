// Parent class (Super Class)
class Animal {
    void makeSound() {
        System.out.println("Animals make different sounds.");
    }
}

// Child class (Sub Class) - Overrides makeSound() method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Another Child class - Overrides makeSound() method
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls the method from Animal class

        Animal myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method from Dog class

        Animal myCat = new Cat();
        myCat.makeSound(); // Calls the overridden method from Cat class
    }
}
