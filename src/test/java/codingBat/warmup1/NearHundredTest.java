package codingBat.warmup1;

import CodingBat.Warmup1.NearHundred;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NearHundredTest {

    private NearHundred objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new NearHundred();
    }

    @Test
    void menorQue90(){
        assertFalse(objectTest.nearHundred(89));
    }

    @Test
    void maiorIgualQue90MenorIgualQue110(){
        assertTrue(objectTest.nearHundred(90));
        assertTrue(objectTest.nearHundred(110));
    }

    @Test
    void maiorQue110MenorQue190(){
        assertFalse(objectTest.nearHundred(111));
        assertFalse(objectTest.nearHundred(189));

    }

    @Test
    void maiorIgualQue190MenorIgualQue210(){
        assertTrue(objectTest.nearHundred(190));
        assertTrue(objectTest.nearHundred(209));
    }

    @Test
    void maiorQue210(){
        assertFalse(objectTest.nearHundred(211));
    }



}