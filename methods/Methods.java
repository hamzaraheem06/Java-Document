// define: A method is a group of statements that perform one specific task. Altough you can mix two or more functionalities in one method, it is advised to make a method specific to one task which will make it easier to code, debug and test. A method identifier must be self-explaining i.e. it should clearly portray the purpose to its user.

// syntax: accessModifier static(optional) returnType identifier(params) {body}

// a method is used, a more jargon term would be call a method is to use the indentifier followed by parenthesis, and pass arguments if required. 

// syntax: identifier(args);

import java.security.SecureRandom;


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

    // define: In order to understand how Java tracks method calls, we need to understand Stack which is a Last-In-First-Out data structure i.e. the element inserted at the end will be removed first. 
    // take an analogy of dishes pile, you cannot add a dish at last, you have to insert it at the very top of the pile, this is called pushing onto the stack. Similarly, you cannot remove the 2nd bottom dish without removing the dishes at the top of it, i.e. you need to remove the dish at the top of the pile which is inserted at very last, this is called popping off the stack.

    // define: Each entry in this stack is called stack frame, it contains information about something, but mmore importantly it contains the return address which is the address of the function which called this method. So every time, the stack frame (method) returns a value it goes back to the return address i.e. address of the caller method. 
    // The stack frame also do another important function, remember all the local variables and parameters of the method must only exist when the function is under execution, therefore the stack frame is an ideal position to reserve memory for these variables, and as soon as the stack frame pops, the local variables are destroyed from the memory.

    // define: SecureRandom class produces more undeterminent values, unlike Random class whose pattern can be easily be predicted. 

    public static void main(String[] args) {
        SecureRandom rn = new SecureRandom();
        // int randomNumber = rn.nextInt(10, 99); // using overloaded nextInt() method to get random integer values.
        // System.out.println(randomNumber);
        // int[] freq = new int[6];
        // for(int i = 0; i < 60000000; i++) {
        //     freq[rn.nextInt(6)]++;
        // }

        // for (int i = 0; i < freq.length; i++) {
        //     System.out.println(i + 1 + " = " + freq[i]);
        // }

        // Output: 
        // 1 = 9998996
        // 2 = 10004200
        // 3 = 9998602
        // 4 = 9996187
        // 5 = 10005045
        // 6 = 9996970

        // for each value in the domain, there are approximately equal probability of its occurance. which can easily be verified by above ouput.

        
    }

}
