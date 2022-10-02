package hu.sebestyen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mitirjonTest {

    private mitirjon underTest;

    @BeforeEach
    public void setUp(){
        underTest = new mitirjon();
    }

    @Test
    public void testkoszonesShouldReturnTheCorrectGreetingWhenLanguageGiven() {
        //given in setup

        //when
        String result = underTest.koszones("Sanyi","hu");
        String result2 = underTest.koszones("Sanyi","en");
        String result3 = underTest.koszones("Sanyi","de");
        String result4 = underTest.koszones("Sanyi","ro");

        //then
        assertEquals("Szia Sanyi!",result);
        assertEquals("Hello Sanyi!",result2);
        assertEquals("Gutten Tag Sanyi!",result3);
        assertEquals("Ismeretlen nyelv!",result4);

    }

}
