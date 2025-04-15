package lista06_metodos;

import java.util.Scanner;

/*  5) Faça um código que receba duas entradas do usuário
 * 
	-> Se Algum dos dois números for 5 ou a soma deles for 5 ou a diferença deles for 5 (imprima as duas entradas ao cubo)
	-> Se não imprima o quadrado dos números.
	
*/

public class Exercicio05 {
	
	public static void quadroOuCubo(int n1, int n2) {
		
		System.out.println("");
		if(n1 == 5 || n2 == 5) System.out.println("Algum dos dois números são 5");
		else if((n1 + n2 == 5)) System.out.println("Soma dos números  é 5");
		else if((n1 - n2 == 5) || (n2 - n1 == 5)) System.out.println("diferença n1-n2 ou n2-n1 é 5");
		System.out.println("");
		
		if(n1 == 5 || n2 == 5 || (n1 - n2 == 5) || (n2 - n1 == 5) || (n1 + n2 == 5)) {
			System.out.println(n1 + "³ = " + Math.pow(n1, 3));
			System.out.println(n2 + "³ = " + Math.pow(n2, 3));
					
		}else {
			System.out.println(n1 + "² = " + Math.pow(n1, 2));
			System.out.println(n2 + "² = " + Math.pow(n2, 2));
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a 1° valor: ");
		int valor1 = input.nextInt();
		System.out.print("Digite a 2° valor: ");
		int valor2 = input.nextInt();		
		
		quadroOuCubo(valor1, valor2);
		
	}

}
