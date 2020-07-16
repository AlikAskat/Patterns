package ru.netology;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    public static class getUserName {
        getUserName(String s) {
        }

        public static getUserName setValue(String locale) {
            Faker faker = new Faker( new Locale( "ru-RU" ) );
            return new getUserName(
                    faker.name().fullName()
            );
        }


    }
}


