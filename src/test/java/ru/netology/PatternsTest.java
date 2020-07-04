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
        form.$("[placeholder='Город']").setValue("Екатеринбург");
        form.$("[name='name']").setValue("Василий Иванов");
        form.$("[name='phone']").setValue("+79270000000");
        form.$("[class='checkbox__box']").click();
        form.$("[class='button button_view_extra button_size_m button_theme_alfa-on-white']").click();
        $(byText("Запланировать")).click();
        $("[data-test-id='notification']").waitUntil(Condition.visible, 15000);
    }


}