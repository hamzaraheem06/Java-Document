public class VarArgs {

    // define: The ... syntax in Java is used to define varargs (variable-length arguments). It allows you to pass a variable number of arguments of the same type to a method. This is useful when you don't know in advance how many arguments will be passed.

    // syntax: dataType ...varName ==> The varName is then treated as an array of _dataType_   varName[] of dataType;

    // accessed like an array.

    // note: a method can only have one varargs parameter, and that will be at the last of the parameter list.
     public float getAverage(int... num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        return (float) (sum / num.length);
    }

    public static void main(String[] args) {
        VarArgs vArgs = new VarArgs();
        // using the method with varargs parameter, you can see we are using different number of parameters every time
        System.out.println(vArgs.getAverage(1, 3, 4, 4)); // 3.0

        System.out.println(vArgs.getAverage(1, 3, 4, 2, 4, 2, 4,22, 2, 32)); // 7.0
    }
}
