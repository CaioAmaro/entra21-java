package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Digite nome: ");
		String nome = input.next();
		
		System.out.print("Digite salário ");
		double salarioFixo = input.nextDouble();
		
		System.out.print("Digite total de vendas MENSAL em R$: ");
		double totalVendas = input.nextDouble();
		
		System.out.println("");
		
		double comissao = 0.15 * totalVendas;
		double salarioMensal = comissao + salarioFixo;
		 
		System.out.println("Nome: " + nome);
		System.out.println("Salário fixo  R$ " + df.format(salarioMensal));
		System.out.println("Comissão ganha: R$ "+ df.format(salarioMensal) );
		System.out.println("Total a receber: R$ "+ df.format(salarioMensal));
		
		
		
	}
}
