package lista03_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		
		for(int i=0; i<=4;i++) {
			System.out.print("Escreva um valor de 0 A 1000: ");
			valor = input.nextInt();
			
			
			while(!(valor >= 0 && valor <=1000)) {
				System.out.print("[ERRO] Digite Corretamente de 0 a 1000: ");
				valor = input.nextInt();
			}
			
			
			
			System.out.println("Número Digitado: "+valor);
			
			System.out.println("");
		}
		
	}
	
}
