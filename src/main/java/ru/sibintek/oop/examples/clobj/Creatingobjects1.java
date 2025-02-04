package main.java.ru.sibintek.oop.examples.clobj;
/**
 * Создание объектов
 */
class Box2 {
    double width;
    double height;
    double depth;

    //Method1
    double volume() {
        return width * height * depth;
    }

    //Method2
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class CreatingObjects1 {
    public static void main(String args[]) {
        //creating object1 of Class Box
        Box2 obj1 = new Box2();
        //creating object2 of Class Box
        Box2 obj2 = new Box2();
        obj1.setDim(3, 5, 10);
        obj2.setDim(10, 15, 20);
        System.out.println("Vol of Box1:" + obj1.volume());
        System.out.println("Vol of Box2:" + obj2.volume());
    }
}