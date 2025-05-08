package lista09_relacionamentos_objetos.exercicio03;

import java.util.ArrayList;
import java.util.List;

/*
* Mais caro.
* preço / volume = preço cubido
* peso / volume = densidade // kg/m³
* volume × quantidadeEstoque = ocupa mais estoque
* */

public class MateriaisContrucao {
    private List<Material> materiais = new ArrayList<>();

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }

    private Material calculoMaisCaro(){
        double maiorValor = 0;
        Material materialReposta = null;

        for(Material material: materiais){
            if(material.getPreco() > maiorValor){
                maiorValor = material.getPreco();
                materialReposta = material;
            }

        }

        if(materialReposta == null){
            throw new IllegalArgumentException("Não foi possivel realizar operação de obterMaisCaro");
        }

        return materialReposta;
    }

    private Material calculoPrecoCubido(){
        double maiorPrecoCubido = 0;
        Material materialReturn = null;

        for(Material material: materiais){
            if(material.obterPrecoCubido() > maiorPrecoCubido){
                maiorPrecoCubido = material.obterPrecoCubido();
                materialReturn = material;
            }
        }

        if(materialReturn == null){
            throw new IllegalArgumentException("Não foi possivel realizar operação de CalculoMaisCaro");
        }

        return materialReturn;
    }

    private Material calcularDensidade(){
        double maiorDensidade = Double.MIN_VALUE;
        Material materialResponse = null;

        for(Material material: materiais){
            if(material.obterDensidade() > maiorDensidade){
                maiorDensidade = material.obterDensidade();
                materialResponse = material;
            }
        }

        if(materialResponse == null){
            throw new IllegalArgumentException("Erro!");
        }

        return materialResponse;
    }

    private Material calcularVolumeEstoque(){
        double maiorVolumeEstoque = Double.MIN_VALUE;
        Material materialResponse = null;

        for(Material material: materiais){
            if(material.obterEspacoOcupado() > maiorVolumeEstoque){
                maiorVolumeEstoque = material.obterEspacoOcupado();
                materialResponse = material;
            }
        }

        if(materialResponse == null){
            throw new IllegalArgumentException("Erro!");
        }

        return materialResponse;
    }

    public String mostrarMaiorEspacoOcupado(){
        Material material = calcularVolumeEstoque();
        return material.getNome() + " é o mais espaçoso " + material.obterEspacoOcupado() + " m³.";
    }

    public String mostrarMaiorDensidade(){
        Material material = calcularDensidade();
        return material.getNome() + " é o mais denso com " + material.obterDensidade() + " Kg/m³.";
    }

    public String mostrarMaiorPrecoCubido(){
        Material material = calculoPrecoCubido();
        return material.getNome() + " é o mais caro  por metros cúbicos dos materiais com R$ " + material.obterPrecoCubido() + " por m³";
    }

    public String mostarMaterialMaisCaro(){
        Material material = calculoMaisCaro();
        return material.getNome() + " é o mais caro dos materiais com R$ " + material.getPreco();
    }
}
