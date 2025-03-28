package lista03_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int fatorial = 0;
		int somaFatorial = 1;

		
		System.out.print("Fatorial de qual número? -> ");
		fatorial = input.nextInt();
		
		for(int i = fatorial; i >=1; i--) {
			if(i==1) {
				System.out.print(i +" = ");
			}else {
				System.out.print(i +".");
			}
			
			somaFatorial *= i;
		}
		
		System.out.println(somaFatorial);
	}

}
