package main.java.ru.sibintek.oop.examples.methods;

class Test3
{
    void nullError(String name)
    {
        System.out.println("name:"+name);
    }
    void nullError(Integer i)
    {
        System.out.println("integer:"+i);
    }
}
class NullError {
    public static void main(String[] args) {
    	Test3 obj = new Test3();
//        obj.nullError(null);
    }
    
}