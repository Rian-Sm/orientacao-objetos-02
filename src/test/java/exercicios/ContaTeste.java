package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
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

    @Test
    public void criacaoObjConta(){
        assertNotNull(pessoa1);
    }
    @Test
    public void presencaAtributos(){
        assertNotNull(pessoa1.getNumero());
        assertNotNull(pessoa1.getSaldo());
        assertNotNull(pessoa1.getLimite());
    }
    @Test
    public void metodosGetConta(){
        assertEquals(1, pessoa1.getNumero());
        assertEquals(1000.0, pessoa1.getLimite());
        assertEquals(500.0, pessoa1.getSaldo());
    }

    @Test
    public void metodosSetConta(){
        pessoa1.setLimite(200.0);
        pessoa1.setNumero(100);
        assertEquals(200.0, pessoa1.getLimite());
        assertEquals(100, pessoa1.getNumero());
    }
    @Test
    public void metodoDepositar(){
        pessoa1.depositar(1000.0);
        assertEquals(1500.0, pessoa1.getSaldo());
    }
    @Test
    public void metodoDepositarInvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> pessoa1.depositar(-1000.0)) ;
        assertEquals("valor invalido", exception.getMessage());
    }
    @Test
    public void metodoSacar(){
        pessoa1.sacar(250.0);
        assertEquals(250.0, pessoa1.getSaldo());
    }@Test
    public void metodoSacarLimite(){
        pessoa1.sacar(600.0);
        assertEquals(-100.0, pessoa1.getSaldo());
    }
    @Test
    public void metodoSacarInvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> pessoa1.sacar(-100.0)) ;
        assertEquals("valor invalido", exception.getMessage());
    }
    @Test
    public void metodoSacarSaldoInsuficiente(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> pessoa1.sacar(1525.0)) ;
        assertEquals("passou dos limites", exception.getMessage());
    }
    @Test
    public void metodoTransferir(){
        Conta pessoa2 = new Conta();
        pessoa1.transferir(pessoa2, 600.0);
        assertEquals(600.0, pessoa2.getSaldo());
    }
}
