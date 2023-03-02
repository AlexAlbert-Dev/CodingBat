package codingBat.Warmup2;

import CodingBat.Warmup2.CountXX;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountXXTest {

    private CountXX objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new CountXX();
    }

    @Test
    void stringCom1XX(){
        assertEquals(1, objectTest.countXX("xxTentacion"));
        assertEquals(1, objectTest.countXX("Numberxx"));
    }

    @Test
    void stringCom2XX(){
        assertEquals(2, objectTest.countXX("xxMarrocosxx"));
        assertEquals(2, objectTest.countXX("Alexxx"));
    }

    @Test
    void stringCom3XX(){
        assertEquals(3, objectTest.countXX("xxCorinthiansxxx"));
    }

    @Test
    void stringCom0XX(){
        assertEquals(0, objectTest.countXX("Nomus"));
    }

    @Test
    void stringVazia(){
        assertEquals(0, objectTest.countXX(""));
    }
}