package exercicio_metodos;

import java.util.Scanner;

/*
 * 15) Faça um programa que diz se um número inserido está dentro de um limite imposto
pelo usuário
Por exemplo:
Usuário inseriu o limite máximo como 100.
Usuário inseriu o limite mínimo como 70.
Depois ele inseriu o número 80.
O retorno deve ser: 80 está nos limites impostos.
*/

public class Exercicio15 {
	
	public static String setarLimite(int limiteMax) {
		Scanner input  = new Scanner(System.in);
		String resultado = "";
		
		System.out.print("Digite um imposto: ");
		int impostoEscolhido = input.nextInt();
		
		if(impostoEscolhido <= limiteMax)  resultado = impostoEscolhido + " está nos limites impostos";
		else resultado = impostoEscolhido + " não está nos limites impostos";
		
		return resultado;
		
		
	}
	
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Digite o limite do imposto: ");
		int limiteMax = input.nextInt();
		
		System.out.println(setarLimite(limiteMax));
		
	}
}
