import java.util.Scanner; // importing the Scanner class

public class BasicsTest {
    // define: BasicsTest is a driver class (that is used to test the functionalites of a class)
    // it contains the main function from where the compiler starts executing a Java application 
    public static void main(String[] args) {
        // Basics obj1 = new Basics(); // creating an object of the defined class Basics
        // define: new keyword is used to instantiate an instance of the class whose constructor (method that creates the actual object of the class) is called followed. It requests the memory to allocate a space for the storage of the object which is to be created by the following constructor.
        // obj1.setName("Hamza"); // using methods of the class using the dot (.) syntax
        // String name = obj1.getName();
        // System.out.println("The name is " + name); //Output: The name is Hamza

        // define: Scanner class is used to read values from the user through different sources. ( we will be using keyboard as source of input mostly)

        // Scanner input = new Scanner(System.in); // here we passed System.in as argument that tells that the standard source i.e. keyboard will provide the values

        // // using the scanner object, input, to read values

        // System.out.print("Enter your name: "); 
        // String name = input.next(); // we are using the .next() method of input object that means that a string value well be input and return to the recieving varible name
    
        // System.out.println(name); 
        // input.nextLine(); // consume the leftover newline character buffer

        // // Output 
        // // Enter your name: Hamza Raheem
        // // Hamza 
        // // note that only Hamza is returned because the defualt delimiter is used i.e. space ' ', which means that the methods terminates here and returns the stored value so far. To get the whole line, use .nextLine() method

        // System.out.print("Enter your name: "); 
        // name = input.nextLine();

        // System.out.println(name);
        // // Output 
        // // Enter your name: Hamza Raheem
        // // Hamza Raheem

        // note: if you now try to run this code without modifying it, it will raise a argument not found error, because we have created a constructor that requires an argument name which we have to pass.

        Basics myObj = new Basics("Hamza", 18);
        System.out.println(myObj.getName() + "Age: " + myObj.getAge()); // Hamza Age: 18


    }
}
