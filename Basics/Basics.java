// define: class is a user-defined data type, it has two types of members i.e. attributes  and methods

//  Attributes: variables that contain information about the thing which the class is about e.g. an Animal class can have attributes name(stores name of animal), age (stores age of the animal), ownerName (stores its owner name), etc. These can be of built-in types as well as customly-user-defined classes

//  Methods: These are functions that are used to manipulate the attributes of the class. These are functions that are specific to the class, generally if not defined static (will discuss later). 

// The following syntax has to be followed to define a class in Java

// syntax: accessSpecifier class ClassName {// body of the class}

    // define: Access specifiers are keywords that define the scope of access of the element (class, attribute, method). These are private, public, protected and default

    // - private: these are accessible to only class itself, nor its children (children is a class that inherits from a class, Inheritance will discuss later) or any other identity can acess this. These elements are used only inside the class they are defined in. generally, attributes are defined private to stimulate encapsulation (hidding data, will discuss later)
    
    // - public: these elements can be access by anyone, subclassess (child classes), other classes, other classes' method, anyone can access these. Generally, methods are defined with public access specifier, because method provide inferface to the class, they are used to perform CURD operations on the attributes of the class

    // - protected: these elements are only accessed within the class they are defined in and subclass (child class). The attributes declared with protected specifier are generally defined in base classes (classes that are not used directly but they act as a base for other classes that inherit from it. e.g. User class, it acts as a base class for, if we building a school management system, Student, Teacher, Faculty, Staff, etc). 

    // define: class is a keyword that indicates that a class is being defined in following section

    // define: className is the name of the class, it can be any valid identifier, Java prefers that each class is defined with an Uppercase intial and camel case 

public class Basics { // declaration of class, public is an access specifier
    // note: each java file has one public class with name exactly same as the file name, i.e. Basics in this case.: If there are more than one classes in a file, the other classes must not be defined public otherwise JVM will raise linking error.

    // defining an attribute
    // syntax: accessSpecifer dataType attrName;
    
    private String name;
    private int age;
    // the attributes are also called instance variables, because each object (variable of the class) has its own independent instance of this attribute

    // defining a method
    // syntax: accessSpecifier static(optional) returnType methodName(params) {body of the function}
    // if you are studying oops you must know all the terms used here except the static.
    // define: static keyword is used to define a static method, i.e. a special method that you can access without creating an object of the class. We can directly call it using class identifier. 

    // note: a static method can only access a static attribute, and can only call static methods; call or access of non-static members will raise an error;

    public void setName(String name) {
        this.name = name;
    }
    // in setName method the name is a local variable, i.e. it is only defined and access insdide this function only, when the function terminates it is deleted from the memory.

    public void setAge(int age) {
        if (age < 0){ // validating the value before assigning it to the instance variable.
            System.out.println("Invalid assignment of age. age is set to default 0.");
            this.age = 0;
            return;
        }

        this.age = age;
    }

    // note: shadowing is the concept in which the local variable name conflicts with the instance varialbe i.e. they are both same, in this case the compiler gives the preference to the local variable. To access the instance variable in this case we use this keyword

    // define: this keyword gives use the reference of the current calling object i.e. instance (object) of the Basics class. Through this reference we can access all the members of the class, if they are not defined private 
    // please note that we can directly access the private members when we coding inside the class in which they are defined. 

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // please go to the BasicsTest.java before moving further

    // define: variables defined with private access modifeirs are hidden from other clients (other classes). This concept is called encapsulation. 
    // e.g. in the context of Basics class, when an object of Basics class is created. The private data field name is hidden (encapsulated) from all other classes and is only visible to the methods of the class it is defined in.

    // using constructor to intialize the instance variables.
    // define: constructors are special methods of a class with same exact name as that of class that are called when the object of the class is to be created. Infact, these are the methods that are required by the JVM to create an object of a class. These methods can also have parameters, which can be used to intialize the data fields of the class. Hence, these are an ideal position of initialization of data fields when creating an object.
    // note: a constructor cannot return values, therefore, it cannot have a return type in its declaration. <<NOT EVEN VOID>>

    public Basics(String name, int age) { 
        setName(name); // good programming practice to validate an updation of field using setter methods
        setAge(age);
    }
    
    // so Basics() is a constructor which is called when an object of Basics class is created.
    // note: By default, a default constructor is implicitly called iff we have not defined any other constructor. This is Basics() {//empty body}. Since we have declared a constructor, it is a must for us to use it when we create an object of Basics class, until and unless we explicity create a default constructor.

    // please go to the BasicsTest.java

    // Theoratically, you can have infinite many constructors in a class, provided that you have infinite many different combinations of parameters. So that each distinct constructor is called when a distinct combination of parameters is passed to it. This is called Constructor overloading.

    // define: PRIMITIVE DATATYPES VS. REFERENCE DATATYPES

    // primitive datatypes that hold an actual value e.g. an integer, boolean values, numbers, and as exception in Java, String value. These directly hold a literal values which are immutable (i.e. the VALUE cannot change). These are int, float, double, boolean, String, char, etc. These are created in stack memory.

    // Reference datatypes hold a reference to the value in memory rather than a literal value. These are of varying-memory lenght, so they are created in heap memory and their reference is stored in stack memory. 

    // Primitive can hold exactly one value at a time, while reference can hold multiple primitive and/or reference values at a time.

    // note: when using these mentioned category variables, keep in mind that if they are local they will not be instantiated by default. 
    // however, if these are used as instance variables, they will be instantiated to their default values when the constructor is called. The default values for primitives are int 0, double 0.0, bool false, etc. For reference datatypes, the default is null. null indicates that the variable references to nothing.


}