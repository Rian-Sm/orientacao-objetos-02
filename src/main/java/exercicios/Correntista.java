package exercicios;

public class Correntista {
    private Integer numero;
    private Double saldo= 0.0;

    public Double getSaldo(){
        return saldo;
    }
    public Integer getNumero(){
        return numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }
    public void depositar(Double valor){
        if (valor<=0)
            throw new IllegalArgumentException("falha de processo");
        saldo += valor;
    }
    public void sacar(Double valor){
        if (valor<=0 || valor>saldo )
            throw new IllegalArgumentException("falha de processo");
        saldo -= valor;
    }
    public void transferir(Correntista correntista, Double valor){
        sacar(valor);
        correntista.depositar(valor);
    }
}
