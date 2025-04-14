package avaliacao01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		
		//Uma grande loja de departamentos paga aos vendedores um salário variável com base
		//nas vendas efetuadas durante o mês, que é igual a 17% de comissão sobre o preço de
		//cada produto vendido. Cada vendedor, em um determinado mês, vende n reais em
		//produtos.
		//Deseja-se obter um relatório com: nome, total de vendas (em R$) e salário base de cada
		//vendedor. Descreva um algoritmo que gere o relatório desejado.
		//Para prosseguir com a entrada de um novo vendedor o algoritmo deve apresentar a
		//seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)”.
		
		Scanner input = new Scanner(System.in);
		
		String nome = "";
		double totalVendas = 0;
		double salarioBase = 0;
		double salarioTotal = 0;
		double porcentagem = 0.17; // 17%
		
		
		System.out.print("Qual é seu nome? - > ");
		nome = input.next();
		
		System.out.print("Quantos de vendas fez ? - > ");
		totalVendas = input.nextDouble();
		
		System.out.print("Qual é o salario Base - > ");
		salarioBase = input.nextDouble();
		
		
		//CALCULO - salario variavel
		salarioTotal = (totalVendas * porcentagem) + salarioBase;
		
		
		System.out.println("");
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Total de vendas: R$" + totalVendas);
		System.out.println("Comissão : " + (totalVendas * porcentagem));
		System.out.println("Salário base: R$" + salarioBase);
		System.out.println("Total: R$" + salarioTotal);
		
		
	}
}
