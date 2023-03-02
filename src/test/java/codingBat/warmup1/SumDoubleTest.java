package codingBat.warmup1;

import CodingBat.Warmup1.SumDouble;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumDoubleTest {

    private SumDouble objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new SumDouble();
    }

    @Test
    void parametrosDiferentes() {
        assertEquals(10, objectTest.sumDouble(4, 6));
    }

    @Test
    void parametrosIguais(){
        assertEquals(40, objectTest.sumDouble(10,10));
    }
}