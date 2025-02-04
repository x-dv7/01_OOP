package main.java.ru.sibintek.oop.examples;
import main.java.ru.sibintek.oop.util.String1;

public class NameConflict {
	public static void main(java.lang.String[] args) {
		//по умолчанию приоритет у класса в том же пакете, над стандартным классом,
		//но если есть import, то приоритет будет у import класса
		//также потенциально классы main.java.ru.sibintek.oop.examples.String и
		//main.java.ru.sibintek.oop.util.String могут импортироваться в другом пакете,
		//в таком случае нужно будет обращаться по полному имени
		String1 string1 = new String1();
		string1.print();
	}		
}
