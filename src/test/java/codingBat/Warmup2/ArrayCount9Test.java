package codingBat.Warmup2;

import CodingBat.Warmup2.ArrayCount9;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCount9Test {

    private ArrayCount9 objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new ArrayCount9();
    }

    @Test
    void arrayComUm9(){
        assertEquals(1, objectTest.arrayCount9(new int[]{1,2,9}));
    }

    @Test
    void arrayComDois9(){
        assertEquals(2, objectTest.arrayCount9(new int[]{1,8,9,9}));
        assertEquals(2, objectTest.arrayCount9(new int[]{1,2,9,9}));
        assertEquals(2, objectTest.arrayCount9(new int[]{1,8,2,9,9}));
    }

    @Test
    void arrayComTres9(){
        assertEquals(3, objectTest.arrayCount9(new int[]{1,8,9,2,9,9}));
    }

    @Test
    void arrayVazio(){
        assertEquals(0, objectTest.arrayCount9(new int[]{}));
    }

}