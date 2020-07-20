package ru.netology;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import ru.netology.util.DataGenerator;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.*;
import static ru.netology.util.DataGenerator.*;

class DataGeneratorTest {



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




