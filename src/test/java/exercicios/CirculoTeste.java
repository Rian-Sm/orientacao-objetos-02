package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CirculoTeste {
    private Conta pessoa1;

    @BeforeEach
    public void beforeEAch(){
        pessoa1 = new Conta();
        pessoa1.setNumero(1);
        pessoa1.setLimite(1000.0);
        pessoa1.depositar(500.0);
    }
    @AfterEach
    public void afterEach(){
        pessoa1=null;
    }
    
}
