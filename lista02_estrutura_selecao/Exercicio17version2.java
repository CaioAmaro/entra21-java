package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio17version2 {
	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o Dia: ");
		int dia = input.nextInt();
		
		if(dia >= 1 && dia <= 31) {
			
			System.out.print("Digite o mês: ");
			int mes = input.nextInt();
			
			if(mes >= 1 && mes <= 12) {
				
				if(mes == 2 && dia > 29) {
					System.out.println("Data Invalida!");
				}else {
					if( (mes == 4 || mes == 6 || mes == 9 || mes == 10) && dia > 30 ) {
						System.out.println("Data Invalida!");
					}
				}
				
				
				
	
			}else {
				System.out.println("Data Invalida!");
			}
			
			
		}else {
			System.out.println("Data Invalida!");
		}
		
	}
}
