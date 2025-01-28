package main.java.ru.sibintek.oop.examples.inheritenceParents;

public class ParentIJKExample {
    int i, j;

    //требуется объявить конструктор класса родителя или явно вызвать нужный конструктор
    protected ParentIJKExample() {

    }

    protected ParentIJKExample(int a) {
        i = a;
    }

    protected ParentIJKExample(int a, int b) {
        i = a;
        j = b;
    }

    void Showij() {
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }
}
