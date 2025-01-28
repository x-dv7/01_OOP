package main.java.ru.sibintek.oop.examples.interfaces;

interface A {
    void meth1();

    void meth2();
}

interface B extends A {
    void meth3();
}

interface IFunc {
    void run();
}

/**
 * ExtendsInterfaces
 */
class IFaceClass implements B, IFunc {
    @Override
    public void meth1() {
        System.out.println("Implement meth1()");
    }

    @Override
    public void meth2() {
        System.out.println("Implement meth2()");
    }

    @Override
    public void meth3() {
        System.out.println("Implement meth3()");
    }

    @Override
    public void run() {

    }
}

/**
 * ExtendsInterfaces
 */
class ExtendsInterfaces {
    public static void main(String[] args) {
        IFaceClass obj = new IFaceClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }

}