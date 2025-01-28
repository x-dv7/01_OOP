package main.java.ru.sibintek.oop.examples.inheritence;

class ParentHier {
    ParentHier() {
        System.out.println("ParentHier's Constructor");
    }

    void methodA() {
        System.out.println("ParentHier's Method");
    }
}

class Child1 extends ParentHier {
    Child1() {
        System.out.println("Child1's Constructor");
    }

    void methodB() {
        System.out.println("Child1's Method");
    }
}

class Child2 extends ParentHier {
    Child2() {
        System.out.println("Child2's Constructor");
    }

    void methodC() {
        System.out.println("Child2's Method");
    }

}

/**
 * HierarchicalInheritance
 */
class HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 b = new Child1();
        b.methodA();
        b.methodB();
        Child2 c = new Child2();
        c.methodA();
        c.methodC();
    }
}