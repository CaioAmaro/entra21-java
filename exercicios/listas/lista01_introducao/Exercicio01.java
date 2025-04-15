package lista01_introducao;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro Valor: ");
		int primeiroValor = input.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int segundoValor = input.nextInt();
		
		System.out.println("");
		
		int soma = primeiroValor + segundoValor;
		int produto = primeiroValor * segundoValor;
		
		
		
		System.out.println("Soma: "+ primeiroValor + " + " + segundoValor + " = " + soma);
		System.out.println("Produto: "+ primeiroValor + " * " + segundoValor + " = " + produto);
		
		
	}
}
