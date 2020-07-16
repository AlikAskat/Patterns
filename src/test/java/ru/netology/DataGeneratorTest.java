package ru.netology;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class DataGeneratorTest {



    @Test
    public void shouldChangeOfDeliveryDate() {
        new Faker( new Locale( "ru-RU" ) );
        open( "http://localhost:9999" );
        $( "[class='App_appContainer__3jRx1']" );
        new DataGenerator();
        $( "[placeholder='Город']" ).setValue( String.valueOf( DataGenerator.getCity() ) );
        $( "[name='name']" ).setValue( new DataGenerator().getUserName() );
        $( "[name='phone']" ).setValue( String.valueOf( new DataGenerator().getPhoneNumber() ) );
        $( "[class='checkbox__box']" ).click();
        $( "[type='button']" ).click();
        $( byText( "Забронировать" ) ).click();
        $( "[data-test-id='notification']" ).waitUntil( Condition.visible, 10000 );
    }



}




