package lista07_orientacao_objetos.exercicio08;

public class Pessoa {
    String Nome;
    String CPF;
    String UF;
    double RendaAnual;

    public Pessoa(){

    }

    public Pessoa(String nome, String CPF, String UF, double rendaAnual) {
        Nome = nome;
        this.CPF = CPF;
        this.UF = UF;
        RendaAnual = rendaAnual;
    }
}
