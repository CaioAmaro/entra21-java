package exercicio.exercicios_slides;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o 1° número: ");
		int numeroUm = input.nextInt();
		
		System.out.print("Digite o 2° número: ");
		int numeroDois = input.nextInt();
		
		System.out.print("Digite o 3° número: ");
		int numeroTres = input.nextInt();
		
		System.out.println();
		
		//Soma Entre numeroUm + NumeroDois
		int soma = numeroUm + numeroDois;
		
		//Multiplicação dos números somados pelo terceiro numero.
		int multiplicacao = soma * numeroTres;
		
		//Resultado do exercicio;
		System.out.println("Soma dos Números: " + numeroUm + " + " + numeroDois + " é " + soma);
		System.out.println("Multiplicação de " + soma + " por " + numeroTres + " é " + multiplicacao);
	}
}
