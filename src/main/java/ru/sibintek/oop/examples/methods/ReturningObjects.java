package main.java.ru.sibintek.oop.examples.methods;

class Sample {
	int x;

	Sample(int a) {
		x = a;
	}

	Sample MultiplybyTen() {
		Sample obj = new Sample(x * 10);
		return obj;
	}
}

class ReturningObjects {
	public static void main(String[] args) {
		Sample obj = new Sample(100);
		Sample obj1;
		obj1 = obj.MultiplybyTen();
		System.out.println("obj.x=" + obj.x);
		System.out.println("obj1.x=" + obj1.x);
		obj1 = obj1.MultiplybyTen();
		System.out.println("new obj1.x=" + obj1.x);

	}

}