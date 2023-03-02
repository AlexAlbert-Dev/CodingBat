package codingBat.warmup1;

import CodingBat.Warmup1.IcyHot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IcyHotTest {

    private IcyHot objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new IcyHot();
    }

    @Test
    void temp1MaiorQue100temp2MaiorQue0(){
        assertFalse(objectTest.icyHot(101,1));
    }

    @Test
    void temp1MaiorQue100temp2MenorQue0(){
        assertTrue(objectTest.icyHot(101,-1));
    }


    @Test
    void temp1MenorQue0temp2MaiorQue100(){
        assertTrue(objectTest.icyHot(-1,101));
    }

    @Test
    void temp1MaiorQue0temp2MaiorQue100(){
        assertFalse(objectTest.icyHot(1,101));
    }

    @Test
    void temp1MaiorQue100temp2MaiorQue100(){
        assertFalse(objectTest.icyHot(101,101));
    }

    @Test
    void temp1MenorQue0temp2MenorQue0(){
        assertFalse(objectTest.icyHot(-1,-1));
    }






}