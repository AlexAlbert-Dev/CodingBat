package codingBat.Warmup2;

import CodingBat.Warmup2.StringYak;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringYakTest {

    private StringYak objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new StringYak();
    }

    @Test
    void stringIniciandoComYAK(){
        assertEquals("sol", objectTest.stringYak("yaksol"));
    }

    @Test
    void stringFinalizandoComYAK(){
        assertEquals("git", objectTest.stringYak("gityak"));
    }

    @Test
    void stringComYAKNoMeio(){
        assertEquals("java8", objectTest.stringYak("javayak8"));
    }

    @Test
    void stringComYAKComCharADiferente(){
        assertEquals("java", objectTest.stringYak("ybkjava"));
    }

    @Test
    void stringComDoisYAK(){
        assertEquals("Alex", objectTest.stringYak("yakAlexyak"));
    }

    @Test
    void stringComDoisYAKComCharADiferente(){
        assertEquals("banana", objectTest.stringYak("ybkbananayck"));
    }

    @Test
    void stringSemYAK(){
        assertEquals("Nomus", objectTest.stringYak("Nomus"));
    }

    @Test
    void stringVazia(){
        assertEquals("", objectTest.stringYak(""));
    }

}