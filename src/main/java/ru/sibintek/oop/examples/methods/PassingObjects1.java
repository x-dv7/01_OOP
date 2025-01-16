package main.java.ru.sibintek.oop.examples.methods;

class Example {
	int a;

	Example(int i) {
		a = i;
	}
}

public class PassingObjects1 {
	public static void main(String[] args) {

		Example obj = new Example(100);
		change(obj);
		System.out.println("a=" + obj.a);
	}

	static void change(Example obj1) {
		obj1 = new Example(10);
	}

}