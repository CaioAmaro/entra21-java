package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1° (Homem) Idade -> ");
		int idadeHomemPrimeiro = input.nextInt();
		System.out.print("2° (Homem) Idade -> ");
		int idadeHomemSegundo = input.nextInt();
		System.out.print("1° (Mulher) Idade -> ");
		int idadeMulherPrimeiro = input.nextInt();
		System.out.print("2° (Mulher) Idade -> ");
		int idadeMulherSegundo = input.nextInt();
		
		int idadeMaiorHomem = 0;
		int idadeMenorHomem = 0;
		int idadeMaiorMulher = 0;
		int idadeMenorMulher = 0;
		
		
		if(idadeHomemPrimeiro > idadeHomemSegundo) {
			idadeMaiorHomem = idadeHomemPrimeiro;
			idadeMenorHomem = idadeHomemSegundo;
		} else {
			idadeMaiorHomem = idadeHomemSegundo;
			idadeMenorHomem = idadeHomemPrimeiro;
		}
		
		if(idadeMulherPrimeiro > idadeMulherSegundo) {
			idadeMaiorMulher = idadeMulherPrimeiro;
			idadeMenorMulher = idadeMulherSegundo;
		}else {
			idadeMaiorMulher = idadeMulherSegundo;
			idadeMenorMulher = idadeMulherPrimeiro;
		}
		
		System.out.println("");
		System.out.println("Idade Homem Maior: " + idadeMaiorHomem);
		System.out.println("Idade Homem Menor: " + idadeMenorHomem);
		System.out.println("");
		System.out.println("Idade Mulher Maior: " + idadeMaiorMulher);
		System.out.println("Idade Mulher Menor: " + idadeMenorMulher);
		System.out.println("");
		
		System.out.println("Maior idade Homem + Menor Idade mulher: " + (idadeMaiorHomem + idadeMenorMulher) );
		System.out.println("Menor idade Homem * Maior idade Mulher: " + (idadeMaiorMulher * idadeMenorHomem) );
		
		
	}
}
