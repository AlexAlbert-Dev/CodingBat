package codingBat.warmup1;

import CodingBat.Warmup1.Close10;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Close10Test {

    private Close10 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new Close10();
    }

    @Test
    void primeiroNumeroEOMaiorEMaisProximo(){
        assertEquals(11, objectTest.close10(11,8));
    }

    @Test
    void primeiroNumeroEOMaisProximoEOSegundoEOMaior(){
        assertEquals(8, objectTest.close10(8,13));
    }

    @Test
    void segundoNumeroEOMaiorEOMaisProximo(){
        assertEquals(14, objectTest.close10(3, 14));
    }

    @Test
    void segundoNumeroEOMaisProximoEOPrimeiroEOMaior(){
        assertEquals(13, objectTest.close10(18,13));
    }

    @Test
    void empateMaisProximo(){
        assertEquals(0, objectTest.close10(10,10));
        assertEquals(0, objectTest.close10(-2,-2));
        assertEquals(0, objectTest.close10(7,13));
    }


}