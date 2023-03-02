package codingBat.warmup1;

import CodingBat.Warmup1.MissingChar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingCharTest {

    private MissingChar objectTest;

    @BeforeAll
    void inicializar(){
        this.objectTest = new MissingChar();
    }

    @Test
    void retiradaDeLetras(){
        assertEquals("tentand", objectTest.missingChar("tentando", 7));
        assertEquals("lve", objectTest.missingChar("love", 1));
    }

}