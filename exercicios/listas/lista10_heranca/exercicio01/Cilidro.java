package lista10_heranca.exercicio01;

public class Cilidro extends Circulo{

    @Override
    public double calcularArea() {
        return 2 * (Math.PI * super.getRaio()) * (getRaio());
    }
}
