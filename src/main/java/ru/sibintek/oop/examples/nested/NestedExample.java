package main.java.ru.sibintek.oop.examples.nested;

class OuterClass {
	static int outerStaticVar = 10;

	static class NestedStaticClass {
		void display() {
			System.out.println("Static variable from outer class: " + outerStaticVar);
		}
	}
}

public class NestedExample {
	public static void main(String[] args) {
		OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass();
		nested.display(); // Вывод: Static variable from outer class: 10
	}
}

