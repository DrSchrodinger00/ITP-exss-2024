
// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating instances of each animal
        Animal genericAnimal = new Animal("GenericAnimal", 50.0, 30.0, "Gray");
        Cow cow = new Cow("Bessie", 150.0, 500.0, "Black and White");
        Cat cat = new Cat("Whiskers", 25.0, 4.5, "Calico");
        Dog dog = new Dog("Rex", 60.0, 20.0, "Brown");

        // Array of animals for easy iteration
        Animal[] animals = {genericAnimal, cow, cat, dog};

        // Demonstrating basic operations
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            animal.sleep();
            animal.makeSound();
            System.out.println(); // For better readability
        }
    }
}
