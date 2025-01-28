package main.java.ru.sibintek.oop.examples.initialization;

public class InstanceInitializers {
	long[] squares = new long[10]; // (1)
	// ...
	{ // (2) Нестатический блок инициализации
		for (int i = 0; i < squares.length; i++)
			squares[i] = i * i;
	}
	// ...
}
