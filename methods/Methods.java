// define: A method is a group of statements that perform one specific task. Altough you can mix two or more functionalities in one method, it is advised to make a method specific to one task which will make it easier to code, debug and test. A method identifier must be self-explaining i.e. it should clearly portray the purpose to its user.

// syntax: accessModifier static(optional) returnType identifier(params) {body}

// a method is used, a more jargon term would be call a method is to use the indentifier followed by parenthesis, and pass arguments if required. 

// syntax: identifier(args);

public class Methods {
    public int sum(int a, int b) {
        return a+b;
    } // please goto MethodsTest.java for its usage

    // define: Static methods are special methods that are declared with the keyword static. These methods are also called class methods because they can be accessed using the class identifier without creating an instance of the class i.e. object of the class.
    // please note that since instance variables are object's attributes they cannot be accessed inside a static method. Also, other methods which are not declared static are also not callable inside a static method's body because simple, they are defined for the object of class not the class itself ans isnce we have not created the object of the class in this case we cannot access them.

    public static void sayHello(String name) {
        System.out.println("Hello, "+ name + "! How are you?");
    } // please goto MethodsTest.java for its usage

    // define: static variables are variables which are class variables i.e. they are initialised and maintained by the class rather than objects of class. Each of the class objects use the same value of static variable. 
    // These are useful when you want to create a global varialbe inside a class, for a counter perhaps.

    // Math class has two static constants these are PI, and E which are important mathematical constants.

    
}
