package main.java.ru.sibintek.oop.examples.nested;


abstract class AbstractClass {
    abstract void display();
}

public class AnonymousExample {
    public static void main(String[] args) {
        AbstractClass anonymousClass = new AbstractClass() {
            void display() {
                System.out.println("Hello from anonymous class!");
            }
        };

        anonymousClass.display(); // Вывод: Hello from anonymous class!
    }
}