

public class MethodsTest {
    public static void main(String[] args) {
        Methods mt = new Methods();
        int sum = mt.sum(12, 15); // using Methods object to access its method, using te identifier and passing the required arguments to the sum function. 
        // notice, how we are assigning it to a sum variable, which is called receiving variable because it is recieving a value RETURNED by the sum method in Methods class.
        System.out.println(sum); // OUTPUT: 27

        // accessing a static method
        Methods.sayHello("Hamza"); // OUTPUT: Hello, Hamza! How are you?
        // we are directly using the class identifier to call sayHello() method because it is defined static.

        // define: Math class is commonly used class provided in java api. Math has several useful static methods which is perform different useful mathematical operations. We'll go through most commonly used methods of Math class in the following section.
        // its default constructor is defined private, which restricts other classes to instantiate its object.

        // Math.abs(x) is an overloaded method for all numeric datatypes. It returns the absolute value of a the argument passed to it i.e. | x | = x if x > 0 else -x if x < 0 or simply returns the magnitude of the number without signature.
        System.out.println(Math.abs(-19.25)); // Output: 19.25
        System.out.println(Math.abs(13)); // Output: 13

        // Math.ciel(x) and Math.floor(x) returns the largest and smallest integer to x, respectively.
        System.out.println(Math.ceil(13.1)); // Output: 14
        System.out.println(Math.floor(13.1)); // Output: 13

        // Math.max(x, y) returns max from x and y, Math.min(x, y) returns min from x and y. Similarly, Math.pow(x, y) returns x^y i.e. x raised to y. Math.sqrt(x) returns square root value of x
        // Also, Math has trigonometric methods with the name same as the operation.

        
    }   
}
