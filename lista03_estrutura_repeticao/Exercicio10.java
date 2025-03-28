package lista03_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome = "";
		int idade = 0;
		int alunos = 0;
		String alunosComDezoito = "";
		int qtdMaiores20 = 0;
		
		System.out.println("Quantos Alunos você vai cadastrar? ");
		System.out.print("Quantidade alunos: ");
		alunos = input.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <= alunos; i++) {
			
			System.out.print("Digite nome: ");
			nome = input.next();
			
			System.out.print("Digite idade: ");
			idade = input.nextInt();
			
			System.out.println();
			
			if(idade == 18) {
				if(alunosComDezoito.contentEquals("")) {
					alunosComDezoito += nome;
				}else {
					alunosComDezoito += ", " + nome;
				}
			}
			
			if(idade > 20) {
				qtdMaiores20++;
			}
			
		}
		
		
		System.out.println();
		
		System.out.println("Nomes dos alunos com 18 anos: ");
		System.out.println(alunosComDezoito);
		
		System.out.println();
		System.out.println("Quantidade de alunos com 21+: "+ qtdMaiores20);
		
	}
}
