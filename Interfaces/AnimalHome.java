

public class AnimalHome {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");

        // console.log: Accessing the abstract method which are implemented in implemented class.
        // dog.eat();
        // dog.move();
        // System.out.println(Dog.MAX_AGE); // Altough we can access MAX_AGE through implemented class, it is adviced to access an interface constant using the Interface they are contained inside.
        // Output:  
        // Tommy is moving.
        // Tommy is eating.
        // 10

        // console.log: Accessing a static interface method.
        // Animal.info(); // Output: This is an animal interface information method.
        // dog.info(); // Error: dog.info() is undefined

        // console.log: Accessing a default interface method.
        // Animal.sound(); // is not valid because it is not a static access method.
        
        // implementation or child class of the interface Animal i.e. Dog can access sound method.
        // dog.sound(); // Output: Animal makes sound.

        // after calling a method inside the sound method
        // Output: 
        // Tommy is moving.
        // Animal makes sound.

        

    }    
}
