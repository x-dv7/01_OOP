package main.java.ru.sibintek.oop.examples.inheritence;

abstract class ParentAC {
    //optional
    ParentAC() {
        System.out.println("Parent Constructor called");
    }

    abstract void meth();

    //Abstract class can also have final methods
    final void meth2() {
        System.out.println("final method called");
    }
}

class ChildAC1 extends ParentAC {
    ChildAC1() {
        System.out.println("Child class constructor called");
    }
    @Override
    void meth() {
        System.out.println("abstract method");
    }
}

class AbstractClass1 {
    public static void main(String[] args) {
        ChildAC1 c = new ChildAC1();
        c.meth();
        c.meth2();
        ParentAC p = new ChildAC1();
        p.meth();
        p.meth2();
    }

}