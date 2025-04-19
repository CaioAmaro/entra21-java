package exercicio_metodos;

import java.util.Scanner;

/*
 * 9) Faça um método que receba 4 números como parâmetros, some os 4 números.
 * 		Retorne a soma.
*/

public class Exercicio09 {
	
	public static void obterNumeros(int n) {
		
		Scanner input = new Scanner(System.in);
		int array[] = new int[n];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite número ["+(i+1)+"] = ");
			array[i] = input.nextInt();
		}
	
		System.out.println
		(mostrarResultado
				(somarNumeros
						(array)));
	}
	
	public static int somarNumeros(int array[]) {
		
		int soma = 0;
		
		for(int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		
		return soma;
	}
	
	public static String mostrarResultado(int soma) {
		return "Resultado da soma é " + soma;
	}
	
	
	
	public static void main(String[] args) {
		
		obterNumeros(4);
		
	}

}
