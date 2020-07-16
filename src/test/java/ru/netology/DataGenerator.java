package ru.netology;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {
    private DataGenerator() { }

    public static class getUserName {
        private getUserName() { }
        public static getUserName generateData (String locale) {
            Faker faker = new Faker(new Locale("ru"));
        }



    }
}


