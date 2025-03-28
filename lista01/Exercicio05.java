package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Digite o valor A: ");
		double valorA = input.nextDouble();
		
		System.out.print("Digite o valor B: ");
		double valorB = input.nextDouble();
		
		double peso1 = 3.5;
		double peso2 = 6.5;
		double resultado = ((valorA * peso1) + (valorB * peso2)) / (peso1 + peso2);
		
		System.out.println("Média ponderada é: " + df.format(resultado));
		
	}
}
