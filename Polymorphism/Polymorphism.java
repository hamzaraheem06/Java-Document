// polymorphism means different shapes. It means that each object of a inheritence heirchy structure knows what "right thing to do" in response to same method call to each object

public class Polymorphism {
    public static void main(String[] args) {
        // uisng the polymorphism
        Animal[] animals = new Animal[5];
        animals[0] = new Frog("Frog 1", 1);
        animals[1] = new Fish("Frish", 2);
        animals[2] = new Fish("Frish 2", 2);
        animals[3] = new Bird("Briddd", 1);
        animals[4] = new Frog("Frong 2", 1);


        animals[3].move(); // here the fourth reference knows what method implementation of move to be executed.

        // note: When a superclass variable contains a reference to a subclass object, and that reference is used to call a method, the subclass version of the method is called, as we have seen in this example as well.

        // note: altough the the superclass can have reference to subclass reference. WE can only call the subclass-only methods after downcasting the the reference to the subclass datatype. Always do the downcasting using conditional system and checking instanceof .

        // for (Animal animal : animals) {
        //     animal.move(); // using parent reference i.e Animal to call the method .move(), each reference in the animal array, holds a reference to a child object. 

        //     // on calling move method on each object, the respective subclass implementation is called. 
        //     // i.e. the object knows what implementation to run.
        // }

        // OUTPUT: 
        // Frog jumps 4 feets.
        // Fish swims 3 feets.
        // Fish swims 3 feets.
        // Bird flies 8 feets.
        // Frog jumps 4 feets.
    }
}

// creating an example where we create a inheritence heirarchy of animal with different animal species
// there is a move method in each subclass, but each with their own implementation.
class Animal {
    String name;
    int age;

    Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {}
}

class Frog extends Animal {
    Frog(String name, int age) {
        super(name, age);
    }

    public void move() {
        System.out.println("Frog jumps 4 feets.");
    }
}

class Fish extends Animal {
    Fish(String name, int age) {
        super(name, age);
    }

    public void move() {
        System.out.println("Fish swims 3 feets.");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    public void move() {
        System.out.println("Bird flies 8 feets.");
    }
}