package exercicio_metodos;

import java.util.Scanner;

/*
 * 
 * 17) Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho par,
	   retorne o primeiro caractere dessa palavra.
	   Caso ela tenha tamanho ímpar, retorne o segundo caractere dessa palavra.
*/

public class Exercicio17 {
	
	public static char verificarTamanho(String palavra) {
		System.out.println("A palavra "+palavra+" tem "+palavra.length()+" letras");
		System.out.println("");
		
		if(palavra.length() % 2 == 0) return palavra.charAt(0);
		else return palavra.charAt(1);
	
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a palavra: ");
		String palavra = input.next();
		System.out.println("A letra é : " + verificarTamanho(palavra));
	}
}
