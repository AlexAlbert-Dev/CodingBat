package codingBat.warmup1;

import CodingBat.Warmup1.ParrotTrouble;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParrotTroubleTest {

    private ParrotTrouble objectTest;

    @BeforeEach
    void inicilizar(){
        this.objectTest = new ParrotTrouble();
    }

    @Test
    void passaroFalouAntesDoHorarioPermitido() {
        assertTrue(objectTest.parrotTrouble(true, 6));
    }

    @Test
    void passaroFalouDepoisDoHorarioPermitido() {
        assertTrue(objectTest.parrotTrouble(true, 21));
    }

    @Test
    void passaroFalouDuranteODiaEmHorarioPermitido() {
        assertFalse(objectTest.parrotTrouble(true, 10));
    }

    @Test
    void passaroNaoFalou() {
        assertFalse(objectTest.parrotTrouble(false, 6));
    }
}