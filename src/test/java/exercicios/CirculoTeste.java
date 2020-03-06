package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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
    

}
