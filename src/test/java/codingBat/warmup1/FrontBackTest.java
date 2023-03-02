package codingBat.warmup1;


import CodingBat.Warmup1.FrontBack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrontBackTest {

    private FrontBack objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new FrontBack();
    }

    @Test
    void testandoTrocaCaracteresDePalavra(){
        assertEquals("oatp", objectTest.frontBack("pato"));
    }

    @Test
    void testandoTrocaCaracteresDeLetra(){
        assertEquals("a", objectTest.frontBack("a"));
    }

    @Test
    void testandoTrocaCaracteresDeStringVazia(){
        assertEquals("", objectTest.frontBack(""));
    }

}