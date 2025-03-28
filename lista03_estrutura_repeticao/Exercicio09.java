package lista03_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String sexo = "";
		double altura = 0;
		int exit = 1;
		int mulheres = 0;
		int homens = 0;
		double somaAlturaMulheres =0;
		double somaAlturaHomens = 0;
		
		while(exit != 0) {
			
			System.out.println("(M) Masculino// (F) Feminino");
			System.out.print("Sexo: ");
			sexo = input.next();
			
			while(!(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f"))) {
				System.out.println("Você digitou errado o sexo");
				System.out.println("Digite novamente!");
				System.out.print("Sexo: ");
				sexo = input.next();
			}
			
			System.out.print("Altura: ");
			altura = input.nextDouble();
			
			if(sexo.equalsIgnoreCase("m")) {
				homens++;
				somaAlturaHomens += altura;
			}else {
				mulheres++;
				somaAlturaMulheres += altura;
			}
			
			System.out.println("");
			
			System.out.println("Digite 0 - Sair");
			System.out.println("Digite 1 - Continue");
			System.out.print("Escolha: ");
			exit = input.nextInt();
			
			System.out.println("");
			
		}
		
		double mediaAlturaHomens = somaAlturaHomens/homens;
		double mediaAlturaMulheres = somaAlturaMulheres/mulheres;
		
		System.out.println("");
		
		System.out.println("Quantidade de Homens: "+homens);
		System.out.println("Altura média: "+ mediaAlturaHomens);
		
		System.out.println("");
		
		System.out.println("Quantidade de Mulheres: "+mulheres);
		System.out.println("Altura média: "+ mediaAlturaMulheres);
		
		
		
	}
}
