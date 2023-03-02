package codingBat.Warmup2;

import CodingBat.Warmup2.StringX;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringXTest {

    private StringX objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new StringX();
    }

    @Test
    void stringTamanho2ComXInicialXFinal(){
        assertEquals("XX", objectTest.stringX("XX"));
    }

    @Test
    void stringTamanho2ComXInicial(){
        assertEquals("XA", objectTest.stringX("XA"));
    }

    @Test
    void stringTamanho2ComXFinal(){
        assertEquals("ax", objectTest.stringX("ax"));
    }

    @Test
    void stringTamanho3ComXInicialXMEeioXFinal(){
        assertEquals("xx", objectTest.stringX("xxx"));
    }

    @Test
    void stringTamanho3ComXInicialXMeio(){
        assertEquals("xb", objectTest.stringX("xxb"));
    }

    @Test
    void stringTamanho3ComXFinal(){
        assertEquals("ax", objectTest.stringX("axx"));
    }

    @Test
    void stringTamanho4ComXInicialXFinal(){
        assertEquals("xax", objectTest.stringX("xaxx"));
    }

    @Test
    void stringTamanho4ComXInicial(){
        assertEquals("xsas", objectTest.stringX("xsas"));
    }

    @Test
    void stringTamanho4ComXMEeioXFinal(){
        assertEquals("asx", objectTest.stringX("axsx"));
    }

    @Test
    void stringVazia(){
        assertEquals("", objectTest.stringX(""));
    }

}