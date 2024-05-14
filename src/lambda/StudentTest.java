package lambda;

public class StudentTest {

    public static void main(String[] args) {
    // Sposoby na ...
        // 1. Użycie klasy nadpisującej metodę z Interfejsu
        Student it = new ItStudent();
        //it.sayHello("jan"); już jest nadpisany metodą z jednym parametrem
        sayHello("John", it);

        // 2. Użycie klasy anonimowej na podstawie Studenta
        Student med = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
            }
        };
        sayHello("Kate", med);

        // 3 Lambda - skrócenie powyższych zapisów, opiera się na interfejsie
        // (parametr) -> System.out.println("to jest wykonana metoda" + parametr)
        // Silnik wie że nadpisujemy jedyną metodę w Interfejsie i dla tego to działa
        Student noStudent = (name) -> System.out.println("I am no student, my name is " + name);
        sayHello("Tom", noStudent);
    }
    public static void sayHello(String name, Student student) {
        student.sayHello(name);
    }
}
