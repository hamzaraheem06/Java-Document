// import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// note: Arrays once defined donot change their size. This problem is solved using ArrayList collection ( storage of related data objects) class. 

// define: ArrayList is just like an array of Classes but it can change its size during runtime. Moreover, it has several built-in methods which are very useful. 

public class LearningArrayList {
    public static void main(String[] args) {
        // syntax: declaring an ArrayList
        // ArrayList<Datatype/Class> identifier = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>(); 

        // ArrayList is a generic class i.e. class that can be used with any type of data. 
        // note: only reference types can be used to create an object of generic class.

        // in order to create a generic object of primitive datatype we have to use their wrapper class e.g. Integer for int,, Long for long, Character for char, etc

        // define: Methods of ArrayList class

        // syntax: to add an element to list .add(elem), .add(index, elem)

        names.add("Hamza"); // add element to the end of the list
        names.add(0 , "Ayesha" ); // adds element to a specific index

        // System.out.println(names); // [Ayesha, Hamza]

        // syntax: to remove all the elements .clear();

        // names.clear();

        // System.out.println(names); // []

        // syntax: existential question .contains(obj); returns true if the list contains *obj* else false

        // System.out.println(names.contains("Hamza")); // true
        // System.out.println(names.contains("Dogesh")); // false

        // syntax: to retreive an element from a specific index .get(index)

        // names =  [Ayesha, Hamza]
        // System.out.println(names.get(1)); // Hamza 

        // syntax: indexOf(elem) returns the index of the first occurance of *elem* in the list, if not present returns -1

        // System.out.println(names.indexOf("Ayesha")); // 0
        // System.out.println(names.indexOf("Dogesh")); // -1

        // syntax: to remove an element from a list. .remove(elem) or .remove(index)
        
        // names.remove("Ayesha");
        // System.out.println(names); // [Hamza]

        // names.removeAll(list) removes all the elements of list from names list

        // if you want to remove the first occurance of 0, i.e. in the ArrayList<Integer> we have to explicitly provide the Integer wrapper of 0. 

        // .remove(0) will always remove the element at index 0, to remove first occurance of 0, use .remove(Integer.valueOf(0));

        // syntax: to filter a list .removeIf(callback function as in javascript) 
        // if you don't know javascript, you suckkkkkk.

        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 5, 323, 12, 4, 5, 77, 35, 23, 57));

        nums.removeIf( num -> (
            num % 2 == 0)
            ); // like in javascript, if you use curly braces {} you will have to explicitly return, if you use parenthesis (), it will implicitly return 

        // System.out.println(nums);

        // syntax: boolean addAll(Collection<? extends E> c): Appends all elements from the specified collection.

        // syntax:  boolean removeAll(Collection<?> c): Removes all elements in the specified collection.
        
        // syntax:  boolean retainAll(Collection<?> c): Retains only the elements in the specified collection.


        // syntax: to sort an arraylist list.sort()

        nums.sort(Comparator.naturalOrder()); // for ascending order

        System.out.println(nums);         // [1, 5, 5, 23, 35, 57, 77, 323]

        nums.sort(Comparator.reverseOrder()); // for reverse order

        System.out.println(nums);         // [323, 77, 57, 35, 23, 5, 5, 1]

        nums.sort( (Integer n1, Integer n2) -> {
            return Integer.compare(n1, n2); // for ascending 
            // for descending Integer.compare(n2, n1);
        });

        System.out.println(nums);
    }

}
