package main.java.ru.sibintek.oop.examples.multithreading;

/**
 * Multithreading2
 */
class DemoThread extends Thread {
    DemoThread()
    {
        super("Demo Thread");
        System.out.println("Child Thread:"+this);
        start();
    }
    public void run() {
        try{
            for(int i=8;i>0;i--)
            {
                System.out.println("Child:"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Interrupted");
        }
        System.out.println("Child Exiting");
    }
    
}
class Multithreading2 {
    public static void main(String[] args) {
        new DemoThread();
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println("main.java.ru.sibintek.oop.examples.Main:"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("main.java.ru.sibintek.oop.examples.Main Interrupted");
        }
        System.out.println("main.java.ru.sibintek.oop.examples.Main Exiting");
    }
    
}