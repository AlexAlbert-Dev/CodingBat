package codingBat.Warmup2;

import CodingBat.Warmup2.AltPairs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AltPairsTest {

    private AltPairs objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new AltPairs();
    }

    @Test
    void stringComTamanho1(){
        assertEquals("A", objectTest.altPairs("A"));
    }

    @Test
    void stringComTamanho2(){
        assertEquals("Ai", objectTest.altPairs("Ai"));
    }

    @Test
    void stringComTamanho4(){
        assertEquals("Al", objectTest.altPairs("Alex"));
    }

    @Test
    void stringComTamanho5(){
        assertEquals("Nos", objectTest.altPairs("Nomus"));
    }

    @Test
    void stringComTamanho6(){
        assertEquals("Sena", objectTest.altPairs("Semana"));
    }

    @Test
    void stringComTamanho9(){
        assertEquals("TeeAa", objectTest.altPairs("TesteAgua"));
    }

    @Test
    void stringComTamanho10(){
        assertEquals("TeeAas", objectTest.altPairs("TesteAguas"));
    }

    @Test
    void stringVazia(){
        assertEquals("", objectTest.altPairs(""));
    }

}