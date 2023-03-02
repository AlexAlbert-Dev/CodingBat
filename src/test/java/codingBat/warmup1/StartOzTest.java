package codingBat.warmup1;

import CodingBat.Warmup1.StartOz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartOzTest {

    private StartOz objectTest;

    @BeforeEach
    void inicializar(){
        this.objectTest = new StartOz();
    }

    @Test
    void somentePrimeiroCharCompativel(){
        assertEquals("o",objectTest.startOz("orlando"));
    }

    @Test
    void somenteSegundoCharCompativel(){
        assertEquals("z",objectTest.startOz("azuma"));
    }

    @Test
    void primeiroESegundoCharCompativel(){
        assertEquals("oz",objectTest.startOz("ozMandrake"));
    }

    @Test
    void nenhumCharCompativelEStringMaiorIgualQue2(){
        assertEquals("",objectTest.startOz("alex"));
    }

    @Test
    void primeiroCharCompativelStringTamanho1(){
        assertEquals("o",objectTest.startOz("o"));
    }

    @Test
    void segundoCharCompativelStringTamanho2(){
        assertEquals("z",objectTest.startOz("az"));
    }

    @Test
    void segundoCharCompativelStringTamanho2ComStringIniciandoComZ(){
        assertEquals("z",objectTest.startOz("zz"));
    }

    @Test
    void primeiroESegundoCharCompativelStringTamanho2(){
        assertEquals("oz",objectTest.startOz("oz"));
    }

    @Test
    void stringVazia(){
        assertEquals("",objectTest.startOz(""));
    }
}