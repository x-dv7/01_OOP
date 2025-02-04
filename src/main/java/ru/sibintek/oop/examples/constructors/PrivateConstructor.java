package main.java.ru.sibintek.oop.examples.constructors;

/**
 * Приватный конструктор
 */
class Person1 {
	private static Person1 name = null;
	public int age = 12;

	// private constructor can't be accessed outside the class
	private Person1() {
	}

	// Factory method to provide the users with instances
	static public Person1 getInstance() {
		// to ensure only one instance is created
		if (name == null)
			name = new Person1();

		return name;
	}
}

class PrivateConstructor {
	public static void main(String args[]) {
		
		Person1 a = Person1.getInstance();
		Person1 b = Person1.getInstance();
		
		a.age = a.age + 10;
		
		System.out.println("Value of a.age = " + a.age);
		System.out.println("Value of b.age = " + b.age);
		// We changed value of a.age, value of b.age also got updated because both ‘a’
		// and ‘b’ refer to same object, i.e., they are objects of a singleton class.
	}
}