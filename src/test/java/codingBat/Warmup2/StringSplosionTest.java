package codingBat.Warmup2;

import CodingBat.Warmup2.StringSplosion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplosionTest {

    private StringSplosion objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new StringSplosion();
    }

    @Test
    void stringTamanho1(){
        assertEquals("a", objectTest.stringSplosion("a"));
    }

    @Test
    void stringTamanho2(){
        assertEquals("aab", objectTest.stringSplosion("ab"));
    }

    @Test
    void stringTamanho3(){
        assertEquals("aababc", objectTest.stringSplosion("abc"));
    }

    @Test
    void stringTamanho4(){
        assertEquals("aababcabcd", objectTest.stringSplosion("abcd"));
    }

    @Test
    void stringVazia(){
        assertEquals("", objectTest.stringSplosion(""));
    }

}