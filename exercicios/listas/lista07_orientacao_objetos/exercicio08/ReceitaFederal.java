package lista07_orientacao_objetos.exercicio08;

public class ReceitaFederal {
    public static PessoaResultado obterMaiorPagadorImposto(Pessoa[] vetor){
        PessoaResultado resultado = new PessoaResultado();

        double maiorPagamentoImposto = Double.MIN_VALUE;

        for(int i = 0; i < vetor.length; i++){
            double impostoSerPago = vetor[i].RendaAnual * descobrirAliquota(vetor[i]);

            if(impostoSerPago > maiorPagamentoImposto){
                maiorPagamentoImposto = impostoSerPago;
                resultado.pessoa = vetor[i];
                resultado.impostoPago = impostoSerPago;
            }

        }

        return resultado;
    }

    public static PessoaResultado obterMenorPagadorImposto(Pessoa[] vetor){
        PessoaResultado resultado = new PessoaResultado();

        double menorPagamentoImposto = Double.MAX_VALUE;

        for(int i = 0; i < vetor.length; i++){
            double impostoSerPago = vetor[i].RendaAnual * descobrirAliquota(vetor[i]);

            if(impostoSerPago < menorPagamentoImposto){
                menorPagamentoImposto = impostoSerPago;
                resultado.pessoa = vetor[i];
                resultado.impostoPago = impostoSerPago;
            }

        }

        return resultado;
    }

    public static double obterTotalImposto(Pessoa[] vetor){
        double totalImposto = 0;

        for(int i = 0; i < vetor.length; i++){
            double impostoSerPago = vetor[i].RendaAnual * descobrirAliquota(vetor[i]);

            totalImposto += impostoSerPago;
        }

        return totalImposto;
    }

    public static double descobrirAliquota(Pessoa pessoa){

        double renda = pessoa.RendaAnual;
        double aliquota = 0;

        if(renda >= 0 && renda <= 4000) aliquota = 0;
        else if (renda >= 4001 && renda <= 9000) aliquota = 0.058;
        else if(renda >= 9001 && renda <= 25000) aliquota = 0.15;
        else if(renda >= 25001 && renda <= 35000) aliquota = 0.275;
        else if(renda > 35000) aliquota = 0.30;
        else aliquota = 0;

        return aliquota;
    }

}





/*
*
* Nível de Renda Anual Alíquota
0 a 4.000 0%
4.001 a 9.000 5,8%
9.001 a 25.000 15%
25.001 a 35.000 27,5%
acima de 35.000 30%
*
* */