package main.java.ru.sibintek.oop.examples.methods;

class Test4 {
    void nullError(String name) {
        System.out.println("name:" + name);
    }

    void nullError(Integer i) {
        System.out.println("integer:" + i);
    }
}

class NullErrorSolution {
    public static void main(String[] args) {
    	Test4 obj = new Test4();
        String arg=null;
        obj.nullError(arg);
    }

}