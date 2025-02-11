//2. Создать классы наследника и родителя, один из которых реализует несколько интерфейсов.
package main.java.ru.sibintek.oop_ex;

interface A {
    void meth_A();
}

interface B extends A {
    void meth_B();
}
abstract class ParentEx {
    abstract void meth_Ex();
}

public class ChildEx extends ParentEx implements B {
    public void meth_A() {System.out.println("meth_A");};
    public void meth_B() {System.out.println("meth_B");};
    public void meth_Ex() {System.out.println("meth_Ex");};
}

//3. Создать интерфейс и его реализацию:
//        Определите интерфейс Vehicle с методами start(), stop(), и getSpeed().
//        Реализуйте два класса: Car и Bicycle, которые реализуют этот интерфейс. Добавьте
//        возможность задавать скорость для каждого транспортного средства.
interface Vehicle {
    void start();
    void stop();
    int getSpeed();
}

//4. Переопределение методов:
//        Создайте класс Shape с методом getArea(), который возвращает площадь фигуры.
//        Создайте классы-наследники Circle и Rectangle, переопределяющие метод area() для
//        вычисления своей площади.
//        Выведите на экран
abstract class Shape {
    abstract double getArea();
}

//6. Создание иерархии классов для сотрудников:
//        Создайте базовый класс Employee с полями name и salary.
//        Создайте два класса-наследника: Manager и Developer, добавив в них дополнительные
//        поля (например, teamSize для менеджера и programmingLanguage для разработчика).
//        Реализуйте метод getDetails(), который выводит информацию о сотрудниках.
class Employee {
    String name;
    String salary;
    public Employee(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }
    String getDetails() {
        return "name: " + this.name + " salary: " + this.salary;
    }
}