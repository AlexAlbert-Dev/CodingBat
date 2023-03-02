package codingBat.warmup1;

import CodingBat.Warmup1.IoneTeen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IoneTeenTest {

    private IoneTeen objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new IoneTeen();
    }

    @Test
    void primeiroDentroDoRange(){
        assertTrue(objectTest.loneTeen(15,21));
    }

    @Test
    void segundoDentroDoRange(){
        assertTrue(objectTest.loneTeen(12,17));
    }

    @Test
    void primeiroESegundoDentroDoRange(){
        assertFalse(objectTest.loneTeen(13,19));
    }

    @Test
    void nenhumDentroDoRange(){
        assertFalse(objectTest.loneTeen(12,20));
    }

}