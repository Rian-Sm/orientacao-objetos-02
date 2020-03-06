package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {
    private Circulo c1;

    @BeforeEach
    public void beforeEach(){
        c1 = new Circulo();
    }
    @AfterEach
    public void afterEach(){
        c1 = null;
    }

    @Test
    public void criarObjCirculo(){
        assertNotNull(c1);
    }

    @Test
    public void metodoSetCirculo(){
        c1.setRaio(10.0);
        assertEquals(10.0, c1.getRaio());
    }

    @Test
    public void presencaAtributos(){
        c1.setRaio(10.0);
        assertNotNull(c1.getRaio());
    }

    @Test
    public void metodoCalcularArea(){
        c1.setRaio(2.0);
        assertEquals(12.566370614359172953850573533118, c1.CalcularArea());
    }

    @Test
    public void metodoCalcularPerimetro(){
        c1.setRaio(2.0);
        assertEquals(12.566370614359172953850573533118, c1.calcularPerimetro());
    }
}
