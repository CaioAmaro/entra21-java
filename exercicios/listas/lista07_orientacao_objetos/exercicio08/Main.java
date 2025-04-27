package lista07_orientacao_objetos.exercicio08;

/*
* Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS,
PR e SC) e RENDA ANUAL.
EX:
Nome: João da Silva
CPF: 123.456.789-00
UF: PR
RendaAnual: R$40.000
Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
Nível de Renda Anual Alíquota
0 a 4.000 0%
4.001 a 9.000 5,8%
9.001 a 25.000 15%
25.001 a 35.000 27,5%
acima de 35.000 30%
Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
Imposto a pagar = Renda Anual * Alíquota
Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
Calcule:
a) Quem mais paga imposto.
b) Quem menos paga imposto.
c) Qual o total de imposto pago entre os 5 contribuintes?
*
* */

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Caio Amaro","701420142-57", "AM", 3000);
        Pessoa pessoa2 = new Pessoa("Brunna Lima", "234567890-12", "SC", 8000);
        Pessoa pessoa3 = new Pessoa("Henrique Delegrego", "876543210-34", "SC", 70000);
        Pessoa pessoa4 = new Pessoa("Lucas Silva", "345678901-23", "SP", 14000);
        Pessoa pessoa5 = new Pessoa("Amanda Costa", "123456789-01", "RJ", 24000);

        Pessoa[] vetor = {pessoa1, pessoa2, pessoa3, pessoa4, pessoa5};

        PessoaResultado resultado = ReceitaFederal.obterMaiorPagadorImposto(vetor);
        System.out.println("Maior pagador de imposto é " + resultado.pessoa.Nome + " Pagando R$" +resultado.impostoPago+ " de imposto.");

        resultado = ReceitaFederal.obterMenorPagadorImposto(vetor);
        System.out.println("Menor pagador de imposto é " + resultado.pessoa.Nome + " Pagando R$" +resultado.impostoPago+ " de imposto.");

        double totalDeImposto = ReceitaFederal.obterTotalImposto(vetor);
        System.out.println("Total de imposto a ser pago é R$"+totalDeImposto);

    }
}
