package codingBat.Warmup2;

import CodingBat.Warmup2.FrontTimes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontTimesTest {

    private FrontTimes objectTest;

    @BeforeEach
    void inicializar() {
        this.objectTest = new FrontTimes();
    }

    @Test
    void repetir2VezesStringMaiorQueComprimento3() {
        assertEquals("ArrArr",
                objectTest.frontTimes("Arroz", 2));
    }

    @Test
    void repetir5VezesStringMaiorQueComprimento3() {
        assertEquals("AleAleAleAleAle",
                objectTest.frontTimes("Alex", 5));
    }

    @Test
    void repetir3VezesStringMenorQueComprimento3() {
        assertEquals("OiOiOi", objectTest.frontTimes("Oi", 3));
    }

    @Test
    void repetir3VezesStringVazia() {
        assertEquals("", objectTest.frontTimes("", 3));
    }
}