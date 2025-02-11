package main.java.ru.sibintek.oop_ex;
//6. Создание иерархии классов для сотрудников:
//        Создайте базовый класс Employee с полями name и salary.
//        Создайте два класса-наследника: Manager и Developer, добавив в них дополнительные
//        поля (например, teamSize для менеджера и programmingLanguage для разработчика).
//        Реализуйте метод getDetails(), который выводит информацию о сотрудниках.
public class Manager extends Employee {
    int teamSize;
    public Manager(String name, String salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    String getDetails() {
        return "Manager; " + super.getDetails() + " teamSize:" + this.teamSize;
    }
    @Override
    public String toString() {
        return this.getDetails();
    };
}
