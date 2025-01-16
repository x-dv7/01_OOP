package main.java.ru.sibintek.oop.examples.superkw;

class A2{
    int i=10;
}

class B2 extends A2{
    int i;
    B2(int a)
    {
        i=a;
    }
    void display()
    {
        System.out.println("Class A i="+super.i);
        System.out.println("class B i="+i);
    }
}
class superWithVariables {
    public static void main(String[] args) {
        
    B2 obj = new B2(20);
    obj.display();
    }
    
}