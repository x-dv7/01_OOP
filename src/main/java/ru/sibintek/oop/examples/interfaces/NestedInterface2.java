package main.java.ru.sibintek.oop.examples.interfaces;

class MyClass2 {
    protected interface NestedInterface {
        String student = "Disha";// needs to be initia;ized as its final

        void display(int rollno);
    }
}

class MyIface2 implements MyClass2.NestedInterface {
    public void display(int rno) {
        System.out.println("Rollno:" + rno);
    }
}

/**
 * NestedInterface1
 */
class NestedInterface2 {
    public static void main(String[] args) {
        MyClass2.NestedInterface obj = new MyIface2();
        System.out.println("Name:" + MyClass2.NestedInterface.student);
        obj.display(75);
    }

}