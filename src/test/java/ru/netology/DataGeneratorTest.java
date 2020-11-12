package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.util.DataGenerator;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.valueOf;
import static ru.netology.util.DataGenerator.getCity;

class DataGeneratorTest {

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }



    @Test
    public void shouldChangeOfDeliveryDate() {
        new Faker( new Locale( "ru" ) );
        open( "http://localhost:9999" );
        $( "[class='App_appContainer__3jRx1']" );
        new DataGenerator();
        $( "[placeholder='Город']" ).setValue( valueOf( getCity() ) );
        $( "[name='name']" ).setValue( new DataGenerator().getUserName() );
        $( "[name='phone']" ).setValue( valueOf( new DataGenerator().getPhoneNumber() ) );
        $( "[class='checkbox__box']" ).click();
        $( "[type='button']" ).click();
        $( byText( "Забронировать" ) ).click();
        $( "[data-test-id='notification']" ).waitUntil( Condition.visible, 15000 );
    }

}




