package lista09_relacionamentos_objetos.exercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Material {
    private String nome;
    private String descrição;
    private double preco;
    private double volume;
    private double peso;
    private double quantidadeEstoque;

    public Material(String nome, String descrição, double preco, double volume, double peso, double quantidadeEstoque) {

        List<Double> listaAtributos = new ArrayList<>();
        Collections.addAll(listaAtributos,
                preco,
                volume,
                peso,
                quantidadeEstoque);

        for(Double atributos: listaAtributos){
            if(atributos <= 0.0){
                throw new IllegalArgumentException("Valor Invalido");
            }
        }

        this.nome = nome;
        this.descrição = descrição;
        this.preco = preco;
        this.volume = volume;
        this.peso = peso;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarQtdEstoque(int qtd){
        if(qtd <= 0){
            throw new IllegalArgumentException("Quantidade invalida");
        }

        quantidadeEstoque += qtd;
    }

    public void venderMaterial(int qtd){
        if(qtd <= 0){
            throw new IllegalArgumentException("Valor invalido!");
        }

        if(qtd > this.quantidadeEstoque){
            throw new IllegalArgumentException("Quantidade no estoque insuficiente!");
        }

        this.quantidadeEstoque -= qtd;

    }

    public void colocarProdutoEmProducao(int porcentagem){

        if(porcentagem <= 0 || porcentagem > 100){
            throw new IllegalArgumentException("Valor invalido!");
        }

        this.preco = preco * (porcentagem/100.0);
    }

    public double obterPrecoCubido(){
        return preco/volume;
    }

    public double obterDensidade(){
        return peso/volume;
    }

    public double obterEspacoOcupado(){
        return volume * quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Material{" +
                "nome='" + nome + '\'' +
                ", descrição='" + descrição + '\'' +
                ", preco=" + preco +
                ", volume=" + volume +
                ", peso=" + peso +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
