package main.java.ru.sibintek.oop.examples.interfaces;

/**
 * Вложенный интерфейс
 */
class MyClass {
    interface NestedInterface {
        String student = "Disha";//needs to be initialized as its final

        void display(int rollno);
    }
}

class MyIFace implements MyClass.NestedInterface {
    public void display(int rno) {
        System.out.println("Rollno:" + rno);
    }
}

/**
 * NestedInterface1
 */
class NestedInterface1 {
    public static void main(String[] args) {
        MyClass.NestedInterface obj = new MyIFace();
        System.out.println("Name:" + MyClass.NestedInterface.student);
        obj.display(75);
    }

}