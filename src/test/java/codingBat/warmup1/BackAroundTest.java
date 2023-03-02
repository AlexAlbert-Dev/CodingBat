package codingBat.warmup1;


import CodingBat.Warmup1.BackAround;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackAroundTest {

    private BackAround objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new BackAround();
    }

    @Test
    public void testandoSeAdicionaCorretamenteOCharInicial(){
        String s = "cat";
        assertEquals("tcat", objectTest.backAround(s).substring(0, s.length()+1));
    }

    @Test
    public void testandoSeAdicionaCorretamenteOCharFinal(){
        String s = "Hello";
        assertEquals("Helloo", objectTest.backAround(s).substring(1));
    }
}