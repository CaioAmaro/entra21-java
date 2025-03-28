package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um char: ");
		char letra = input.next().charAt(0);
		
		if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("Este char é uma vogal!");
		}else {
			System.out.println("Este char é uma consoante!");
		}
		
		
	}
}
