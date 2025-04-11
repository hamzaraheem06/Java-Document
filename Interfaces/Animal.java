// define: Interfaces in java are a blueprint for a class (class is a blueprint for an object). 

// These contain only abstract methods and static constants, by default these are all public.

// interfaces allow us to acheive multiple inheritance i.e. a subclass inherit functionalities of more than one superclass. 

// note: by core requirements of interfaces, the interface can only have abstract methods. However, in the newer versions of Java, we can also have concrete methods in an interface. 

// by default a method in interface is public abstract. However, if we explicitly type it JVM will point that the following modifier declaration is redundant;

// interfaces also have static constants i.e. public static final. We don't have to mention it explicitly;

public interface Animal {
    int MAX_AGE = 10; // implicity it is: public static final MAX_AGE = 10;

    public abstract void move(); // altough we are not getting a redundant popup in VS Code, you will encounter in Java Specific IDEs. 
    
    void eat(); // standard declaration of method in interface

    // define: an interface can also have static methods. These are special methods that can be accessed using the interface identifier. This is because the static methods are created for class, or in this case interface, rather than for an instance of class i.e. object. Therefore, we are able to create a static method in an interface.

    static void info() {
        System.out.println("This is an animal interface information method."); // please see its output in AnimalHome.java
    }
    // note: However, these methods are not inherited by the implementation class. These are contained only in the interface they are defined in.

    // define: an interface can also have default methods: These are concrete methods that are inherited by the implementation classes. Since we cannot define body of an abstract method, we use the keyword default with the method declaration to make it default method. We can define the body of a default method inside an interface. 
    
    default void sound() {
        this.move();
        System.out.println("Animal makes sound.");
    }
    // note: These are defined for the object of implemented class.
    // we can other interface methods inside a default method, unless the called method is static. This is due to statement we wrote just above this line. We will access the methods for the object using this keyword.
}
