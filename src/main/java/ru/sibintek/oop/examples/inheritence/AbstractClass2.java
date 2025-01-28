package main.java.ru.sibintek.oop.examples.inheritence;

abstract class Parent2 {
    void meth() {
        System.out.println("No abstract method");
    }
}

class ChildAC extends Parent2 {

}

class AbstractClass2 {
    public static void main(String[] args) {
        ChildAC c = new ChildAC();
        c.meth();
    }
}