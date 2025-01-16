package main.java.ru.sibintek.oop.examples.thiskw;

class Test2 {
    int a;
    int b;

    // Default constructor
    Test2() {
        a = 100;
        b = 200;
    }

    // Method that receives 'this' keyword as parameter
    void display(Test2 obj) {
        System.out.println("a = " + a + "  b = " + b);
    }

    // Method that returns current class instance
    void get() {
        display(this);
    }
}
class This4{

    public static void main(String[] args) {
    	Test2 object = new Test2();
        object.get();
    }
}