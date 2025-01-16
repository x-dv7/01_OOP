package main.java.ru.sibintek.oop.examples.methods;

class Test5
{
    int a,b;
    Test5(int i,int j)
    {
        a=i;
        b=j;
    }
    boolean equals(Test5 obj)
    {
        if (obj.a==a && obj.b==b)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
public class PassingObjects3 {
    public static void main(String[] args) {
    	Test5 obj1 = new Test5(100, 3);
    	Test5 obj2 = new Test5(100, 3);
    	Test5 obj3 = new Test5(30,40);
        System.out.println("obj1==obj2:" + obj1.equals(obj2));
        System.out.println("obj2==obj3:" + obj2.equals(obj3));
        System.out.println("obj3==obj1:" + obj3.equals(obj1));
        
    }
    
}