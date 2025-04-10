package lista04_vetores_matrizes;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int vetor[] = {5,7,1,10,5};
		
		int maiorValor = vetor[0];
		int menorValor = vetor[0];
		double soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
			
			if(vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
			
			soma += vetor[i];
			
		}
		
		double media = soma / vetor.length;
		
		
		System.out.println("Valor maior = " + maiorValor);
		System.out.println("Valor menor = " + menorValor);
		System.out.println("Média = " + media);
		
		
	}

}
