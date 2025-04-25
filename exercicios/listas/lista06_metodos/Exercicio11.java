package lista06_metodos;

import java.util.Scanner;

/*11) Faça um programa que receba 2 números do usuário.
	  Faça um método que descubra qual dos números é maior e retorne esse valor.
	  Se os dois números forem iguais, retorne: número iguais.
 * */

public class Exercicio11 {
	
	public static void checarMaior(double valor1, double valor2) {
		
		if(valor1 == valor2) System.out.println(retornoString());  
		else System.out.println("O maior valor é " + retornoDouble(valor1,valor2));;
	}
	
	public static String retornoString() {
		return "número iguais";
	}
	
	public static double retornoDouble(double valor1, double valor2) {
	
		double result = 0;
		if(valor1 > valor2) result = valor1;
		else result = valor2;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor 1 -> ");
		double valor1 = input.nextDouble();
		System.out.print("Digite o valor 2 -> ");
		double valor2 = input.nextDouble();
		
		checarMaior(valor1, valor2);
		
	}

}
