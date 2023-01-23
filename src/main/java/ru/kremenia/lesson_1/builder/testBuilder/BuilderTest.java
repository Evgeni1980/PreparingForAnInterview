package ru.kremenia.lesson_1.builder.testBuilder;

import ru.kremenia.lesson_1.builder.Person;

public class BuilderTest {
    public static void main(String[] args) {
        Person person = Person.newBuilder()
                .withFirstName("Иван")
                .withMiddleName("Иванович")
                .withLastName("Иванов")
                .withCountry("РФ")
                .withAddress("Москва")
                .withPhone("+100500")
                .withAge(35)
                .withGender("Муж")
                .build();

        System.out.println(person);

    }
}
