package codingBat.warmup1;

import CodingBat.Warmup1.Or35;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Or35Test {

    private Or35 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new Or35();
    }

    @Test
    void numeroMultiploDe3(){
        assertTrue(objectTest.or35(3));
        assertTrue(objectTest.or35(30));
        assertTrue(objectTest.or35(42));
    }

    @Test
    void numeroMultiploDe5(){
        assertTrue(objectTest.or35(10));
        assertTrue(objectTest.or35(95));
        assertTrue(objectTest.or35(1025));
    }
    @Test
    void numeroNaoMultiploDe3ENaoMultiploDe5(){
        assertFalse(objectTest.or35(2));
    }


}