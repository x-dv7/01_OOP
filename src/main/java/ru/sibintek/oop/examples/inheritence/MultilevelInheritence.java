package main.java.ru.sibintek.oop.examples.inheritence;

class A1 {
    A1() {
        System.out.println("A's Constructor");
    }

    void methodA() {
        System.out.println("A's Method");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("B's Constructor");
    }

    void methodB() {
        System.out.println("B's Method");
    }

}

class C1 extends B1 {
    C1() {
        System.out.println("C's Constructor");
    }

    void methodC() {
        System.out.println("C's Method");
    }

}

class MultilevelInheritence {
    public static void main(String[] args) {
        C1 c = new C1();
        c.methodA();
        c.methodB();
        c.methodC();
    }
}