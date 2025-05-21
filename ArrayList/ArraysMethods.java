import java.util.Arrays; 
// define: Arrays is a built-in static class that provides common array manipulation methods which include .sort(arr) to sort elements in ascending order, .binarySearch(arr, elem) to search for element in an array (if found returns the index, else -1), .fill(arr, start, end(inclusive), element), and .equals(arr1, arr2) to match contents of two arrays for equality. 

// if the number of elements in arr1 and arr2 are different, the return values will be false always.


public class ArraysMethods {
    public static void main(String[] args) {
        int[] unsortedArray = {12, 3, 4, -12, 2, 5, 6};
        int[] myArr = new int[6];
        // Arrays.copyOfRange(myArr, 0, 9);
        // displayArray(myArr);

        // Arrays.fill(myArr, 7);

        Arrays.sort(unsortedArray);
        displayArray(unsortedArray); // -12   2   3   4   5   6   12 

        // System.out.println(Arrays.binarySearch(unsortedArray, 1, 3, 5));

        System.out.println();

        // the built-in System class has a static method .arraycopy(outArr, outArrPos, inArr, inArrPos, noOfElements) that copies the element of one array into other.
        System.arraycopy(unsortedArray, 0, myArr, 0, unsortedArray.length- 1);


        // System.arraycopy()
        displayArray(myArr); // 0 0 0 -12 2 0 0 

        System.out.println(Arrays.equals(myArr, unsortedArray));; // true
    }

    public static void displayArray(int[] arr) {
        for(int el : arr) {
            System.out.print(el + "   ");
        }
    }
}
