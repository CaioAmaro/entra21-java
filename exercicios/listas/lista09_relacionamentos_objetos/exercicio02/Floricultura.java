package lista09_relacionamentos_objetos.exercicio02;

import java.util.List;

public class Floricultura {
    private List<Flor> flores;

    public Flor obterFlorMaisCara(){
        double precoMaior = Double.MIN_VALUE;
        Flor florResposta = null;

        for(Flor flor: flores){
            if(flor.getPreco() > precoMaior){
                precoMaior = flor.getPreco();
                florResposta = flor;
            }
        }

        if(florResposta == null){
            throw new IllegalArgumentException("Não foi possivel obter flor mais cara!");
        }

        return florResposta;
    }

    public double obterReceitaFlorIsPresente(){
        double soma = 0;

        for(Flor flor: flores){
            if(flor.isParaPresente()){
                soma += flor.getPreco();
            }
        }

        return soma;
    }

    public double obterReceitaFlorIsNotPresente(){
        double soma = 0;

        for(Flor flor: flores){
            if(!flor.isParaPresente()){
                soma += flor.getPreco();
            }
        }

        return soma;
    }

    public ReceitaDados obterDadosReceita(){
        ReceitaDados receitaDados = null;
        String mensagemIsPresente = "flores que são para presentes";
        String mensagemIsNotPresente = "flores que não são para presentes";

        if(obterReceitaFlorIsPresente() > obterReceitaFlorIsNotPresente()){
            receitaDados = new ReceitaDados(mensagemIsPresente,obterReceitaFlorIsPresente(),mensagemIsNotPresente,obterReceitaFlorIsNotPresente());
        }else if(obterReceitaFlorIsNotPresente() > obterReceitaFlorIsPresente()){
            receitaDados = new ReceitaDados(mensagemIsNotPresente,obterReceitaFlorIsNotPresente(),mensagemIsPresente,obterReceitaFlorIsPresente());
        }else{
            receitaDados = new ReceitaDados("Presentes/Não Presentes",obterReceitaFlorIsNotPresente(),"",0);
        }

        return receitaDados;
    }

    public String mostrarDadosReceita(){
        ReceitaDados receitaDados = obterDadosReceita();
        if(receitaDados.maiorReceita().equals("Presentes/Não Presentes")){
            return "Tanto flores para presentes/não presentes tiveram a mesma receita: R$ " + receitaDados.maiorReceita();
        }else{

            return "Maior Receita foi para " + receitaDados.maiorReceita() + " = R$ " + receitaDados.valorMaiorReceita() + "\n" +
                    "Menor Receita foi para " + receitaDados.menorReceita() + " = R$ " + receitaDados.valorMenorReceita();
        }

    }

    public void setFlores(List<Flor> flores) {
        this.flores = flores;
    }

}
