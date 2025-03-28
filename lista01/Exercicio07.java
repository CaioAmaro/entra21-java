package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Digite o valor em R$: ");
		double reais = input.nextDouble();
		
		System.out.println("");
		
		double valorDolar = 5.81;
		double conversao = reais * valorDolar;
		
		System.out.println("A conversão de R$" + df.format(reais) +" é $"+ df.format(conversao) );
		
		
	}
}
