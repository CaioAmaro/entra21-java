package lista07_orientacao_objetos.exercicio07;

public class Aeronave {

    String modelo;
    int passageiros;
    double velocidadeMax;
    double capacidadeCombustivel;
    double queimaCombustivelMinutos;

    public Aeronave(){

    }

    public Aeronave(String modelo, int passageiros, double velocidadeMax, double capacidadeCombustivel, double queimaCombustivelMinutos) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelMinutos = queimaCombustivelMinutos;
    }

}
