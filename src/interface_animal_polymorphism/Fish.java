package interface_animal_polymorphism;

public class Fish implements Animal {
    @Override
    public void move() {
        System.out.println("Plywa");
    }
}