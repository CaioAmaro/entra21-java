package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = input.next();
		
		if(nome.equals("caio")) {
			System.out.println("NOME CORRETO!");
		}else {
			System.out.println("Erro!");
		}
		
	}
}
