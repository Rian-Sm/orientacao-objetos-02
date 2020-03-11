package exercicios;

public class Circulo {
    private Double raio;

    public void setRaio(Double raio){
        this.raio = raio;
    }
    public Double getRaio(){
        return raio;
    }
    public Double CalcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    public Double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}
