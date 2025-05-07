package lista09_relacionamentos_objetos.exercicio02;

public class Flor {
    private String nome;
    private double preco;
    private String vendidaPara;
    private boolean paraPresente;

    public Flor(String nome, double preco, String vendidaPara, boolean paraPresente) {

        if(preco <= 0){
            throw new IllegalArgumentException("Preço invalido!");
        }

        this.nome = nome;
        this.preco = preco;
        this.vendidaPara = vendidaPara;
        this.paraPresente = paraPresente;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public boolean isParaPresente() {
        return paraPresente;
    }
}
