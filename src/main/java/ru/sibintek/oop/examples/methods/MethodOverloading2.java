package main.java.ru.sibintek.oop.examples.methods;

class Test2 {
    void id(String name, int id) {
        System.out.println("Name:" + name + "\tId:" + id);
    }

    void id(int id, String name) {
        System.out.println("Name:" + name + "\tId:" + id);
    }
}

public class MethodOverloading2 {

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.id("Disha", 101);
        obj.id(102, "Argha");
    }
}