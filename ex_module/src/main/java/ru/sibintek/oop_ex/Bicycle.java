package main.java.ru.sibintek.oop_ex;
//3. Создать интерфейс и его реализацию:
//        Определите интерфейс Vehicle с методами start(), stop(), и getSpeed().
//        Реализуйте два класса: Car и Bicycle, которые реализуют этот интерфейс. Добавьте
//        возможность задавать скорость для каждого транспортного средства.
public class Bicycle implements Vehicle {
    int speed;
    public Bicycle(int speed) {
        this.speed = speed;
    }
    @Override
    public void start() {
        System.out.println("start Bicycle");
    };
    @Override
    public void stop() {
        System.out.println("stop Bicycle");
    };
    @Override
    public int getSpeed() {
        return this.speed;
    };
    @Override
    public String toString() {
        return "speed Bicycle = " + this.getSpeed();
    };
}