package codingBat.Warmup2;

import CodingBat.Warmup2.StringTimes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTimesTest {

    private StringTimes objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new StringTimes();
    }

    @Test
    void copiar1Vez(){
        assertEquals("Azul", objectTest.stringTimes("Azul", 1));
    }

    @Test
    void copiar2Vezes(){
        assertEquals("PataPata", objectTest.stringTimes("Pata", 2));
    }

    @Test
    void copiar5Vezes(){
        assertEquals("OiOiOiOiOi", objectTest.stringTimes("Oi", 5));
    }

    @Test
    void stringVazia(){
        assertEquals("", objectTest.stringTimes("", 3));
    }

    @Test
    void copiar0Vezes(){
        assertEquals("", objectTest.stringTimes("Arroz", 0));
    }


}