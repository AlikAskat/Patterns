package ru.netology;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataGenerator {
    private static Faker faker = new Faker(new Locale("ru"));
    public DataGenerator() {
    }
    public static String getUserName() {
        return faker.name().lastName() + " " + faker.name().firstName();
    }
    public static String getPhoneNumber() {
//        return faker.phoneNumber();
        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("ru"), new RandomService());

        String alphaNumericString = fakeValuesService.regexify("[+][7][9][019]{9}");
        Matcher alphaNumericMatcher = Pattern.compile("[+][7][9][019]{9}").matcher(alphaNumericString);

        assertTrue(alphaNumericMatcher.find());
        return alphaNumericString;
    }

    public static String getCity() {
        String[] cities = new String[]{"Москва", "Воронеж", "Краснодар", "Владивосток"};
        int itemIndex = (int) (Math.random() * cities.length);
        return cities[itemIndex];
    }
}



