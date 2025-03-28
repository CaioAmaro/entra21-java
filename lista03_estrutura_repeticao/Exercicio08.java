package lista03_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome = "";
		double nota1 = 0;
		double nota2 = 0;
		double media = 0;
		
		while(!nome.equalsIgnoreCase("fim")) {
			System.out.print("Digite Nome do Aluno: ");
			nome = input.next();
			if(nome.equalsIgnoreCase("fim")) {
				continue;
			}
			
			System.out.print("Digite Nota da Prova 1: ");
			nota1 = input.nextDouble();
			
			System.out.print("Digite Nota da Prova 2: ");
			nota2 = input.nextDouble();
			
			media = (nota1+nota2)/2;
			
			System.out.println("Média de notas: "+ media);
			
			System.out.println("");
		}
		
	}
}
