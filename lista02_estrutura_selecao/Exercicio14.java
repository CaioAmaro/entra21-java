package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva as idades: ");
		
		System.out.print("Marquinhos -> ");
		int marquinhos = input.nextInt();
		System.out.print("Zezinho -> ");
		int zezinho = input.nextInt();
		System.out.print("Luluzinha -> ");
		int luluzinha = input.nextInt();
		
		String nomeMaisVelho = "";
		int idadeMaisVelho = 0;
		
		String nomeMaisNovo = "";
		int idadeMaisNovo = 0;
		
		String nomeMeio = "";
		int idadeMeio = 0;
		
		if(marquinhos > zezinho && marquinhos > luluzinha) {
			nomeMaisVelho = "Marquinhos";
			idadeMaisVelho = marquinhos;
		}
		
		if(zezinho > marquinhos && zezinho > luluzinha) {
			nomeMaisVelho = "Zezinho";
			idadeMaisVelho = zezinho;
		}
		
		if(luluzinha > marquinhos && luluzinha > zezinho) {
			nomeMaisVelho = "Luluzinha";
			idadeMaisVelho = luluzinha;
		}
		
		if(marquinhos < zezinho && marquinhos < luluzinha) {
			nomeMaisNovo = "Marquinhos";
			idadeMaisNovo = marquinhos;
		}
		
		if(zezinho < marquinhos && zezinho < luluzinha) {
			nomeMaisNovo = "Zezinho";
			idadeMaisNovo = zezinho;
		}
		
		if(luluzinha < marquinhos && luluzinha < zezinho) {
			nomeMaisNovo = "Luluzinha";
			idadeMaisNovo = luluzinha;
		}
		
		
		if(marquinhos > idadeMaisNovo && marquinhos < idadeMaisVelho) {
			nomeMeio = "Marquinhos";
			idadeMeio = marquinhos;
		}
		
		if(zezinho > idadeMaisNovo && zezinho < idadeMaisVelho) {
			nomeMeio = "Zezinho";
			idadeMeio = zezinho;
		}
		
		if(luluzinha > idadeMaisNovo && luluzinha < idadeMaisVelho) {
			nomeMeio = "Luluzinha";
			idadeMeio = luluzinha;
		}
		
		
		System.out.println(" ");
		
		System.out.println("Mais velho é " + nomeMaisVelho + " com " + idadeMaisVelho + " Anos.");
		System.out.println("O do meio é " + nomeMeio + " com " + idadeMeio + " Anos.");
		System.out.println("Mais velho é " + nomeMaisNovo + " com " + idadeMaisNovo + " Anos.");
		
		
	}

}
