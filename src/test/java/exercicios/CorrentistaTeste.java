package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
    private Correntista pessoa1;

    @BeforeEach
    public void beforeEach(){
        pessoa1 = new Correntista();
        pessoa1.setNumero(1);
        pessoa1.depositar(1000.0);
    }
    @AfterEach
    public void afterEach(){
        pessoa1 = null;
    }

    @Test
    public void criarObjCorrentista(){
        assertNotNull(pessoa1);
    }
    @Test
    public void presencaAtributos(){
        assertNotNull(pessoa1.getSaldo());
        assertNotNull(pessoa1.getNumero());
    }
    @Test
    public void metodoSetNumero(){
        assertEquals(1, pessoa1.getNumero());
    }
    @Test
    public void metodoDepositar(){
        pessoa1.depositar(1000.0);
        assertEquals(2000.0, pessoa1.getSaldo());
    }
    @Test
    public void metodosacar(){
        pessoa1.sacar(500.0);
        assertEquals(500.0, pessoa1.getSaldo());
    }
    @Test
    public void metodoDepositarInvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> pessoa1.depositar(-200.0));
        assertEquals("processo invalido", exception.getMessage());
    }
    @Test
    public void metodoSacarInvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> pessoa1.sacar(-40.0));
        assertEquals("processo invalido", exception.getMessage());
    }
    @Test
    public void metodoSacarSaldoInsuficiente(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> pessoa1.sacar(2000.0));
        assertEquals("saldo insuficiente", exception.getMessage());
    }
    @Test
    public void metodoTransferir(){
        Correntista pessoa2 = new Correntista();
        pessoa1.transferir(pessoa2, 500.0);
        assertEquals(500.0, pessoa2.getSaldo());
    }
    @Test
    public void metodoTransferirSaldoInsuficiente(){
        Correntista pessoa2 = new Correntista();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> pessoa1.transferir(pessoa2, 2000.0));
        assertEquals("saldo insuficiente", exception.getMessage());
    }
}
