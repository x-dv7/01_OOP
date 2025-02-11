package main.java.ru.sibintek.oop.examples.nested;

public class BuilderExample {
    private final String firstName; // Обязательное поле
    private final String lastName;  // Обязательное поле
    private final int age;          // Опциональное поле
    private final String email;     // Опциональное поле


    // Приватный конструктор, чтобы объект можно было создать только через Builder
    private BuilderExample(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
    }

    // Геттеры
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
    // Статический вложенный класс Builder
    public static class Builder {
        private final String firstName; // Обязательное поле
        private final String lastName;  // Обязательное поле
        private int age = 0;            // Опциональное поле (значение по умолчанию)
        private String email = "";      // Опциональное поле (значение по умолчанию)

        // Конструктор Builder с обязательными полями
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Методы для установки опциональных полей
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        // Метод build, который создает объект BuilderExample
        public BuilderExample build() {
            return new BuilderExample(this);
        }
    }

    public static void main(String[] args) {
        // Создание объекта User с помощью Builder
        BuilderExample user = new BuilderExample.Builder("John", "Doe")
                .age(30)
                .email("john.doe@example.com")
                .build();

        System.out.println(user);
        // Вывод: User{firstName='John', lastName='Doe', age=30, email='john.doe@example.com'}
    }
}