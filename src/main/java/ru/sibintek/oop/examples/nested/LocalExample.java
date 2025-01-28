package main.java.ru.sibintek.oop.examples.nested;

class OuterClass3 {
    void outerMethod() {
		final int localVar = 20;

        class LocalClass {
            void display() {
                System.out.println("Local variable: " + localVar);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.display(); // Вывод: Local variable: 20
    }
}

public class LocalExample {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        outer.outerMethod();
    }
}
