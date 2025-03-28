package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a idade do nadador: ");
		int idade = input.nextInt();
		
		System.out.println("");
		System.out.println("Categoria do atleta -");
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Pré-Mirim");
		}else if(idade >= 8 && idade <= 10) {
			System.out.println("Mirim");
		}else if(idade >= 11 && idade <= 13) {
			System.out.println("Infatil");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Infanto-Juvenil");
		}else if(idade >= 18 && idade <= 20) {
			System.out.println("Juvenil");
		}else if(idade >= 18 && idade <= 50) {
			System.out.println("Adultos");
		}else{
			System.out.println("Idade não tem categoria!");
		}
		
	}
}
