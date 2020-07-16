package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.netology.DataGenerator.getUserName;
import static ru.netology.DataGenerator.getUserName.*;

class DataGeneratorTest {



    @Test
    public void shouldChangeOfDeliveryDate() {
        new Faker( new Locale( "ru-RU" ) );
        open( "http://localhost:9999" );
        $( "[class='App_appContainer__3jRx1']" );
        $( "[placeholder='Город']" ).setValue( String.valueOf( new cityName( "" ) ) );
        $( "[name='name']" ).setValue( String.valueOf( new getUserName( "" ) ) );
        $( "[name='phone']" ).setValue( String.valueOf( new phoneNumber( "" ) ) );
        $( "[class='checkbox__box']" ).click();
        $( "[type='button']" ).click();
        $( byText( "Забронировать" ) ).click();
        $( "[data-test-id='notification']" ).waitUntil( Condition.visible, 10000 );
    }



}





