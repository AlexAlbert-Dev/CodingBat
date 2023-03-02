package codingBat.warmup1;

import CodingBat.Warmup1.MonkeyTrouble;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MonkeyTroubleTest {

    private MonkeyTrouble objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new MonkeyTrouble();
    }

    @Test
    void somenteMacacoASorri(){
        assertFalse(objectTest.monkeyTrouble(true, false));
    }

    @Test
    void somenteMacacoBSorri(){
        assertFalse(objectTest.monkeyTrouble(false, true));
    }

    @Test
    void nenhumMacacoSorri(){
        assertTrue(objectTest.monkeyTrouble(false, false));
    }

    @Test
    void osDoisMacacosSorriem(){
        assertTrue(objectTest.monkeyTrouble(true, true));
    }
}