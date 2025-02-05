package main.java.ru.sibintek.oop.examples;

public class HotKeysExample {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public HotKeysExample() {
        super();
    }

    public static void main(String[] args) {
        // Ctrl + Alt + Space: Ввод названия любого класса проекта

//        MyClass myObject = new MyClass(); // Пример использования класса

        // Ctrl + Shift + Enter: Завершение оператора

        System.out.println("Hello, World!"); // Просто завершение оператора

        // Ctrl + P: Сведения о параметрах метода
        HotKeysExample.printMessage("Hello, Giga IDE!"); // Вызов метода с параметром

        // Ctrl + Q: Быстрый поиск документации
        // Нажмите Ctrl + Q, чтобы получить информацию о методе printMessage

        // Ctrl + F1: Показать описания ошибки или предупреждения
        // Например, если здесь будет ошибка, нажмите Ctrl + F1

        // Alt + Insert: Генерация кода
        // Используйте Alt + Insert для генерации getters и setters

        // Ctrl + O: Переопределение метода
        // Если вы наследуетесь от какого-то класса, используйте Ctrl + O

        // Ctrl + I: Реализация методов
        // Если интерфейс имеет методы, используйте Ctrl + I для их реализации

        // Ctrl + Alt + T: Поместить фрагмент кода
        // Например, используйте Ctrl + Alt + T для создания блока try..catch

        // Ctrl + /: Однострочное комментирование
        // System.out.println("Это закомментированная строка"); // Пример

        // Ctrl + Shift + /: Многострочное комментирование
        /*
        System.out.println("Это многострочный комментарий");
        */

        // Ctrl + W: Выбор последовательности возрастающих блоков кода.
        // Выделите блок кода и используйте Ctrl + W

        // Alt + Q: Контекстная информация.
        // Нажмите Alt + Q для получения контекстной информации

        // Alt + Enter: Показать предлагаемое исправление
        // Если есть ошибка, используйте Alt + Enter для исправления

        // Ctrl + Alt + L: Форматирование кода
        // Используйте Ctrl + Alt + L для форматирования всего кода

        // Ctrl + Alt + O: Удалить неиспользуемые импорты
        // Используйте Ctrl + Alt + O для очистки импортов

        // Shift + Alt + +: Увеличить масштаб
        // Shift + Alt + -: Уменьшить масштаб
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}

