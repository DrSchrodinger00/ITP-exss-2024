// Cat.java
public class Cat extends Animal {

    // Constructor for Cat, utilizing the superclass constructor
    public Cat(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    // Overriding the makeSound method specific to Cat
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }

    // Optionally, override other methods or add new behaviors specific to Cat
}