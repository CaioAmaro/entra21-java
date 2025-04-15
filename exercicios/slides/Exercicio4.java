package exercicio.exercicios_slides;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = input.next();
		
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = input.next();
		
		System.out.println("");
		
		System.out.println("Seu nome é " + nome + " " + sobrenome);
	}
}
