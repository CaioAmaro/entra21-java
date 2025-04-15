package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos Meses funcionario tem: ");
		int meses = input.nextInt();
		
		System.out.print("Qual salario: ");
		double salario = input.nextDouble();
		
		double reajuste  = 0;
		
		if(meses >= 0 && meses <= 12) {
			reajuste = 0.05 * salario;
			System.out.println("Reajuste de 5%");
		}else if(meses > 12 && meses <= 48) {
			reajuste = 0.07 * salario;
			System.out.println("Reajuste de 7%");
		}else {
			System.out.println("Incorreto! ");
		}
		
		System.out.println("");
		System.out.println("Reajuste: R$ " + reajuste);
		System.out.println("Total: R$ " + (salario+reajuste));
		
	}
}
