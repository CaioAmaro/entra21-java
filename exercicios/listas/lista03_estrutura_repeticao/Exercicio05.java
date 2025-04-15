package lista03_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double somaAlturas = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.print("Escreva altura "+i+"°: ");
			somaAlturas += input.nextDouble();
		}
		
		double resultado = somaAlturas/5;
		
		System.out.println("A média das alturas é: "+ resultado);
		
	}
}
