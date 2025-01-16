package main.java.ru.sibintek.oop.examples.interfaces;

interface MyInterface {
    interface NestedInterface {
        String student = "Disha";// needs to be initialized as its final

        void display(int rollno);
    }
}

class MyClass3 implements MyInterface.NestedInterface {
    public void display(int rno) {
        System.out.println("Rollno:" + rno);
    }
}

/**
 * NestedInterface1
 */
class NestedInterface3 {
    public static void main(String[] args) {
    	MyInterface.NestedInterface obj = new MyClass3();
        System.out.println("Name:" + MyClass.NestedInterface.student);
        obj.display(75);
    }

}