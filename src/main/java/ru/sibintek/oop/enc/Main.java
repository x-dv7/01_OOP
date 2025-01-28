package main.java.ru.sibintek.oop.enc;

public class Main {
	public static void main(String[] args) {
		EncapsulationExample enc = new EncapsulationExample();
		
		System.out.println("Атрибут пакета defaultString = " + enc.defaultString);
		System.out.println("Защищенный атрибут protectedString = " + enc.protectedString);
		enc.protectedString = "Protected changed";
		System.out.println("Защищенный атрибут protectedString = " + enc.protectedString);
	}
}
