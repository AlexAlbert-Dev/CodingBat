package codingBat.Warmup2;

import CodingBat.Warmup2.ArrayFront9;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFront9Test {

    private ArrayFront9 objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new ArrayFront9();
    }

    @Test
    void numero9EmPrimeiro(){
        assertTrue(objectTest.arrayFront9(new int[]{9,2}));
    }

    @Test
    void numero9EmSegundo(){
        assertTrue(objectTest.arrayFront9(new int[]{0,9,2,3,6,7}));
    }

    @Test
    void numero9EmTerceiro(){
        assertTrue(objectTest.arrayFront9(new int[]{3,4,9}));
    }

    @Test
    void numero9EmQuarto(){
        assertTrue(objectTest.arrayFront9(new int[]{4,5,2,9,1,4,5,9}));
    }

    @Test
    void numero9DepoisDoQuarto(){
        assertFalse(objectTest.arrayFront9(new int[]{1,2,3,4,9}));
    }

    @Test
    void doisNumero9AntesDoQuinto(){
        assertTrue(objectTest.arrayFront9(new int[]{9,5,7,9,1,7}));
    }

    @Test
    void tresNumero9AntesDoQuinto(){
        assertTrue(objectTest.arrayFront9(new int[]{5,9,9,9,4}));
    }

    @Test
    void quatroNumero9AntesDoQuinto(){
        assertTrue(objectTest.arrayFront9(new int[]{9,9,9,9,5}));
    }

    @Test
    void semNumero9(){
        assertFalse(objectTest.arrayFront9(new int[]{1,2,3}));
    }
}