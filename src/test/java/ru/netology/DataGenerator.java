package ru.netology;
import com.github.javafaker.Faker;
import java.util.Locale;
public class DataGenerator {
    private static Faker faker = new Faker(new Locale("ru"));
    public DataGenerator() {
    }
    public static String getUserName() {
        return faker.name().lastName() + " " + faker.name().firstName();
    }
    public static String getPhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }
    public static String getCity() {
        String[] cities = new String[]{"Москва", "Воронеж", "Краснодар", "Владивосток"};
        int itemIndex = (int) (Math.random() * cities.length);
        return cities[itemIndex];
    }
}



