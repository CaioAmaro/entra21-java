package exercicio_metodos;

/*
 * 16)
Faça um programa que descubra:
a) O maior elemento de um vetor
b) O menor elemento
c) A média dos valores
Retorne esses valores

*/

public class Exercicio16 {
	
	public static int maiorElemento(int array[]) {
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maior) maior = array[i];
		}
		
		
		return maior;
	}
	
	public static int menorElemento(int array[]) {
		int menor = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < menor) menor = array[i];
		}
	
		return menor;
	}
	
	public static double mediaElemento(int array[]) {
		int soma = 0;
		
		for(int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		
		return soma/array.length;
	}
	
	public static void main(String[] args) {
		int array[] = {4, 2, 0, 5, 1, 7, 2};
		
		System.out.println("Maior elemento é " + maiorElemento(array));
		System.out.println("Menor elemento é " + menorElemento(array));
		System.out.println("Média dos elementos é " + mediaElemento(array));
		
	}
}
