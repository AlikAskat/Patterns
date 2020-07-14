package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.prefs.AbstractPreferences;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class DataGeneratorTest {

    @Test
    public void getUserName(String вася_вася) {
        AbstractPreferences faker = null;
        faker.name();
        new Faker(new Locale("ru-RU"));
        $("[name='name']").setValue(DataGenerator.getUserName("['Вася Вася']"));
    }

    @Test
    public void shouldChangeOfDeliveryDate() {
        open("http://localhost:9999");
        SelenideElement form = $("[class='App_appContainer__3jRx1']");
        form.$("[placeholder='Город']").setValue("CityName");
        form.$("[name='name']").setValue("UserName");
        form.$("[name='phone']").setValue("Phone");
        form.$("[class='checkbox__box']").click();
        form.$("[type='button']").click();
        $(byText("Забронировать")).click();
        $("[data-test-id='notification']").waitUntil(Condition.visible, 15000);
    }



}