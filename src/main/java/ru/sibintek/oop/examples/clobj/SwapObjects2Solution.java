package main.java.ru.sibintek.oop.examples.clobj;

//A java Program to demostrate wrapper class to swap objects of a car
class Box6 {
	int no;
	float length;
	float depth;
	float width;

	Box6(int n, float l, float d, float w) {
		no = n;
		length = l;
		depth = d;
		width = w;
	}

	void characteristics() {
		System.out.println("Box6 Number:" + no + " Length:" + length + " Depth:" + depth + " Width:" + width);
	}
}

//Wrapper class
class Box6Wrapper {
	Box6 myBox;

	Box6Wrapper(Box6 obj) {
		myBox = obj;
	}
}

/**
 * SwapObjects2Solution
 */
public class SwapObjects2Solution {
	// копия ссылки на wrapper, но когда мы присваеваем новую ссылку в поле, то меняется сам обект wrapper 
	// так как myBox1 ссылается на тот же объект что и переданная ссылка Box6w1, аналогично для myBox2/Box6w2
	public static void swap(Box6Wrapper myBox1, Box6Wrapper myBox2) { 
		Box6 temp = myBox1.myBox;
		myBox1.myBox = myBox2.myBox;
		myBox2.myBox = temp;
	}

	public static void main(String[] args) {
		Box6 box1 = new Box6(1, 30f, 45.5f, 67.8f);
		Box6 box2 = new Box6(2, 57f, 90f, 10f);
		Box6Wrapper Box6w1 = new Box6Wrapper(box1);
		Box6Wrapper Box6w2 = new Box6Wrapper(box2);
		swap(Box6w1, Box6w2);
		Box6w1.myBox.characteristics();
		Box6w2.myBox.characteristics();

	}
}