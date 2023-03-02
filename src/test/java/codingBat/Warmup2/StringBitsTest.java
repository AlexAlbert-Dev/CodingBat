package codingBat.Warmup2;

import CodingBat.Warmup2.StringBits;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBitsTest {

    private StringBits objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new StringBits();
    }

    @Test
    void stringComTamanho1(){
        assertEquals("A", objectTest.stringBits("A"));
    }

    @Test
    void stringComTamanho2(){
        assertEquals("O", objectTest.stringBits("Oi"));
    }

    @Test
    void stringComTamanho3(){
        assertEquals("Oa", objectTest.stringBits("Ola"));
    }

    @Test
    void stringComTamanho6(){
        assertEquals("Bai", objectTest.stringBits("Brasil"));
    }

    @Test
    void stringVazia(){
        assertEquals("", objectTest.stringBits(""));
    }
}