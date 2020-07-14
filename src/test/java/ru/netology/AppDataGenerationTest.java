package ru.netology;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.prefs.AbstractPreferences;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




class AppDataGenerationTest {

    @BeforeEach
    void getUp() {
        new Faker(new Locale("ru-RU"));

    }


    @Test
    public void whenLetterifyCalled__checkPatternMatches() {
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("ru-RU")
                , new RandomService());
        String name = fakeValuesService.letterify("??Вася ??Вася");
        Matcher nameMatcher = Pattern.compile("П??етя ??Петя").matcher(name);

    }


    @Test
    public void getUserName(AbstractPreferences faker) {
        faker.name().toString("Вася Вася");
        System.out.println("Вася Вася");
    }
}