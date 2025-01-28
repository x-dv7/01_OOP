package main.java.ru.sibintek.oop.examples.interfaces;

import java.util.Arrays;
import java.util.List;

// Определение функционального интерфейса
@FunctionalInterface
interface MyFunctionalInterface {
    void execute(String message);
}

public class FuncInterfaceExample {
    public static void main(String[] args) {
        // Использование лямбда-выражения для реализации функционального интерфейса
        MyFunctionalInterface myFunction = (message) -> {
            System.out.println("Сообщение: " + message);
        };

        // Вызов метода интерфейса
        myFunction.execute("Привет, мир!"); // Вывод: Сообщение: Привет, мир!

        // Использование функционального интерфейса с коллекциями
        List<String> messages = Arrays.asList("Первое сообщение", "Второе сообщение", "Третье сообщение");

        // Применение метода forEach с лямбда-выражением
        messages.forEach(myFunction::execute);
        messages.forEach(msg -> myFunction.execute(msg));
    }
}

