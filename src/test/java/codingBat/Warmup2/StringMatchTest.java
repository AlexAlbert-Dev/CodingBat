package codingBat.Warmup2;

import CodingBat.Warmup2.StringMatch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMatchTest {

    private StringMatch objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new StringMatch();
    }

    @Test
    void stringTamanho1(){
        assertEquals(0, objectTest.stringMatch("a","a"));
    }

    @Test
    void stringTamanho2SemSubstring(){
        assertEquals(0, objectTest.stringMatch("ab","cd"));
    }

    @Test
    void stringTamanho2Com1Substring(){
        assertEquals(1, objectTest.stringMatch("abg","ab"));
    }

    @Test
    void stringTamanho3SemSubstring(){
        assertEquals(0, objectTest.stringMatch("abc","cder"));
    }

    @Test
    void stringTamanho3Com1Substring(){
        assertEquals(1, objectTest.stringMatch("abc","dbc"));
    }

    @Test
    void stringTamanho3Com2Substring(){
        assertEquals(2, objectTest.stringMatch("abc","abc"));
    }

    @Test
    void stringTamanho4Com1Substring(){
        assertEquals(1, objectTest.stringMatch("abcd","abdcef"));
    }

    @Test
    void stringTamanho4Com2Substring(){
        assertEquals(2, objectTest.stringMatch("abcdt","abctd"));
    }

    @Test
    void stringTamanho4Com3Substring(){
        assertEquals(3, objectTest.stringMatch("abcd","abcd"));
    }

    @Test
    void stringVazia(){
        assertEquals(0, objectTest.stringMatch("",""));
    }

}