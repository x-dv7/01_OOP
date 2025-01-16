package main.java.ru.sibintek.oop.examples.clobj;

public class InstanceInitializersII {
	{ // Нестатический блок инициализации с опережающими ссылками. (1)
		i = j = 10; // (2) Это разрешено.
		int result = this.i * this.j; // (3) i = 10, j = 10.

		System.out.println(this.i); // (4) 10
		System.out.println(this.j); // (5) 10
		System.out.println(this.k); // (6) 50
	}

	// Объявления полей.
	int i; // (7) Объявление поля без инициализирующего выражения.
	int j = 100; // (8) Объявление поля с инициализирующим выражением.
	final int k = 50; // (9) Final поле с константным выражением.
}
