package avaliacoes.avaliacao01;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double lados[] = new double[3];
		int aux = 0; 
		int maiorOcorrencia = Integer.MIN_VALUE;// Todos começam com pelo menos 1 ocorrencia!
		
		
		System.out.print("Escreva o 1° lado do triangulo: ");
		lados[0] = input.nextDouble();
		
		System.out.print("Escreva o 2° lado do triangulo: ");
		lados[1] = input.nextDouble();
		
		System.out.print("Escreva o 3° lado do triangulo: ");
		lados[2] = input.nextDouble();
		
		
		for(int i = 0; i < lados.length; i++) {
			
			for(int j= 0; j < lados.length; j++) {
				
				if(lados[i] == lados[j]) {
					aux++;
				}
				
			}
			
			if(aux > maiorOcorrencia) {
				maiorOcorrencia = aux;
			}
			
			aux = 0;
			
		}
		
		System.out.println();
		
		if(maiorOcorrencia == 1) {
			System.out.println("Triangulo Escaleno (três lados diferentes)");
		}else if(maiorOcorrencia == 2) {
			System.out.println("Triangulo Isósceles (dois lados iguais) ");
		}else if(maiorOcorrencia == 3) {
			System.out.println("Equilátero (três lados iguais)");
		}
		
		
		
	}

}
