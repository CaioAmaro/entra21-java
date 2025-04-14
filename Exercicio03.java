package avaliacao01;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) 
		
		
		//Crie um programa Java para encontrar a primeira sequência de números seguidos em um
		//vetor.
		//Por exemplo, o vetor {6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6} tem a primeira sequência sendo {0, 1, 2}.
		//Exiba essa sequência.
		//Peça para o usuário inserir os valores em um vetor de 8 posições
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[8];
		String vetorSequencia = "";
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite Valor vetor["+i+"] - > ");
			vetor[i] = input.nextInt();
		}
		
		System.out.println("");
		System.out.println("Vetor Criado! ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			
		}
		System.out.println("");
		
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(i == 7) {
				break;
			}
			
			System.out.println(vetor[i] + " - > " + vetor[i+1]);
		
			
			if(vetor[i] - vetor[i+1] == 1) {
				vetorSequencia += vetor[i];
			}								
			
		
			
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Sequencias encontradas! - > " + vetorSequencia);
		
	}
}
