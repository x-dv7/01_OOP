package main.java.ru.sibintek.oop.examples.constructors;

/**
 * Перегрузка конструктора
 */
class Person11 {
    int age;
    double height;
    double weight;

    Person11() {
        System.out.println("No parameterized constructor");
        age = 0;
        height = 0.0;
        weight = 0.0;
    }

    Person11(int age) {
        System.out.println("One Parameter Constructor");
        this.age = age;
        height = 0.0;
        weight = 0.0;
    }

    Person11(int age, double height) {
        System.out.println("Two parameter Constructor");
        this.age = age;
        this.height = height;
        weight = 0.0;
    }

    Person11(int age, double height, double weight) {
        System.out.println("Three parameter Constructor");
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return "Age:" + age + "\tHeight" + height + "\tWeight" + weight;
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Person11 p1 = new Person11();
        System.out.println(p1);
        Person11 p2 = new Person11(22);
        System.out.println(p2);

        Person11 p3 = new Person11(22, 5);
        System.out.println(p3);

        Person11 p4 = new Person11(22, 5, 65);
        System.out.println(p4);

    }

}
