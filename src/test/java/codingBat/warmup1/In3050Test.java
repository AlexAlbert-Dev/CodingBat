package codingBat.warmup1;

import CodingBat.Warmup1.In3050;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In3050Test {

    private In3050 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new In3050();
    }

    @Test
    void ambosDentroDoPrimeiroRange(){
        assertTrue(objectTest.in3050(31,40));
    }

    @Test
    void ambosDentroDoSegundoRange(){
        assertTrue(objectTest.in3050(41,50));
    }

    @Test
    void primeiroESegundoRespectivamenteDentroDoPrimeiroESegundoRange(){
        assertFalse(objectTest.in3050(31,50));
    }

    @Test
    void primeiroESegundoRespectivamenteDentroDoSegundoEPrimeiroRange(){
        assertFalse(objectTest.in3050(50,39));
    }

    @Test
    void primeiroDentroDoPrimeiroRangeESegundoForaDeRange(){
        assertFalse(objectTest.in3050(40,51));
    }

    @Test
    void primeiroDentroDoSegundoRangeESegundoForaDeRange(){
        assertFalse(objectTest.in3050(50,29));
    }

    @Test
    void segundoDentroDoPrimeiroRangeEPrimeiroForaDeRange(){
        assertFalse(objectTest.in3050(29,40));
    }

    @Test
    void segundoDentroDoSegundoRangeEPrimeiroForaDeRange(){
        assertFalse(objectTest.in3050(29,50));
    }

    @Test
    void ambosForaDeRange(){
        assertFalse(objectTest.in3050(29,51));
    }
}