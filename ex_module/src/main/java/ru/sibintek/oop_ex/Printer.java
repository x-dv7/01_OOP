package main.java.ru.sibintek.oop_ex;
//5. Создание класса с перегрузкой методов:
//        Создайте класс Printer с перегруженными методами print(), которые могут
//        принимать различные типы данных (например, int, String, double).
//        Реализуйте логику для каждого метода, чтобы выводить данные на экран в
//        соответствующем формате.
public class Printer {
    public void print(int a) {
        System.out.println("int " + a);
    }
    public void print(double a) {
        System.out.println("double " + a);
    }
    public void print(String a) {
        System.out.println("String " + a);
    }
}
