package codingBat.warmup1;

import CodingBat.Warmup1.HasTeen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasTeenTest {

    private HasTeen objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new HasTeen();
    }

    @Test
    void primeiroDentroDoRange(){
        assertTrue(objectTest.hasTeen(13,12,20));
    }

    @Test
    void segundoDentroDoRange(){
        assertTrue(objectTest.hasTeen(12,14,22));
    }

    @Test
    void terceiroDentroDoRange(){
        assertTrue(objectTest.hasTeen(12,21,19));
    }

    @Test
    void primeiroESegundoDentroDoRange(){
        assertTrue(objectTest.hasTeen(14,19,64));
    }

    @Test
    void primeiroETerceiroDentroDoRange(){
        assertTrue(objectTest.hasTeen(13,43,18));
    }

    @Test
    void segundoETerceiroDentroDoRange(){
        assertTrue(objectTest.hasTeen(2,16,19));
    }

    @Test
    void todosDentroDoRange(){
        assertTrue(objectTest.hasTeen(15,16,17));
    }

    @Test
    void nenhumDentroDoRange(){
        assertFalse(objectTest.hasTeen(9,23,34));
    }

}