package avaliacao01;

public class Exercicio03tentativa2 {
	
	public static void main(String[] args) {
		
		//Crie um programa Java para encontrar a primeira sequência de números seguidos em um
		//vetor.
		//Por exemplo, o vetor {6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6} tem a primeira sequência sendo {0, 1, 2}.
		//Exiba essa sequência.
		//Peça para o usuário inserir os valores em um vetor de 8 posições
		
		int vetor[] = {6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6};
		
		
		int startPoint = 0;
		int endPoint = 0;
		int ocorrencia = 0;
		boolean imprima = false;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(i != vetor.length-1 ) {
				
				if(vetor[i+1] - vetor[i] == 1) {
					
					if(ocorrencia == 0) {
						startPoint = i;
					}
					
					ocorrencia++;
				}else {
					ocorrencia = 0;
					endPoint = i;
					imprima = 0;
				}
				
				if(ocorrencia == 0) {
					System.out.println();
				}
						
			}
			
			System.out.println(startPoint + " " + endPoint + " _>  " + ocorrencia);
	
		}
	}
}
