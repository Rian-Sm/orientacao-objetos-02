package exercicios;

public class Conta {
    private Integer numero;
    private Double saldo=0.0;
    private Double  limite;

    public Double getSaldo(){
        return saldo;
    }
    public Integer getNumero(){
        return numero;
    }
    public Double getLimite(){
        return limite;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void depositar(Double valor){
        if (valor<=0)
            throw new IllegalArgumentException("valor invalido");
        saldo+=valor;
    }
    public void sacar(Double valor){
        if (valor<=0)
            throw new IllegalArgumentException("valor invalido");
        if(valor>saldo+limite)
            throw new IllegalArgumentException("passou dos limites");
        saldo-=valor;
    }
    public void transferir(Conta conta, Double valor){
        sacar(valor);
        conta.depositar(valor);
    }
}
