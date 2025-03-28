package lista01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Digite o raio do círculo em cm: ");
	double raio = input.nextDouble();
	
	System.out.println("");
	
	final double PI = 3.14;
	double area = PI * (raio*raio);
	
	System.out.println("Área do círculo é: " + area +" cm.");
	
		
	}
}
