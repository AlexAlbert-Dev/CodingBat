package codingBat.Warmup2;

import CodingBat.Warmup2.Last2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Last2Test {

    private Last2 objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new Last2();
    }

    @Test
    void umaSubstringNoInicio(){
        assertEquals(1, objectTest.last2("hixxhi"));
    }

    @Test
    void umaSubstringNoMeio(){
        assertEquals(1, objectTest.last2("xxabxxab"));
    }

    @Test
    void umaSubstringNoFim(){
        assertEquals(1, objectTest.last2("igrejaja"));
    }

    @Test
    void duasSubstringNoInicio(){
        assertEquals(2, objectTest.last2("oioiolaoi"));
    }

    @Test
    void duasSubstringNoMeioEAfastadas(){
        assertEquals(2, objectTest.last2("xxabcxxx"));
    }

    @Test
    void stringVazia(){
        assertEquals(0, objectTest.last2(""));
    }
}