package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nota prova 1: ");
		double nota1 = input.nextDouble();
		System.out.print("Nota prova 2: ");
		double nota2 = input.nextDouble();
		System.out.print("Nota prova 3: ");
		double nota3 = input.nextDouble();
		System.out.print("Nota Exercicios: ");
		double notaExercicio = input.nextDouble();
		
		double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + notaExercicio) / 7;
		String situacao = "";
		
		System.out.println("");
		
		System.out.println("Média: " + mediaAproveitamento);
		
		if(mediaAproveitamento >= 9) {
			situacao = "A";
		}else if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9){
			situacao = "B";
		}else if(mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			situacao = "C";
		}else if(mediaAproveitamento >= 4 && mediaAproveitamento < 6) {
			situacao = "D";
		}else if(mediaAproveitamento < 4) {
			situacao = "E";
		}
		
		if(mediaAproveitamento <= 10 && mediaAproveitamento >7.5) {
			System.out.println("Aprovado! ");
		}else {
			System.out.println("Reprovado! ");
		}
		
		System.out.println("Situação: "+ situacao);
		
	}
}
