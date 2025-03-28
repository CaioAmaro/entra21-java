package lista03_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String inscricao = "";
		double altura = 0;
		int exit = 1; //1-Ficar -- 0-Sair
		int atleta = 0;
		
		double alturaMenor = 0;
		double alturaMaior = 0;
		String inscricaoMenor = "";
		String inscricaoMaior = "";
		
		double somaAlturas =0;
		
		
		while(exit != 0) {
			
			System.out.println("Atleta["+(atleta+1)+"]");
			System.out.print("Digite número Inscrição: ");
			inscricao = input.next();
			System.out.print("Digite altura:");
			altura = input.nextDouble();
			somaAlturas +=altura;
			
			atleta++;
			
			System.out.println("");
			System.out.println("Continuar(1) / Sair(0)");
			System.out.print("Digite: ");
			exit = input.nextInt();
			
			System.out.println();
			System.out.println("------------");
			System.out.println();
			
			if(atleta == 1) {
				alturaMenor = altura;
				alturaMaior = altura;
				inscricaoMenor = inscricao;
				inscricaoMaior = inscricao;
			}
			
			System.out.println("_> " + alturaMaior);
			System.out.println("_> " + inscricaoMaior);
			System.out.println("_> " + alturaMenor);
			System.out.println("_> " + inscricaoMenor);
			
			
			if(altura >= alturaMaior) {
				alturaMaior = altura;
				inscricaoMaior = inscricao;
			}
			
			if(altura <= alturaMenor) {
				alturaMenor = altura;
				inscricaoMenor = inscricao;
			}
		
			
		}
		
		double media = somaAlturas/atleta;
		
		System.out.println("Altura Mais Alta");
		System.out.println("Inscrição: "+inscricaoMaior);
		System.out.println("Altura: "+alturaMaior);
		
		System.out.println("");
		
		System.out.println("Altura Maios Baixa");
		System.out.println("Inscrição: "+inscricaoMenor);
		System.out.println("Altura: "+alturaMenor);
		
		System.out.println("");
		
		System.out.println("Total de Atletas: "+atleta);
		System.out.println("Média de Alturas: "+media);
		
	}
}
