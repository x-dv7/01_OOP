package main.java.ru.sibintek.oop.examples.clobj;

class Box4 {
	int box_no;

	Box4(int no) {
		box_no = no;
	}
}

class SwapObjects {
	public static void swap(Box4 mybox1, Box4 mybox2) {
		int temp = mybox1.box_no;
		mybox1.box_no = mybox2.box_no;
		mybox2.box_no = temp;
	}

	public static void main(String[] args) {
		Box4 box1 = new Box4(1);
		Box4 box2 = new Box4(2);
		swap(box1, box2);
		System.out.println("Box 1 number:" + box1.box_no);
		System.out.println("Box 2 number:" + box2.box_no);

	}
}