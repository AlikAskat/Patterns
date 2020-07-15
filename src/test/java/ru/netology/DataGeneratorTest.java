package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.prefs.AbstractPreferences;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class DataGeneratorTest {


    private AbstractPreferences faker;

    @BeforeEach
    void setUpAll() {
        new Faker( new Locale( "ru-RU" ) );
    }

    @Test
    void getUserName() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        $( "[name='name']" ).setValue( DataGenerator.getUserName( "['Вася Вася']" ) );
    }


    @Test
    public void shouldChangeOfDeliveryDate(){
        open("http://localhost:9999");
        SelenideElement form = $("[class='App_appContainer__3jRx1']");
        form.$("[placeholder='Город']").setValue("Тамбов");
        form.$("[name='name']").setValue("Вася Вася");
        form.$("[name='phone']").setValue("+79120000000");
        form.$("[class='checkbox__box']").click();
        form.$("[type='button']").click();
        $(byText("Забронировать")).click();
        $("[data-test-id='notification']").waitUntil(Condition.visible, 15000);
    }



}