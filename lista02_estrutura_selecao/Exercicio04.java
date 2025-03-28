package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("(M) - Masculino");
		System.out.println("(F) - Feminino");
		System.out.println("(I) - Não Informado");
		System.out.print("Digite o char correspodente: ");
		char sexo = input.next().charAt(0);
		
		System.out.println(" ");
		
		if(sexo == 'M') {
			System.out.println("Masculino.");
		}else if (sexo == 'F') {
			System.out.println("Feminino.");
		}else if(sexo == 'I') {
			System.out.println("Não Informado.");
		}else {
			System.out.println("Entrada Incorreta.");
		}
		
	}
}
