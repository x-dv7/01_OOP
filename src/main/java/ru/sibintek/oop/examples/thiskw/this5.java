package main.java.ru.sibintek.oop.examples.thiskw;

class Viewer {

    void display() {
        // calling fuction show()
        this.show();

        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show funcion");
    }
}
class This5{

    public static void main(String args[]) {
    	Viewer t1 = new Viewer();
        t1.display();
    }
}