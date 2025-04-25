package lista06_metodos;

/*14) Faça um programa que receba 3 notas do usuário e informe a média aritmética dessas notas
		Retorne a média
 * 
 * */

public class Exercicio14 {
	
	public static double media(double notas[]) {
		double soma = 0;
		
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		return soma/notas.length;
	}
	
	
	public static void main(String[] args) {
		double notas[] = {5.4, 5.8, 4.3};
		
		System.out.println("Média das notas " + media(notas));
		
	}
}
