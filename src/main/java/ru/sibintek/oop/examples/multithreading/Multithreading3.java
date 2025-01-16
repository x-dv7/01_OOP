package main.java.ru.sibintek.oop.examples.multithreading;

/**
 * Multithreading2
 */
class DemoThread2 implements Runnable {
    Thread t;
    DemoThread2() {
        t=new Thread(this,"Demo Thread");
        System.out.println("Child Thread:" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 8; i > 0; i--) {
                System.out.println("Child:" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Child Exiting");
    }

}

class Multithreading3 {
    public static void main(String[] args) {
        new DemoThread2();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("main.java.ru.sibintek.oop.examples.Main:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main.java.ru.sibintek.oop.examples.Main Interrupted");
        }
        System.out.println("main.java.ru.sibintek.oop.examples.Main Exiting");
    }

}