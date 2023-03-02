package codingBat.warmup1;

import CodingBat.Warmup1.MixStart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixStartTest {

    private MixStart objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new MixStart();
    }

    @Test
    void stringIxComecaNoIndice1(){
        assertTrue(objectTest.mixStart("mix snacks"));
    }

    @Test
    void stringIxNaoComecaNoIndice1(){
        assertFalse(objectTest.mixStart("ixi mae"));
    }

    @Test
    void naoTemStringIx(){
        assertFalse(objectTest.mixStart("java"));
    }

    @Test
    void stringComTamanhoMenorOuIgualA2(){
        assertFalse(objectTest.mixStart("oi"));
        assertFalse(objectTest.mixStart("a"));
    }

    @Test
    void stringVazia(){
        assertFalse(objectTest.mixStart(""));
    }
}