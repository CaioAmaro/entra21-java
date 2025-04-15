package lista06_metodos;

/*
 	4) Faça um programa que descubra:
 
	a) O maior elemento de um vetor
	b) O menor elemento de um vetor
	c) A média dos valores
	
	(Criar um método para cada questão)
*/

public class Exercicio04 {
	
	public static void mostrarLista(double array[]) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		
		System.out.println("\n");
	}
	
	public static void maiorElemento(double array[]) {

		double maiorElemento = Double.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= maiorElemento) {
				maiorElemento =  array[i];
			}
		}
		
		System.out.println("Maior elemento da lista é " + maiorElemento);
		
		
	}
	
	public static void menorElemento(double array[]) {
		double menorElemento = Double.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] <= menorElemento) {
				menorElemento =  array[i];
			}
		}
		
		System.out.println("Maior elemento da lista é " + menorElemento);
		
	}
	
	public static void media(double array[]) {
		
		double soma = 0;
		
		for(int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		
		double media = soma/array.length;
		
		System.out.println("Valor médio dos elementos da lista é " + media);
		
	}
	
	public static void executarTodos(double array[]) {
		mostrarLista(array);
		maiorElemento(array);
		menorElemento(array);
		media(array);
	}
	
	public static void main(String[] args) {
		
		double array[] = {2.4, 5.6, 7.2, 1.2, 4.8};
		
		executarTodos(array);
		
	}

}
