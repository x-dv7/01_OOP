package main.java.ru.sibintek.oop_mm;
//1. Создать проект с 2-мя модулями, один из которых зависит от другого.
//7. *Создайте репозиторий на GitHub и сделайте в него push заданий.

import main.java.ru.sibintek.oop_ex.*;

public class MainModule {
    public static void main(String[] args) {
//2. Создать классы наследника и родителя, один из которых реализует несколько интерфейсов.
        ChildEx ch_ex = new ChildEx();
        ch_ex.meth_A();
        ch_ex.meth_B();
        ch_ex.meth_Ex();
//3. Создать интерфейс и его реализацию:
//        Определите интерфейс Vehicle с методами start(), stop(), и getSpeed().
//        Реализуйте два класса: Car и Bicycle, которые реализуют этот интерфейс. Добавьте
//        возможность задавать скорость для каждого транспортного средства.
        Car car = new Car(100);
        car.start();
        System.out.println(car.toString());
        car.stop();
        Bicycle bicycle = new Bicycle(10);
        bicycle.start();
        System.out.println(bicycle.toString());
        bicycle.stop();
//4. Переопределение методов:
//        Создайте класс Shape с методом getArea(), который возвращает площадь фигуры.
//        Создайте классы-наследники Circle и Rectangle, переопределяющие метод area() для
//        вычисления своей площади.
//        Выведите на экран
        Circle circle = new Circle(12);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.toString());

//5. Создание класса с перегрузкой методов:
//        Создайте класс Printer с перегруженными методами print(), которые могут
//        принимать различные типы данных (например, int, String, double).
//        Реализуйте логику для каждого метода, чтобы выводить данные на экран в
//        соответствующем формате.
        Printer printer = new Printer();
        printer.print(1);
        printer.print(1.1);
        printer.print("Hello!");

//6. Создание иерархии классов для сотрудников:
//        Создайте базовый класс Employee с полями name и salary.
//        Создайте два класса-наследника: Manager и Developer, добавив в них дополнительные
//        поля (например, teamSize для менеджера и programmingLanguage для разработчика).
//        Реализуйте метод getDetails(), который выводит информацию о сотрудниках.
        Developer developer = new Developer("Dima", "V.", "ABAP");
        System.out.println(developer.toString());
        Manager manager = new Manager("Oleg", "K.", 4);
        System.out.println(manager.toString());
    }
}

