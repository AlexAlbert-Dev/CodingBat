package codingBat.warmup1;

import CodingBat.Warmup1.Max1020;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Max1020Test {

    private Max1020 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new Max1020();
    }

    @Test
    void primeiroMaiorAmbosDentroDoRange(){
        assertEquals(20, objectTest.max1020(20,10));
    }

    @Test
    void segundoMaiorAmbosDentroDoRange(){
        assertEquals(20, objectTest.max1020(10, 20));
    }

    @Test
    void primeiroMaiorEDentroDoRangeESegundoForaDoRange(){
        assertEquals(15, objectTest.max1020(15,8));
    }

    @Test
    void primeiroDentroDoRangeESegundoEMaiorEEstaForaDoRange(){
        assertEquals(15, objectTest.max1020(15,28));
    }


    @Test
    void segundoMaiorEDentroDoRangeEPrimeiroForaDoRange(){
        assertEquals(20, objectTest.max1020(8,20));
    }

    @Test
    void segundoDentroDoRangeEPrimeiroEMaiorEEstaForaDoRange(){
        assertEquals(18, objectTest.max1020(25,18));
    }

    @Test
    void ambosForaDeRange(){
        assertEquals(0,objectTest.max1020(8,23));
    }

}