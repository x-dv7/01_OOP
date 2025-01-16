package main.java.ru.sibintek.oop.examples.methods;

class Parent {
    int i, j;

    Parent() {

    }

    Parent(int a, int b) {
        i = a;
        j = b;
    }

    void Showij() {
        System.out.println("A's i=" + i);
        System.out.println("A's j=" + j);
    }
}

class Child extends Parent {
    int k;

     Child(int a, int b, int c) {
        i = a;
        j = b;
        k = c;
    }

    void Showij() {
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
class MethodOverriding1 {
    public static void main(String[] args) {
        //If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // Showij is called 
    	Parent obj=new Parent(20,30);
        obj.Showij();
        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.

        Parent obj1=new Child(12,45,78);
        obj1.Showij();
        Child subobj=new Child(5,10,15);
        subobj.Showij();
        subobj.Showk();
    }
}
