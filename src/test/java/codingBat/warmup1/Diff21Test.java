package codingBat.warmup1;

import CodingBat.Warmup1.Diff21;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Diff21Test {

    private Diff21 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new Diff21();
    }

    @Test
    void nMenorQue21(){
        assertEquals(2, objectTest.diff21(19));
    }

    @Test
    void nMaiorQue21(){
        assertEquals(14, objectTest.diff21(28));
    }

    @Test
    void nIgual21(){
        assertEquals(0, objectTest.diff21(21));
    }
}