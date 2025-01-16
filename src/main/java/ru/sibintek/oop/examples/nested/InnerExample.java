package main.java.ru.sibintek.oop.examples.nested;

class OuterClass2 {
	private int outerVar = 5;

	class InnerClass {
		void display() {
			System.out.println("Variable from outer class: " + outerVar);
		}
	}
}

public class InnerExample {
	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		OuterClass2.InnerClass inner = outer.new InnerClass();
		inner.display(); // Вывод: Variable from outer class: 5
	}
}
