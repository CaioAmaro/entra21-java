package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1° Carta: ");
		int primeiraCarta = input.nextInt();
		
		System.out.print("2° Carta: ");
		int segundaCarta = input.nextInt();
		
		System.out.print("3° Carta: ");
		int terceiraCarta = input.nextInt();
		
		int cartasTruco = 0; //apenas 1 imprima.
		
		
		if(primeiraCarta >= 1 && primeiraCarta <=3) {
			cartasTruco++;
		}
		
		if(segundaCarta >= 1 && segundaCarta <=3) {
			cartasTruco++;
		}
		
		if(terceiraCarta >= 1 && terceiraCarta <=3) {
			cartasTruco++;
		}
		
		System.out.println("");
		System.out.println(primeiraCarta + " " + segundaCarta + " " + terceiraCarta);
		System.out.println("");
		
		if(cartasTruco == 1) {
			System.out.println("Truco!");
			System.out.println("APENAS UMA das três cartas for AS, 2 ou 3");
		}else if(cartasTruco == 2) {
			System.out.println("Seis!");
			System.out.println("se APENAS DUAS das três cartas for AS, 2 ou 3");
		}else if(cartasTruco == 3) {
			System.out.println("Nove!");
			System.out.println("se AS TRÊS cartas\r\n forem AS, 2 ou 3");
		}
		
		System.out.println("");
		System.out.println("Count: " + cartasTruco);
	}

}
