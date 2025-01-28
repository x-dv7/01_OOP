package main.java.ru.sibintek.oop.examples.polymorphism;

class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Гав!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Мяу!");
    }
}

public class DynamicPolymorphExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Ссылка на суперкласс
        Animal myCat = new Cat(); // Ссылка на суперкласс

        // Вызов метода sound() у разных объектов
        myDog.sound(); // Гав!
        myCat.sound(); // Мяу!
    }
}

