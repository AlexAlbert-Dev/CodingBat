package codingBat.warmup1;

import CodingBat.Warmup1.EveryNth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EveryNthTest {

    private EveryNth objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new EveryNth();
    }

    @Test
    void stringMaiorQueEnesimoENPar(){
        assertEquals("Wrrf", objectTest.everyNth("Warcraft", 2));
    }

    @Test
    void stringMaiorQueEnesimoENImpar(){
        assertEquals("Pi", objectTest.everyNth("Praia", 3));
    }

    @Test
    void stringMenorQueEnesimoENPar(){
        assertEquals("M", objectTest.everyNth("Matematica", 14));
    }

    @Test
    void stringMenorQueEnesimoENImpar(){
        assertEquals("L", objectTest.everyNth("Luz", 5));
    }

    @Test
    void stringComCaracteresIguais(){
        assertEquals("AAAD", objectTest.everyNth("ABABARDB",2));
    }

    @Test
    void stringComEnesimoNoUltimoCaracter(){
        assertEquals("Lar", objectTest.everyNth("Lutador",3));
    }
}