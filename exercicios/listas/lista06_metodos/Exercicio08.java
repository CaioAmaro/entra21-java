package lista06_metodos;

import java.util.Scanner;

/*
 * 8) Faça um programa em que o usuário entre com um número de 1 a 4
	Com o número 1 sendo verão, 2 sendo outono...
	Dependendo de o que o usuário informa, retorne:
	É verão
	E o tempo está quente.
	Ou
	É inverno
	E está frio.
	Faça um método para cada estação do ano
*/

public class Exercicio08 {
	
	public static void pulaLinha() {
		System.out.println();
	}
	
	public static void menu() {
		System.out.println("Menu");
		System.out.println("1 - Verão");
		System.out.println("2 - Outono");
		System.out.println("3 - Inverno");
		System.out.println("4 - Primavera");
		pulaLinha();
	}
	
	public static void perguntar(String msg) {
		System.out.println(msg);
		System.out.print("R: ");
	}
	
	public static void obterResposta() {
		Scanner input = new Scanner(System.in);
		int opcao = input.nextInt();
		validar(opcao, 4);	
	}
	
	public static void validar(int opcao, int opcaoMax) {
		
		boolean valido = opcao >= 1 && opcao <= opcaoMax;
	
		
		while(!valido) {
			pulaLinha();
			System.out.println("Opção selecionada não é valida!");
			System.out.println("Tente novamente!");
			System.out.print("R: ");
			obterResposta();
			return;
		}
		
		
		controller(opcao);
		
	}
	
	public static void controller(int opcao) {
		String resposta = "";
		
		pulaLinha();
		
		if(opcao == 0) {
			System.out.println("Saindo....");
			return;
		}
		else if(opcao == 1) resposta = verao();
		else if(opcao == 2) resposta = outono();
		else if(opcao == 3) resposta = inverno();
		else if(opcao == 4) resposta = primavera();
		
		System.out.println(resposta);
		
	}
	
	public static String verao() {
		return "é verão";
	}
	
	public static String outono() {
		return "é outono";
	}
	
	public static String inverno() {
		return "é inverno";
	}
	
	public static String primavera() {
		return "é primavera";
	}
	
	public static void run() {
		menu();
		perguntar("Qual opção você deseja selecionar?");
		obterResposta();
		
	}
	
	public static void main(String[] args) {
		run();
	}

}
