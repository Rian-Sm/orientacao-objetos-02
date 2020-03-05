package exercicios;

public class Retangulo {
    private Double base;
    private Double altura;

    public void setBase(Double base){
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double calcularArea(){
        return base * altura;
    }
    public Double calcularPerimetro(){
        return 2 * (base + altura);
    }
}
