

public class FinalThings {
    public static void main(String[] args) {
        
    }
}

// define: final method is a special type of method that cannot be overriden in subclass. It is similar to final variables that do not change after once initialized. Similarly, a final method is a method whose implementation do not change once it is defined. 

// private and static methods are implicitly final, as they are not inherited by the subclass and cannot be overriden.

// define: a final class is class declared with a final keyword, all the members of the final class are final implicitly. e.g. Math

// all the variables and methods are implicitly final.
// this prevents other classes to extend from the final class. i.e. the final class cannot be a superclass. altough, it cannot be extened we can still use final class as composition.


final class Arithmetic {
    Math math;

    public int add(int ...nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public int subtract(int ...nums) {
        int diff = 0;
        for (int i : nums) {
            diff -= i;
        }
        return diff;
    }

    public int multiply(int ...nums) {
        int mul = 1;
        for (int i : nums) {
            mul *= i;
        }
        return mul;
    }

    public double sqrt(double num) {
        return math.sqrt(num);
    }

}