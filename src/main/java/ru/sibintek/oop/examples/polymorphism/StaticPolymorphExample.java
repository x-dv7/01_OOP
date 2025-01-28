package main.java.ru.sibintek.oop.examples.polymorphism;

class MathOperations {
    // Перегрузка метода add
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class StaticPolymorphExample {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Вызов перегруженных методов
        System.out.println("Сумма целых чисел: " + math.add(5, 10)); // 15
        System.out.println("Сумма дробных чисел: " + math.add(5.5, 10.5)); // 16.0
        System.out.println("Склеивание строк: " + math.add("Hello, ", "World!")); // Hello, World!
    }
}
