package codingBat.warmup1;

import CodingBat.Warmup1.SleepIn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepInTest {

    private SleepIn objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new SleepIn();
    }

    @Test
    public void naoDormirAteTarde(){
        assertFalse(objectTest.sleepIn(true, false));
    }

    @Test
    public void DormirAteTardeNoMeioDaSemanaPorCausaDasFerias(){
        assertTrue(objectTest.sleepIn(true, true));
    }

    @Test
    public void DormirAteTardeNoFimDeSemanaDasFerias(){
        assertTrue(objectTest.sleepIn(false,false));
    }
    @Test
    public void DormirAteTardePorSerFimDeSemana(){
        assertTrue(objectTest.sleepIn(false,false));
    }
}