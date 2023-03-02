package codingBat.warmup1;

import CodingBat.Warmup1.NotString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotStringTest {

    private NotString objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new NotString();
    }

    @Test
    void stringComecaComNot(){
        assertEquals("not x", objectTest.notString("not x"));
    }

    @Test
    void stringNaoComecaComNot(){
        assertEquals("not candy", objectTest.notString("candy"));
    }
}