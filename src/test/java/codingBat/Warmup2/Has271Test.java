package codingBat.Warmup2;

import CodingBat.Warmup2.Has271;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Has271Test {

    private Has271 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new Has271();
    }

    @Test
    void sequencia271(){
        assertTrue(objectTest.has271(new int[]{1,2,7,1}));
    }

    @Test
    void sequencia270(){
        assertTrue(objectTest.has271(new int[]{2,7,0,3}));
    }

    @Test
    void sequencia272(){
        assertTrue(objectTest.has271(new int[]{3,2,7,2}));
    }

    @Test
    void sequencia273(){
        assertTrue(objectTest.has271(new int[]{4,2,7,3}));
    }

    @Test
    void sequencia274(){
        assertFalse(objectTest.has271(new int[]{4,2,7,4}));
    }


//    @Test
//    void sequencia382(){
//        assertTrue(objectTest.has271(new int[]{}));
//    }
//
//    @Test
//    void sequencia381(){
//        assertTrue(objectTest.has271(new int[]{}));
//    }
//    @Test
//    void sequencia380(){
//        assertTrue(objectTest.has271(new int[]{}));
//    }
//
//    @Test
//    void sequencia383(){
//        assertTrue(objectTest.has271(new int[]{}));
//    }
//
//    @Test
//    void sequencia384(){
//        assertTrue(objectTest.has271(new int[]{}));
//    }

    @Test
    void semSequencia(){
        assertFalse(objectTest.has271(new int[]{1,2,8,1}));
    }

}