package codingBat.warmup1;

import CodingBat.Warmup1.PosNeg;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class posNegTest {

    private PosNeg objectTest;

    @BeforeEach
    void inicilizar(){
        this.objectTest = new PosNeg();
    }

    @Test
    void aPositivoBPositivoParametroNegativoVerdadeiro(){
        assertFalse(objectTest.posNeg(2,6,true));
    }

    @Test
    void aNegativoBPositivoParametroNegativoVerdadeiro(){
        assertFalse(objectTest.posNeg(-2,6,true));
    }

    @Test
    void aPositivoBNegativoParametroNegativoVerdadeiro(){
        assertFalse(objectTest.posNeg(2,-6,true));
    }

    @Test
    void aNegativoBNegativoParametroNegativoVerdadeiro(){
        assertTrue(objectTest.posNeg(-2,-6,true));
    }

    @Test
    void aPositivoBPositivoParametroNegativoFalso(){
        assertFalse(objectTest.posNeg(2,6,false));
    }

    @Test
    void aNegativoBPositivoParametroNegativoFalso(){
        assertTrue(objectTest.posNeg(-2,6,false));
    }

    @Test
    void aPositivoBNegativoParametroNegativoFalso(){
        assertTrue(objectTest.posNeg(2,-6,false));
    }

    @Test
    void aNegativoBNegativoParametroNegativoFalso(){
        assertFalse(objectTest.posNeg(-2,-6,false));
    }

}