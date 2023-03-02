package codingBat.warmup1;

import CodingBat.Warmup1.IntMax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntMaxTest {
    private IntMax objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new IntMax();
    }

    @Test
    void primeiroEOMaior(){
        assertEquals(3, objectTest.intMax(3,2,1));
    }

    @Test
    void segundoEOMaior(){
        assertEquals(28, objectTest.intMax(6,28,16));
    }

    @Test
    void terceiroEOMaior(){
        assertEquals(31, objectTest.intMax(24,10,31));
    }

    @Test
    void primeiroESegundoIguaisEMaiores(){
        assertEquals(7, objectTest.intMax(7,7,2));
    }

    @Test
    void primeiroETerceiroIguaisEMaiores(){
        assertEquals(9, objectTest.intMax(9,6,9));
    }

    @Test
    void segundoETerceiroIguaisEMaiores(){
        assertEquals(11, objectTest.intMax(3,11,11));
    }

    @Test
    void todosIguais(){
        assertEquals(1, objectTest.intMax(1,1,1));
    }
}