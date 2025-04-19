package exercicio_metodos;

import java.util.Scanner;

/*10) Faça um método booleano que retorne true se o número passado como parâmetro seja par.
	  Retorne false caso seja ímpar.
 * 
 * */

public class Exercicio10 {
	
	public static boolean isPar(int n) {
		return n % 2 == 0;
	}
	
	public static void main(String[] args) {
		
		boolean repetir = true;
		
		while(repetir) {
			Scanner input = new Scanner(System.in);
			System.out.print("Digite um número: ");
			int n = input.nextInt();
			
			if(isPar(n)) System.out.println("é par");
			else System.out.println("é impa");
			
			System.out.println("");
			
			System.out.println("Deseja ir de novo?");
			System.out.println("1 - sim");
			System.out.println("2 - não");
			int opcao = input.nextInt();
			
			System.out.println("");
			
			
			if(opcao == 2) repetir = false;
			
		}
		
		
	}
}
