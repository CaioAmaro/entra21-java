package lista03_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Escreva número: ");
			int numero = input.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println("Número é Par");
			}else {
				System.out.println("Número é ímpar");
			}
			
			if(numero == 0) {
				System.out.println("Número neutro");
			}
			
			System.out.println("");
		}
		
	}
	
}
