package lista04_vetores_matrizes;

public class Exercicio09 {
	public static void main(String[] args) {
		
		int vetor1[] = {2,6,3,7,3,4,8,5,1,2};
		int vetor2[] = {7,9,3,4,5,6,1,2,3,4};
		int vetor3[] = new int[10];
		
		
		for(int i = 0; i < 10; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			System.out.println("vetor1["+i+"] => "+vetor1[i]+ " + vetor2["+i+"] => "+vetor2[i]+ " = vetor3["+i+"] => "+ vetor3[i] );
		}
		
		
	}
}
