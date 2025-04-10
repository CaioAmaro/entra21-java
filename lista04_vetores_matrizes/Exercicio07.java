package lista04_vetores_matrizes;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[10];
		double vetorModificado[] = new double[10];
		
		
		for(int i = 0; i < vetor.length; i++ ) {
			System.out.print("Digite o valor do vetor["+i+"]: ");
			vetor[i] = input.nextInt();
		}
		
		System.out.println("");
		
		for(int i = 0; i < vetorModificado.length; i++) {
			
			if(i % 2 == 0) {
				vetorModificado[i] = vetor[i] + (vetor[i] * 0.02);
			}else {
				vetorModificado[i] = vetor[i] + (vetor[i] * 0.05);
			}
		}
		
		
		for(int i = 0; i < vetorModificado.length; i++ ) {
			System.out.println("VetorModificado["+i+"] = "+ vetorModificado[i]);
		}
		
		
	}

}
