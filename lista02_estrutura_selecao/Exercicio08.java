package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite Ano nascimento 1° Irmão: ");
		int dataNascimentoPrimeiro = input.nextInt();
		System.out.print("Digite Ano nascimento 2° Irmão: ");
		int dataNascimentoSegundo = input.nextInt();
		System.out.print("Digite Ano nascimento 3° Irmão: ");
		int dataNascimentoTerceiro = input.nextInt();
		
		int anoAtual = 2025;
		
		int mesmaIdade = 1;
		
		if(dataNascimentoPrimeiro == dataNascimentoSegundo || dataNascimentoSegundo == dataNascimentoTerceiro) {
			mesmaIdade++;
		}else if(dataNascimentoPrimeiro == dataNascimentoTerceiro || dataNascimentoTerceiro == dataNascimentoSegundo) {
			mesmaIdade++;
		}
		
		if(mesmaIdade == 1) {
			System.out.println("Todos os Tem idades diferentes");
		}else if(mesmaIdade == 2) {
			System.out.println("Existe Gêmeos entre eles");
		}else {
			System.out.println("Eles são Trigêmeos!");
		}
		
		
	}
}
