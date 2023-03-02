package codingBat.warmup1;

import CodingBat.Warmup1.In1020;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In1020Test {

    private In1020 objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new In1020();
    }

    @Test
    void primeiroDentroDoRange(){
       assertTrue(objectTest.in1020(13, 101));
        assertTrue(objectTest.in1020(10, 101));
    }

    @Test
    void segundoDentroDoRange(){
        assertTrue(objectTest.in1020(-2,19));
        assertTrue(objectTest.in1020(-2,20));
    }

    @Test
    void primeiroESegundoDentroDoRange(){
        assertTrue(objectTest.in1020(16,17));
    }
    @Test
    void nenhumDentroDoRange(){
        assertFalse(objectTest.in1020(4,-7));
    }


}