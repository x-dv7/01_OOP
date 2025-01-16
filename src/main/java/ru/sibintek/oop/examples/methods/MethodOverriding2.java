package main.java.ru.sibintek.oop.examples.methods;

class Parent2 {
    int i, j;

    Parent2() {

    }

    Parent2(int a, int b) {
        i = a;
        j = b;
    }

    protected void Showij() {
        System.out.println("A's i=" + i);
        System.out.println("A's j=" + j);
    }
}

class Child2 extends Parent2 {
    int k;

    Child2(int a, int b, int c) {
        i = a;
        j = b;
        k = c;
    }

    public void Showij() {
        System.out.println("B's i=" + i);
        System.out.println("B's j=" + j);

    }

    void Showk() {
        System.out.println("k=" + k);
    }
}

/**
 * SingleInheritence
 */
class MethodOverriding2 {
    public static void main(String[] args) {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // Showij is called
    	Parent2 obj = new Parent2(20, 30);
        obj.Showij();
        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.

        Parent2 obj1 = new Child2(12, 45, 78);
        obj1.Showij();
        Child2 subobj = new Child2(5, 10, 15);
        subobj.Showij();
        subobj.Showk();
    }
}