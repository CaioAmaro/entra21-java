package lista04_vetores_matrizes;

import java.util.Scanner;

public class Exercicio01aula {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idades[] = {25, 24, 52, 47, 40, 50};
		int idades2[] = new int[10];
		
		

		for(int i = 0; i < idades.length; i++) {
			System.out.println("Idade ["+(i+1)+"] é " + idades[i]);
		}
		

		for(int i = 0; i < idades2.length; i++) {
			
			System.out.print("Digite o número desejado no vetor ["+i+"] -> ");
			idades2[i] = input.nextInt();
			
		}
		
		System.out.println("");
		
		for(int i=0; i<idades2.length; i++) {
			
			System.out.println("Valor do vetor ["+i+"] = "+ idades2[i]);
			
		}
		
		
		System.out.println("Digite a quantidade de vetores que serão criados");
		int x = input.nextInt();
		int idades3[] = new int[x];
		
		

		for(int i = 0; i < idades3.length; i++) {
			
			System.out.print("Digite o número desejado no vetor ["+i+"] -> ");
			idades3[i] = input.nextInt();
			
		}
		
		System.out.println("");
		
		for(int i=0; i<idades3.length; i++) {
			
			System.out.println("Valor do vetor ["+i+"] = "+ idades3[i]);
			
		}
		
		
		
		
	}
}
