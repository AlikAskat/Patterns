package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class PatternsTest {

//    private Object button;

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