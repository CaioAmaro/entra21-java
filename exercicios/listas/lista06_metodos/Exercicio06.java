package lista06_metodos;

import java.util.Scanner;

/* 6) Faça um método que receba um número, esse será o número "base"
	Dentro do método, faça o usuário entrar com mais dois números
	Imprima qual dos dois últimos números está mais perto do primeiro número "base"
*/

public class Exercicio06 {
	
	public static void qualNumeroEstaMaisPerto(int base) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o número 1°: ");
		int valor1 = input.nextInt();
		
		System.out.print("Insira o número 2°: ");
		int valor2 = input.nextInt();
		
		System.out.println("");
		
		
		System.out.println("Distâncias com referência a base: " + base);
		System.out.println("Valor1 |"+ valor1 +"| Distância da base -> "+ Math.abs(base - valor1));
		System.out.println("Valor2 |"+ valor2 +"| Distância da base -> "+ Math.abs(base - valor2));
		
		System.out.println("");
		
		if(Math.abs(base - valor1) == Math.abs(base - valor2)) System.out.println("Os valores são equidistantes");
		else if(Math.abs(base - valor1) < Math.abs(base - valor2)) System.out.println(valor1 + " Está mais próximo de " + base);
		else System.out.println(valor2 + " Está mais próximo de " + base);
	
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o número base: ");
		int base = input.nextInt();
		
		qualNumeroEstaMaisPerto(base);
		
	}

}
