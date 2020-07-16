package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.netology.DataGenerator.*;

class DataGeneratorTest {



    @Test
    public void shouldChangeOfDeliveryDate() {
        new Faker( new Locale( "ru-RU" ) );
        open( "http://localhost:9999" );
        SelenideElement form = $( "[class='App_appContainer__3jRx1']" );
        form.$( "[placeholder='Город']" ).setValue( "Тамбов" );
        $( "[name='name']" ).setValue( String.valueOf( new getUserName( "" ) ) );
        form.$( "[name='phone']" ).setValue( "+79120000000" );
        form.$( "[class='checkbox__box']" ).click();
        form.$( "[type='button']" ).click();
        $( byText( "Забронировать" ) ).click();
        $( "[data-test-id='notification']" ).waitUntil( Condition.visible, 15000 );
    }
}




