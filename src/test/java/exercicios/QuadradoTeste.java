package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTeste {
    private Quadrado q1;

    @BeforeEach
    public void beforeEach(){
        q1 = new Quadrado();
    }
    @AfterEach
    public void afterEach(){
        q1 = null;
    }

    @Test
    public void presencaObjQuadrado(){
        assertNotNull(q1);
    }

    @Test
    public void presencaAtributos(){
        q1.setLado(20.0);
        assertNotNull(q1.getLado());
    }

    @Test
    public void metodoSetLado(){
        q1.setLado(20.0);
        assertEquals(20.0, q1.getLado());
    }
    
    @Test
    public void metodoCalcularArea(){
        q1.setLado(20.0);
        assertEquals(400.0, q1.calcularArea());
    }

    @Test
    public void metodoCalcularPerimetro(){
        q1.setLado(20.0);
        assertEquals(80.0, q1.calcularPerimetro());
    }
}
