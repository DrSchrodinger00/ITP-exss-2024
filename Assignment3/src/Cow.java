// Cow.java
public class Cow extends Animal {

    // Constructor for Cow, utilizing the superclass constructor
    public Cow(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    // Overriding the makeSound method specific to Cow
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Moo!");
    }

    // Optionally, override other methods or add new behaviors specific to Cow
}