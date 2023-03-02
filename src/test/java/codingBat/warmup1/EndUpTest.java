package codingBat.warmup1;

import CodingBat.Warmup1.EndUp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndUpTest {

    private EndUp objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new EndUp();
    }

    @Test
    void stringComMaisDe3Caracteres(){
        assertEquals("ALEX", objectTest.endUp("Alex"));
    }

    @Test
    void stringCom3Caracteres(){
        assertEquals("SOL", objectTest.endUp("sol"));
    }

    @Test
    void stringCom2Caracteres(){
        assertEquals("OI", objectTest.endUp("oi"));
    }
    @Test
    void stringCom1Caracter(){
        assertEquals("A", objectTest.endUp("a"));
    }

    @Test
    void stringVazia(){
        assertEquals("", objectTest.endUp(""));
    }


}