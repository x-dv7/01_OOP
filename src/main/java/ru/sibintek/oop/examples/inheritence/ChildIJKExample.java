package main.java.ru.sibintek.oop.examples.inheritence;

import main.java.ru.sibintek.oop.examples.inheritenceParents.ParentIJKExample;

public class ChildIJKExample extends ParentIJKExample {
    int k;

    ChildIJKExample(int a, int b, int c) {
        // родителя
//            i = a;
//            j = b;
        k = c;
    }

    void Showk() {
        System.out.println("k=" + k);
    }

}
