package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		double numero = input.nextDouble();
		
		System.out.println("");
		System.out.println("Operações");
		System.out.println("[1] Somar 10");
		System.out.println("[2] Subtraia 10");
		System.out.println("[3] Multiplique 10");
		System.out.println("[4] Divida por 10");
		
		System.out.println("");
		System.out.print("Digite a operações desejada: ");
		int op = input.nextInt();
		
		if(op == 1) {
			System.out.println("Soma de "+ numero + " +  10 = "+ (numero+10));
		}else if(op == 2) {
			System.out.println("Subtrair de "+ numero + " -  10 = "+ (numero-10));
		}else if(op == 3) {
			System.out.println("Multiplicar de "+ numero + " *  10 = "+ (numero*10));
		}else if(op == 4) {
			System.out.println("Dividir de "+ numero + " /  10 = "+ (numero/10));
		}else {
			System.out.println("Operação não relacionada!");
		}
		
	}

}
