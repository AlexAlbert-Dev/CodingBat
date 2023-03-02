package codingBat.warmup1;

import CodingBat.Warmup1.StringE;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringETest {

    private StringE objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new StringE();
    }

    @Test
    void contem1EStringTamanho1(){
        assertTrue(objectTest.stringE("e"));
    }

    @Test
    void contem1EStringTamanho2(){
        assertTrue(objectTest.stringE("le"));
    }

    @Test
    void contem1EStringTamanho3(){
        assertTrue(objectTest.stringE("leo"));
    }

    @Test
    void contem1EStringMaiorQue3(){
        assertTrue(objectTest.stringE("evaristo"));
    }

    @Test
    void contem2EStringTamanho2(){
        assertTrue(objectTest.stringE("ee"));
    }

    @Test
    void contem2EStringTamanho3(){
        assertTrue(objectTest.stringE("ele"));
    }

    @Test
    void contem2EStringMaiorQue3(){
        assertTrue(objectTest.stringE("eles"));
    }

    @Test
    void contem3EStringTamanho3(){
        assertTrue(objectTest.stringE("eee"));
    }

    @Test
    void contem3EStringMaiorQue3(){
        assertTrue(objectTest.stringE("leee"));
    }

    @Test
    void contemMaisDe3EStringMaiorQue3(){
        assertFalse(objectTest.stringE("lelelele"));
    }

    @Test
    void naoContemE(){
        assertFalse(objectTest.stringE("java"));
    }

    @Test
    void stringVazia(){
        assertFalse(objectTest.stringE(""));
    }
}