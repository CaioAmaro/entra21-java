package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o 1° número: ");
		double valor1 = input.nextDouble();
		
		System.out.print("Digite o 2° número: ");
		double valor2 = input.nextDouble();
		
		System.out.println("");
		System.out.println("Valor 1: " + valor1);
		System.out.println("Valor 2: " + valor2);
		System.out.println("");
		
		if(valor1 > valor2) {
			System.out.println(valor1 + " é maior que " + valor2);
		} else {
			System.out.println(valor2 + " é maior que " + valor1);
		}
		
		
		
		
	}
}
