package main.java.ru.sibintek.oop_ex;
//6. Создание иерархии классов для сотрудников:
//        Создайте базовый класс Employee с полями name и salary.
//        Создайте два класса-наследника: Manager и Developer, добавив в них дополнительные
//        поля (например, teamSize для менеджера и programmingLanguage для разработчика).
//        Реализуйте метод getDetails(), который выводит информацию о сотрудниках.
public class Developer extends Employee {
    String programmingLanguage;
    public Developer(String name, String salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    String getDetails() {
        return "Developer; " + super.getDetails() + " programmingLanguage:" + this.programmingLanguage;
    }
    @Override
    public String toString() {
        return this.getDetails();
    };
}
