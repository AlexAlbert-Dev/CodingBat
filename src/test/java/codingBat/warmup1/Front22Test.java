package codingBat.warmup1;

import CodingBat.Warmup1.Front22;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front22Test {

    private Front22 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new Front22();
    }

    @Test
    void stringMaiorQue2(){
        assertEquals("SaSapoSa", objectTest.front22("Sapo"));
    }

    @Test
    void stringIgualA2(){
        assertEquals("HaHaHa", objectTest.front22("Ha"));
    }

    @Test
    void stringVazia(){
        assertEquals("", objectTest.front22(""));
    }
}