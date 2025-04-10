package lista04_vetores_matrizes;

public class Exercicio06 {
	public static void main(String[] args) {
		
		int vetor[] = {5,3,7,2,8,5,6};
		int vetorOrdemInvertida[] = new int[7];
		int aux = 0;
		
		
		for(int i = vetor.length-1; i >= 0 ; i--) {
			vetorOrdemInvertida[aux] = vetor[i];
			aux++;
		}
		
		
		System.out.println("Vetor Original:");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("vetor["+i+"] = "+vetor[i]);
		}
		
		System.out.println();
		
		System.out.println("Vetor Ordem Invertida!");
		for(int i = 0; i < vetorOrdemInvertida.length; i++) {
			System.out.println("vetorOrdemInvertida["+i+"] = "+vetorOrdemInvertida[i]);
		}
		
	}
}
