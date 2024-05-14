package lambda;

public class ItStudent implements Student{

    @Override
    public void sayHello(String name) {
        System.out.println("I am It guy");
        System.out.println("My name is " + name);
    }
}
