package main.java.ru.sibintek.oop.examples.inheritence;

class ParentIJK {
    protected int i, j;

    //требуется объявить конструктор класса родителя или явно вызвать нужный конструктор
	protected ParentIJK() {
    }

	protected ParentIJK(int a) {
        this.i = a;
    }

	protected ParentIJK(int a, int b) {
        this.i = a;
        this.j = b;
    }

    void Showij() {
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }
}

class ChildIJK extends ParentIJK {
    protected int k;

	ChildIJK(int a, int b, int c) {
		super(a); // если нет конструктора без параметров, то требуется вызвать нужный коструктор
        // родителя
//        this.i = a;
        this.j = b;
        this.k = c;
    }

    void Showk() {
        System.out.println("k=" + k);
    }
}

/**
 * SingleInheritence
 */
public class SingleInheritence {
    public static void main(String[] args) {
        // when an object of B class is created, a copy of the all methods and fields of
        // the superclass acquire memory in this object. That is why, by using the
        // object of the subclass we can also access the members of a superclass.
        // During inheritance only object of subclass is created, not the superclass
		ChildIJK subobj = new ChildIJK(5, 10, 15);
        subobj.Showij();
        subobj.Showk();
    }

}