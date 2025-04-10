package lista04_vetores_matrizes;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double vetor[] = new double[5];
		
		
		
		
		for(int i = 0;  i < vetor.length; i++) {
			System.out.println("vetor["+i+"] = "+ vetor[i]);
		}
		System.out.println("");
		
		
		System.out.print("digite qual indice você quer preecher: ");
		int escolhaIndice = input.nextInt();
		System.out.println("");
		
		
		while(escolhaIndice  < 0 || escolhaIndice >= 5) {
			System.out.println("Indice errado!");
			System.out.print("Escolha novamente! -> ");
			escolhaIndice = input.nextInt();
		}
		
		System.out.print("Digite o valor para ser atribuido a vetor["+escolhaIndice+"] => ");
		double valorAtribuir = input.nextDouble();
		System.out.println("");
		
		vetor[escolhaIndice] = valorAtribuir;
		
		for(int i = 0;  i < vetor.length; i++) {
			System.out.println("vetor["+i+"] = "+ vetor[i]);
		}
		
		
		
	}
}
