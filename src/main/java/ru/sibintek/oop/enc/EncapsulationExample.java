package main.java.ru.sibintek.oop.enc;

public class EncapsulationExample {
	// Доступ есть всегда, когда доступен сам класс
	public String publicString;

	// Доступ только в контексте класса
	private String privateString;

	// Доступ в пределах самого класса, классов-наследников и классов пакета
	protected String protectedString;

	// Доступ для самого класса и классов в том же пакете
	String defaultString;

	public EncapsulationExample() {
		publicString = "Its public";
		setPrivateString("Its private");
		protectedString = "Its protected";
		defaultString = "Its default";
		privateMethod();
	}

	public void publicMethod() {
		System.out.println("Oткpытый метод");
	}

	protected void protectedMethod() {
		System.out.println("Зaшишенный метод");
	}

	void defaultMethod() {
		System.out.println("По умолчанию метод");
	}

	private void privateMethod() {
		System.out.println("Закрытый метод");
	}

	public String getPrivateString() {
		return privateString;
	}

	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}
}