package codingBat.warmup1;

import CodingBat.Warmup1.LastDigit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {

    private LastDigit objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new LastDigit();
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO0(){
        assertTrue(objectTest.lastDigit(10,20));
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO1(){
        assertTrue(objectTest.lastDigit(1,31));
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO2(){
        assertTrue(objectTest.lastDigit(02,32));
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO3(){
        assertTrue(objectTest.lastDigit(53,103));
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO4(){
        assertTrue(objectTest.lastDigit(14,54));
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO5(){
        assertTrue(objectTest.lastDigit(75,35));
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO6(){
        assertTrue(objectTest.lastDigit(36,16));
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO7(){
        assertTrue(objectTest.lastDigit(17,57));
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO8(){
        assertTrue(objectTest.lastDigit(8,98));
    }

    @Test
    void numerosComLastDigitIguaisEOLastDigitEO9(){
        assertTrue(objectTest.lastDigit(99,99));
    }

    @Test
    void numerosComLastDigitDiferentesETamanho1(){
        assertFalse(objectTest.lastDigit(1,4));
    }

    @Test
    void numerosComLastDigitDiferentesETamanho2(){
        assertFalse(objectTest.lastDigit(12,43));
    }

    @Test
    void numerosComLastDigitDiferentesETamanho3(){
        assertFalse(objectTest.lastDigit(43,68));
    }


}