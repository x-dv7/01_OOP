package main.java.ru.sibintek.oop.examples.interfaces;
abstract class Parent2
{
    void meth()
    {
        System.out.println("No abstract method");
    }
}

class Child extends Parent2
{

}

class Abstractclass2 {

    public static void main(String[] args) {
        Child c=new Child();
        c.meth();
    }
}