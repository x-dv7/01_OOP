package main.java.ru.sibintek.oop.examples.methods;

class Return
{
    int[] getarray()
    {
        int[] arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=8;
        return arr;
    }
}
public class ReturningValues1 {
    public static void main(String[] args) {
    	Return obj=new Return();
        int[] array=obj.getarray();
        System.out.println("Item1:"+array[0]);
        System.out.println("Item2:" + array[1]);
        System.out.println("Item3:" + array[2]);
        
    }
    
}