// Animal.java
public class Animal {
    // Basic properties of an animal
    private String name;
    private double height; // in centimeters
    private double weight; // in kilograms
    private String color;

    // Constructor to initialize the animal's properties
    public Animal(String name, double height, double weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Basic operations common to all animals
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Method to make a sound; to be overridden by subclasses
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }

    // Overriding toString() for better representation
    @Override
    public String toString() {
        return String.format("Animal [Name: %s, Height: %.2f cm, Weight: %.2f kg, Color: %s]",
                name, height, weight, color);
    }
}