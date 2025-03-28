package lista03_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int exit = 1; //1 - false  = 0 - true
		double somaAlturas = 0;
		int acount = 0;
		
		while(exit!=0) {
			System.out.println("Pessoa["+(acount+1)+"]");
			System.out.print("Digite a altura: ");
			somaAlturas += input.nextDouble();
			acount++;
			
			System.out.print("Você deseja sair? SIM = 0; NÃO=1 -> ");
			exit = input.nextInt();
			
			System.out.println("");
		}
		
		double resultado = somaAlturas/acount;
		
		System.out.println("Soma total das alturas: "+somaAlturas);
		System.out.println("Total de pessoas: "+acount);
		System.out.println("Média de altura: "+resultado);
		
	}

}
