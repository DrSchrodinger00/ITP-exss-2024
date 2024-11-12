// Dog.java
public class Dog extends Animal {

    // Constructor for Dog, utilizing the superclass constructor
    public Dog(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    // Overriding the makeSound method specific to Dog
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Bark!");
    }

    // Optionally, override other methods or add new behaviors specific to Dog
}