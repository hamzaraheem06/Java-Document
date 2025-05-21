// There are three types of errors in programs.
// Compilation errors: occur due to syntax error
// Logical error: program produce unexpected error due to the logic of the code
// Runtime error: program breaks during running phase, this is due to Exceptions. 
// define: Exceptions in Java are special type of errors that occur during the program run phase, these type of error break the program i.e. terminate the program. It is an object thrown at runtime.

// These can be ArithmeticException, TypeMismatchException, IOException, etc

// In this section we will learn about these exceptions, along with how to handle them. So that our program doesn't crash midway execution.

// define: Exception handling is a process of handling exception so that the normal flow of our program can be maintained.

public class Exceptions {

    public static double divide(int a , int b) {
        try {
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            return 80085;
        }
    }

    public static void main(String[] args) {
        int[] numerator = {10, 20, 30, 40, 50};
        int[] denominator = {2, 0, 5, 0, 10};

        for (int i = 0; i < numerator.length + 3; i++) {
            try {
            System.out.println(divide(numerator[i], denominator[i]));
        } catch(IndexOutOfBoundsException e1) {
            System.out.println(e1 );
        } 
        }

        System.out.println("Goob bye!");
    }
}
