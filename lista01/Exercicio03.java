package lista01;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite valor de A: ");
		double valorA = input.nextDouble();
		System.out.print("Digite valor de B: ");
		double valorB = input.nextDouble();
		System.out.print("Digite valor de C: ");
		double valorC = input.nextDouble();
		System.out.print("Digite valor de D: ");
		double valorD = input.nextDouble();
		
		System.out.println("");
		
		System.out.println("(A * B) - (C * D)");
		System.out.println("("+valorA +" * "+  valorB +") - " + "("+ valorC + " * "+ valorD + ")");
		
		double resultado = (valorA * valorB) - (valorC * valorD);
		System.out.println("Resultado: " + resultado);
		
	}
}
