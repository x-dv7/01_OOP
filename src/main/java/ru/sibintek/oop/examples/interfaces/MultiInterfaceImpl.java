package main.java.ru.sibintek.oop.examples.interfaces;

public class MultiInterfaceImpl implements IExample1, IExample2 {
    public static final String RUN = "RUN";
    @Override
    public void run() {
        System.out.println("Override Interface implementation");
    }

    public static void main(String[] args) {
        MultiInterfaceImpl impl = new MultiInterfaceImpl();
        impl.run();
        impl.run(MultiInterfaceImpl.RUN);
        IExample2.staticRun(MultiInterfaceImpl.RUN);
    }
}

interface IExample1 {
    void run();
}

interface IExample2 {
    default void run(String string) {
        System.out.println("default Interface implementation " + string);
    }

    static void staticRun(String string) {
        System.out.println("static Interface implementation " + string);
    }
}
