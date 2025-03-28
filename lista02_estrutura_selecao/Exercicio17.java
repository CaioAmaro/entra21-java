package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite ano: ");
		int ano = input.nextInt();
		System.out.println("");
		
		boolean anoBissexto = false;
		boolean dataValida = true;
		
		if(ano % 4 == 0) {
			anoBissexto = true;
			System.out.println("[" + ano + "] é Ano Bissexto");
		}else {
			anoBissexto = false;
		}
		
		System.out.println("");
		System.out.println("------------");
		System.out.println("");
		
	
		System.out.print("Digite o mês: ");
		int mes = input.nextInt();
		
		int dia = 0;
		
		
		if(mes >= 1 && mes <= 12) {
			
			System.out.println("");
			System.out.print("Digite o dia: ");
			dia = input.nextInt();
			
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
				if(dia <= 31 && dia >=1) {
					
				}else {
					System.out.println("Dia Incorreto! ");
					dataValida = false;
				}
			}else if(mes == 2) {
				if(anoBissexto == true) {
					if(dia <= 29 && dia >=1) {
						
					}else {
						System.out.println("Dia Incorreto! ");
						dataValida = false;
					}
				}else {
					if(dia <= 28 && dia >=1) {
						
					}else {
						System.out.println("Dia Incorreto! ");
						dataValida = false;
					}
				}
			}else{
				if(dia <= 30 && dia >=1) {
					
				}else {
					System.out.println("Dia Incorreto! ");
					dataValida = false;
				}
			}
			
		}else {
			System.out.println("Mês Invalido (Erro)");
			dataValida = false;
		}
		
		System.out.println("");
		
		if(!dataValida) {
			System.out.println("Você digitou um data errada! ");
		}else {
			
			System.out.println("");
			System.out.println(dia+"/"+mes+"/"+ano);
		}
		
		
	}
}
