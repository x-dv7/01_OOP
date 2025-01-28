package main.java.ru.sibintek.oop.examples.initialization;

class Base {
    protected int a;
    protected int b;

    void print() {
        System.out.println("a: " + a);
    }
}

class AnonymousClassMaker {
    Base createAnonymous() {
        return new Base() { // (1) Анонимный класс (наследник класса Base)
            { // (2) Нестатический блок инициализации
                a = 5;
                b = 10;
            }

            @Override
            void print() {
                super.print();
                System.out.println("b: " + b);
            }
        }; // конец анонимного класса
    }
}

public class InstanceInitBlock {
    public static void main(String[] args) {
        new AnonymousClassMaker().createAnonymous().print();
    }
}
