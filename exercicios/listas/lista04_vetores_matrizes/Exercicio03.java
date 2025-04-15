package lista04_vetores_matrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = {3,67,8,3,4};
		boolean achado = false;
		

		System.out.print("Digite um valor a procurar: ");
		int valorProcurado = input.nextInt();
		System.out.println("");
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] == valorProcurado) {
				achado = true;
			}
			
		}
		
		
		if(achado) {
			System.out.println("Valor encontrado!");
		}else {
			System.out.println("Valor não encontrado!!");
		}
		
	
	}
	
}
