package lista04_vetores_matrizes;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[5];
		int soma = 0;
		double media = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite o valor vetor["+i+"] = ");
			vetor[i] = input.nextInt();
			soma += vetor[i];
		}
		
		media = soma/5;
		
		System.out.println("");
		System.out.println("Média é "+ media);
		System.out.println("");
		
		for(int i = 0; i < 5; i++) {
			
			if(vetor[i] > media) {
				System.out.println("vetor["+i+"] = "+vetor[i]+" está acima da média!");
			}
			
		}
		
		
		
		
	}
}
