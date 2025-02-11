package main.java.ru.sibintek.oop_ex;
//4. Переопределение методов:
//        Создайте класс Shape с методом getArea(), который возвращает площадь фигуры.
//        Создайте классы-наследники Circle и Rectangle, переопределяющие метод area() для
//        вычисления своей площади.
//        Выведите на экран
public class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.pow(Math.PI * this.radius, 2);
    }
    @Override
    public String toString() {
        return "Square Circle = " + this.getArea();
    };
}
