package main.java.ru.sibintek.oop.examples.methods;

class MOParent3 {
    int i, j;

    MOParent3() {

    }

    MOParent3(int a, int b) {
        i = a;
        j = b;
    }

    void Showij() {
        System.out.println("A's i=" + i);
        System.out.println("A's j=" + j);
    }
}

class MOChild3 extends MOParent3 {
    int k;

    MOChild3(int a, int b, int c) {
        i = a;
        j = b;
        k = c;
    }

    void Showij() {
        super.Showij();
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
class MethodOverriding3 {
    public static void main(String[] args) {
    	MOParent3 obj1 = new MOChild3(12, 45, 78);
        obj1.Showij();
        MOChild3 subobj = new MOChild3(5, 10, 15);
        subobj.Showk();
    }
}
