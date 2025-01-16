package main.java.ru.sibintek.oop.examples.thiskw;


// Java code for using this() to  
// invoke current class constructor 
class Example {
    int a;
    int b;

    // Default constructor
    Example() {
        this(10, 20); //constructor chaining
        System.out.println("Inside  default constructor \n");
    }

    // Parameterized constructor
    Example(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
}
class this2{
    public static void main(String[] args) {
    	Example object = new Example();
    }
}
