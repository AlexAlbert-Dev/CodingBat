package codingBat.Warmup2;

import CodingBat.Warmup2.NoTriples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoTriplesTest {

    private NoTriples objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new NoTriples();
    }

    @Test
    void com1Triple(){
        assertFalse(objectTest.noTriples(new int[]{1,1,2,2,2,1}));
    }

    @Test
    void com2Triple(){
        assertFalse(objectTest.noTriples(new int[]{1,1,1,1,2,2,2,4}));
    }

    @Test
    void semTriple(){
        assertTrue(objectTest.noTriples(new int[]{1,2,3,4,5}));
    }

}