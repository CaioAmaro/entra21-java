package exercicio_metodos;

import java.util.Scanner;

/*12) Faça um programa que calcule o quadrado de um número caso esse número seja par e o dobro desse número caso esse número seja ímpar.
	   Retorne o resultado
 * 
 * */

public class Exercicio12 {

	public static void controller(int numero) {
		
		boolean par = (numero % 2 == 0);
		
		if(par) System.out.println("é par, e o quadrado dele é " + quadrado(numero));
		else System.out.println("é impa, e o dobro dele é " + dobro(numero));;
		
	}
	
	public static double quadrado(int numero) {
		return Math.pow(numero, 2);
	}
	
	public static int dobro(int numero) {
		return numero*2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite número = ");
		int numero = input.nextInt();
	
		controller(numero);
		
	}
	
}
