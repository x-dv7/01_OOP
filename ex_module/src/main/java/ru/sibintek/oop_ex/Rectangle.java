package main.java.ru.sibintek.oop_ex;
//4. Переопределение методов:
//        Создайте класс Shape с методом getArea(), который возвращает площадь фигуры.
//        Создайте классы-наследники Circle и Rectangle, переопределяющие метод area() для
//        вычисления своей площади.
//        Выведите на экран
public class Rectangle extends Shape {
    double a;
    double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getArea() {
        return this.a * this.b;
    }
    @Override
    public String toString() {
        return "Square Rectangle = " + this.getArea();
    };
}
