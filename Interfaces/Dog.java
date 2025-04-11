//note: in order to make Dog implement the Animal interface we use the key keyword implements after the class declaration followed by interface name(s)

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override 
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving.");
    }
}
