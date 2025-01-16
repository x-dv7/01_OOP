package main.java.ru.sibintek.oop.examples.inheritence;

class A2 {
	int i, j;

//требуется объявить конструктор класса родителя или явно вызвать нужный конструктор
	A2() {

	}
	
	A2(int a) {
		i = a;
	}

	A2(int a, int b) {
		i = a;
		j = b;
	}

	void Showij() {
		System.out.println("i=" + i);
		System.out.println("j=" + j);
	}
}

class B2 extends A2 {
	int k;

	B2(int a, int b, int c) {
//		super(a); // если нет конструктора без параметров, то требуется вызвать нужный коструктор
		// родителя
		i = a;
		j = b;
		k = c;
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
		B2 subobj = new B2(5, 10, 15);
		subobj.Showij();
		subobj.Showk();
	}

}