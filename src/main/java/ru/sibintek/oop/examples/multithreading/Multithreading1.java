package main.java.ru.sibintek.oop.examples.multithreading;

class Multithreading1 {
 public static void main(String[] args) {
     Thread t=Thread.currentThread();
     System.out.println("Current Thread: "+t);
     t.setName("MyThread");
     System.out.println("After Name Change:"+t);
     try{
        for(int i=5;i>0;i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
     }
     catch(InterruptedException e){
        System.out.println("main.java.ru.sibintek.oop.examples.Main Interrupted");
     }
 }
    
}