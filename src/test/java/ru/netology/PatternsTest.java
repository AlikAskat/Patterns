package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class PatternsTest {

    //private Object button;

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
    static class AppDataGenerationTest {

        //private Object String;

        @BeforeEach
        void getUp() {
            new Faker(new Locale("ru-RU"));

        }


        @Test
        public void whenLetterifyCalled__checkPatternMatches() {
            FakeValuesService fakeValuesService = new FakeValuesService(new Locale("ru-RU")
                    ,new RandomService());
            String name = fakeValuesService.letterify("??Вася ??Вася");
            Matcher nameMatcher = Pattern.compile( "П??етя ??Петя").matcher(name);

        }


        @Test
        void getUserName(String faker) {
            String name = String faker(name);
            new Faker(new Locale("ru-RU"));
            System.out.println(getUserName("Вася Вася"));
        }

    }


}