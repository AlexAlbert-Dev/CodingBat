package codingBat.Warmup2;

import CodingBat.Warmup2.DoubleX;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleXTest {

    private DoubleX objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new DoubleX();
    }

    @Test
    void stringComInstanciaNaPrimeira(){
        assertTrue(objectTest.doubleX("xxrroz"));
    }

    @Test
    void stringComInstanciaNaPrimeiraENoDecorrerDaString(){
        assertTrue(objectTest.doubleX("xxx"));
    }

    @Test
    void stringComInstanciaAposAPrimeira(){
        assertFalse(objectTest.doubleX("axaxx"));
    }

    @Test
    void stringSemInstanciaComXNoFinal(){
        assertFalse(objectTest.doubleX("aaax"));
    }

    @Test
    void stringVazia(){
        assertFalse(objectTest.doubleX(""));
    }
}