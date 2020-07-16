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

        public static class phoneNumber {
            Faker faker = new Faker( new Locale( "ru-RU" ) );
            phoneNumber(String s) {
            }

        }


        public static class cityName {
            Faker faker = new Faker( new Locale( "ru-RU" ) );
            public cityName(String s) {
            }
        }
    }
}


