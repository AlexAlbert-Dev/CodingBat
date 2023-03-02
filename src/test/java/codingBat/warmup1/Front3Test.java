package codingBat.warmup1;

import CodingBat.Warmup1.Front3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Front3Test {

    private Front3 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new Front3();
    }

    @Test
    void stringMaiorQue3(){
        assertEquals("JavJavJav", objectTest.front3("Java"));
    }

    @Test
    void stringIgualA3(){
        assertEquals("OlaOlaOla", objectTest.front3("Ola"));
    }

    @Test
    void stringMenorQue3(){
        assertEquals("OiOiOi", objectTest.front3("Oi"));
        assertEquals("AAA", objectTest.front3("A"));
        assertEquals("", objectTest.front3(""));
    }

}