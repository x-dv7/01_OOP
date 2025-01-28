package main.java.ru.sibintek.oop.examples.clobj;

class Box5 {
    int length, box_no;

    Box5(int l, int no) {
        length = l;
        box_no = no;
    }

    void characteristics() {
        System.out.println("Box no.:" + box_no + " ; length of box:" + length);
    }
}

class SwapObjects2Problem {
    // все передается по значению pass-by-value
    public static void swap(Box5 mybox1, Box5 mybox2) {
        Box5 temp = mybox1;
        mybox1 = mybox2;
        mybox2 = temp;
    }

    public static void main(String[] args) {
        Box5 box1 = new Box5(34, 1);
        Box5 box2 = new Box5(84, 2);
        swap(box1, box2);
        box1.characteristics();
        box2.characteristics();
    }
}
