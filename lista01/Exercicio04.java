package lista01;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a Matricula: ");
		String matricula = input.next();
		
		System.out.print("Digite o Nome: ");
		String nome = input.next();
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		double hrTrabalhadas = input.nextDouble();
		
		System.out.print("Digite quantos R$/Hora: ");
		double valorHora = input.nextDouble();
		
		double salario = hrTrabalhadas * valorHora;
		
		System.out.println("");
		System.out.println("----");
		System.out.println("");
		
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("Horas Trabalhadas: " + hrTrabalhadas);
		System.out.println("R$/Hora: R$"+ valorHora);
		System.out.printf("Salário mensal: R$ %.2f", salario);
		
	}
}
