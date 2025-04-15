package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreva 1° número: ");
		double valor1 = input.nextDouble();
		
		System.out.print("Escreva 2° número: ");
		double valor2 = input.nextDouble();
		
		System.out.println("");
		System.out.println("Número 1: " + valor1);
		System.out.println("Número 2: " + valor2);
		System.out.println("");
		
		if(valor1 % valor2 == 0) {
			System.out.println(valor1 + " é multiplo de " + valor2);
			
			double multiplicador = valor1/valor2;
			
			System.out.println(" = >>>>> " + valor2 + " x " + multiplicador + " = " + valor1);
			
			
		}else {
			System.out.println("Não são multiplos");
		}
		
	}
}
