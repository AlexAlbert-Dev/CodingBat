package codingBat.warmup1;

import CodingBat.Warmup1.Makes10;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Makes10Test {

    private Makes10 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new Makes10();
    }

    @Test
    void peloMenosUmDosParametrosE10(){
        assertTrue(objectTest.makes10(9, 10));
        assertTrue(objectTest.makes10(10, 8));
        assertTrue(objectTest.makes10(10,10));
    }

    @Test
    void nenhumDosParametrosE10ESuaSomaE10(){
        assertTrue(objectTest.makes10(9,1));
    }

    @Test
    void nenhumDosParametrosE10ESuaSomaNaoE10(){
        assertFalse(objectTest.makes10(9,2));
    }

    @Test
    void peloMenosUmDosParametrosE10ESuaSomaE10(){
        assertTrue(objectTest.makes10(10,0));
        assertTrue(objectTest.makes10(0,10));
    }
}