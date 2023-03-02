package codingBat.Warmup2;

import CodingBat.Warmup2.Array667;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array667Test {
    private Array667 objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new Array667();
    }

    @Test
    void doisSeis(){
        assertEquals(1, objectTest.array667(new int[]{6,6,2}));
    }

    @Test
    void doisSeisEDepoisUmSeis(){
        assertEquals(1, objectTest.array667(new int[]{6,6,4,3,6,}));
    }

    @Test
    void doisSeisEDepoisDoisSeis(){
        assertEquals(2, objectTest.array667(new int[]{6,6,2,6,6,}));
    }

    @Test
    void umSeisEUmSete(){
        assertEquals(1, objectTest.array667(new int[]{2,6,7}));
    }

    @Test
    void doisSeisEUmSete(){
        assertEquals(2, objectTest.array667(new int[]{6,6,7,1}));
    }

    @Test
    void nenhumSeis(){
        assertEquals(0, objectTest.array667(new int[]{1,2,3,4}));
    }

    @Test
    void umSeisSozinho(){
        assertEquals(0, objectTest.array667(new int[]{4,6,1,2}));
    }
}