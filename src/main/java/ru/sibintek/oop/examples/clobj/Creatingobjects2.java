package main.java.ru.sibintek.oop.examples.clobj;

/**
 * Создание объекта и обращение к атрибутам
 */
class Box3 {
    double width;
    double height;
    double depth;
}

class CreatingObjects2 {
    public static void main(String args[]) {

        //Creating object of class Box
        Box3 mybox = new Box3();
        mybox.width = 5;
        mybox.height = 10;
        mybox.depth = 20;
        double vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is:" + vol);
    }
}