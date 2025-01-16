package main.java.ru.sibintek.oop.examples.thiskw;


//Java code for using 'this' keyword  
//to return the current class instance 
class Sample {
    int a;
    int b;

    // Default constructor
    Sample() {
        a = 10;
        b = 20;
    }

    // Method that returns current class instance
    Sample get() {
        return this;
    }

    // Displaying value of variables a and b
    void display() {
        System.out.println("a = " + a + "  b = " + b);
    }
}
class this3{
    public static void main(String[] args) {
    	Sample object = new Sample();
        object.get().display();
    }
}
