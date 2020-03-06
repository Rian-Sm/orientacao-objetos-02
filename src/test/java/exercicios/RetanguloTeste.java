package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
    private Retangulo r1;

    @BeforeEach
    public void beforeEach(){
        r1 = new Retangulo();
    }
    @AfterEach
    public void afterEach(){
        r1 = null;
    }

    @Test
    public void presencaObjRetangulo(){
        assertNotNull(r1);
    }

    @Test
    public  void presencaAtributo(){
        r1.setAltura(10.0);
        r1.setBase(10.0);
        assertNotNull(r1.getAltura());
        assertNotNull(r1.getBase());
    }

    @Test
    public void metodoSetRetangulo(){
        r1.setAltura(10.0);
        r1.setBase(20.0);
        assertEquals(10.0, r1.getAltura());
        assertEquals(20.0, r1.getBase());
    }

    @Test
    public void metodoCalcularArea(){
        r1.setAltura(10.0);
        r1.setBase(20.0);
        assertEquals(200.0, r1.calcularArea());
    }
    @Test
    public void metodoCalcularPerimetro(){
        r1.setAltura(10.0);
        r1.setBase(20.0);
        assertEquals(60.0, r1.calcularPerimetro());
    }
}
