package lista09_relacionamentos_objetos.exercicio01;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        if(altura <= 0 || largura <=0){
            throw new IllegalArgumentException("Valores Inválido");
        }
        this.altura = altura;
        this.largura = largura;
    }

    public double obterArea(){
        return (this.largura * this.altura);
    }

    public  double obterPerimetro(){
        return 2 * ((this.largura * this.altura));
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public String toString() {
        return "Retangulo {" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
