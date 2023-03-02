package codingBat.warmup1;

import CodingBat.Warmup1.DelDel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelDelTest {

    private DelDel objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new DelDel();
    }

    @Test
    void stringComStringDelIniciandoNoIndice1(){
        assertEquals("abc", objectTest.delDel("adelbc"));
    }

    @Test
    void stringComStringDelMasNaoIniciandoNoIndice1(){
        assertEquals("delabc", objectTest.delDel("delabc"));
        assertEquals("abdelc", objectTest.delDel("abdelc"));
        assertEquals("del", objectTest.delDel("del"));
    }

    @Test
    void stringSemStringDel(){
        assertEquals("pato", objectTest.delDel("pato"));
    }

    @Test
    void stringMenorQue3(){
        assertEquals("pa", objectTest.delDel("pa"));
    }

    @Test
    void stringVazia(){
        assertEquals("", objectTest.delDel(""));
    }

}