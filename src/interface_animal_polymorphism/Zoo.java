package interface_animal_polymorphism;

public class Zoo {
    public static void Zoo(String[] args) {
        Animal myDog = new Dog();
        Animal myFish = new Fish();

        makeItMove(myDog); // Wyświetli: Biega
        makeItMove(myFish); // Wyświetli: Pływa
    }

    public static void makeItMove(Animal animal) {
        animal.move();
    }
}