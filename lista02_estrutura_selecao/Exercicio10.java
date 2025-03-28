package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite n1: ");
		double n1 = input.nextDouble();
		System.out.print("Digite n2: ");
		double n2 = input.nextDouble();
		System.out.println("");
		System.out.println("Operações");
		System.out.println("1 - SOM ");
		System.out.println("2 - SUB ");
		System.out.println("3 - MUL ");
		System.out.println("4 - DIV ");
		System.out.print("Digite Operação desejada: ");
		int op = input.nextInt();
		
		
		if(op == 1) {
			System.out.println("Soma = " + (n1+n2));
		}else if(op == 2){
			System.out.println("Subtração = " + (n1-n2));
		}else if(op == 3) {
			System.out.println("Multiplcação = " + (n1*n2));
		}else if(op == 4) {
			System.out.println("Divisão = " + (n1/n2));
		}else {
			System.out.println("Operação incorreta! ");
		}
		
		
	}
}
