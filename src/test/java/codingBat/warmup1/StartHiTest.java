package codingBat.warmup1;

import CodingBat.Warmup1.StartHi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartHiTest {

    private StartHi objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new StartHi();
    }

    @Test
    void stringComecaComHi(){
        assertTrue(objectTest.startHi("hi there"));
    }

    @Test
    void stringNaoComecaComHi(){
        assertFalse(objectTest.startHi("hello hi"));
    }


}