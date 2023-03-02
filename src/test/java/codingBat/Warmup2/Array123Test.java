package codingBat.Warmup2;

import CodingBat.Warmup2.Array123;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array123Test {

    private Array123 objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new Array123();
    }

    @Test
    void comSequenciaComecandoNaPosicao1(){
        assertTrue(objectTest.array123(new int[]{1,2,3,1}));
    }

    @Test
    void comSequenciaComecandoNaPosicao2(){
        assertTrue(objectTest.array123(new int[]{6,1,2,3,5}));
    }

    @Test
    void comSequenciaComecandoNaUltimaPosicaoPossivel(){
        assertTrue(objectTest.array123(new int[]{1,7,8,1,2,3}));
    }

    @Test
    void semSequenciaPerfeitaPorCausaDo1(){
        assertFalse(objectTest.array123(new int[]{5,2,3,8}));
    }

    @Test
    void semSequenciaPerfeitaPorCausaDo2(){
        assertFalse(objectTest.array123(new int[]{1,5,3,8}));
    }

    @Test
    void semSequenciaPerfeitaPorCausaDo3(){
        assertFalse(objectTest.array123(new int[]{1,2,9}));
    }

    @Test
    void semNumerosDaSequencia(){
        assertFalse(objectTest.array123(new int[]{4,8,5,6}));
    }

}