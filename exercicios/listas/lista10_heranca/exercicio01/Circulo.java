package lista10_heranca.exercicio01;

public abstract class Circulo {
    private String cor;
    private double raio;

    public abstract double calcularArea();

    public String getCor() {
        return cor;
    }

    public double getRaio() {
        return raio;
    }
}
