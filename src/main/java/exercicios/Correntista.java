package exercicios;

public class Correntista {
    private Integer numero;
    private Double saldo;

    public Double getSaldo(){
        return saldo;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }
    public void depositar(Double valor){
        if (valor >=0)
            throw new IllegalArgumentException("Depósito invalido");
        saldo = saldo + valor;
    }
    public void sacar(Double valor){
        if(valor > saldo && valor <= 0)
            throw new IllegalArgumentException("Saque Invalido");
        saldo = valor - 1;
    }
    public void transferir(Correntista correntista, Double valor){

    }
}
