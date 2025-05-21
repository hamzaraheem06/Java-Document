
public class AbstractClass {
    public static void main(String[] args) {
        // Animal animal = new Animal("Yellow", 2); // Cannot instantiate the type Animal

    }
}

// define: Class with an abstract method ( method which is only declared in the class, its implementation is not present in that class. The implementation has to be written by the subclasses that inherit from that abstract class. ) is called abstract class. It can be declared explicitly by using the abstract keyword in the class declaration as abstract class ClassName and then you can declare abstract methods in that class.
// The abstract class is like incomplete class, with missing pieces. The subclasses have to complete those pieces in order to become concrete, else they become abstract too.

// creating an object of an abstract class is a compilation error. Abstract class object can never be instantiated because it is incomplete.

// we can call a Static method using an Abstract class identifier
abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void displayName() {
        System.out.println("I am an animal");
    }

    public abstract void move(); // abstract method
    // define: an abstract method is a special type of method declared with the keyword abstract. It is declared inside an abstract class body, and doesn't have implementation in the abstract class body. The classes that will inherit the abstract class WILL implement this abstract method to become concrete. If they donot implement the abstract method, they MUST also be declared abstract, and later subclass in the heirarchy MUST implement the method, else it is a compilation error.
}

class Pegion extends Animal {
    Pegion(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("The pegion fliess");
    }
}