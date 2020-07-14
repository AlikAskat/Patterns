//package ru.netology;
//
//import com.github.javafaker.Faker;
//import com.github.javafaker.service.FakeValuesService;
//import com.github.javafaker.service.RandomService;
//import lombok.val;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Locale;
//import java.util.prefs.AbstractPreferences;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//
//
//
//
//
//
//
//class AppDataGenerationTest {
//
//    //private Object String;
//
//    @BeforeEach
//    void getUp() {
//        new Faker(new Locale("ru-RU"));
//
//    }
//
//
//    @Test
//    public void whenLetterifyCalled__checkPatternMatches() {
//        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("ru-RU")
//                ,new RandomService());
//        String name = fakeValuesService.letterify("??Вася ??Вася");
//        Matcher nameMatcher = Pattern.compile( "П??етя ??Петя").matcher(name);
//
//    }
//
//
//    @Test
//    void getUserName(String faker) {
//        String name = String faker(name);
//        new Faker(new Locale("ru-RU"));
//        System.out.println(getUserName("Вася Вася"));
//    }
//
//}