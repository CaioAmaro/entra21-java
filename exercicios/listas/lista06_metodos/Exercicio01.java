package lista6_metodos;

import java.util.Scanner;

/*
 * 1)Faça um programa em que o usuário entre com um número de 1 a 4 
 * Com o número 1 sendo verão, 2 sendo outono... 
 * Dependendo de o que o usuário informa, imprima: 
 * É verão
 * E o tempo está quente
 * Ou
 * É inverno
 * E está frio
 * Faça um método para cada estação do ano
 * 
 * */

public class Exercicio01 {
	
	public static void menu() {
		System.out.println("***** MENU *****");
		System.out.println();
		System.out.println("1 -> VERÃO");
		System.out.println("2 -> OUTONO");
		System.out.println("3 -> INVERNO");
		System.out.println("4 -> PRIMAVERA");
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Escolha ");
		System.out.print("R: ");
	}
	
	public static void verao() {
		System.out.println("É verão, que caloooooooooor!!!");
	}
	
	public static void outono() {
		System.out.println("É outono, e as folhas caem das árvores.");
	}
	
	public static void inverno() {
		System.out.println("É inverno, que friozinho! bom pra dormir");
	}
	
	public static void primavera() {
		System.out.println("É primavera, e as flores estão muitos bonitos!");
		
	}
	
	
	 
	 
	 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int opcaoEscolha = 0;
		
		menu();
		opcaoEscolha = input.nextInt();
		
		while(!(opcaoEscolha >= 1 && opcaoEscolha <= 4)) {
			System.out.println();
			System.out.println("Opção Selecionada Inexistente. ");
			System.out.println();
			menu();
			opcaoEscolha = input.nextInt();
		}
		
		System.out.println();
		
		if(opcaoEscolha == 1) {
			verao();
		}else if (opcaoEscolha == 2) {
			outono();
		}else if(opcaoEscolha == 3) {
			inverno();
		}else{
			primavera();
		}
		
		
		
		
		
	}

}
