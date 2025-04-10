package lista04_vetores_matrizes;

public class Exercicio04 {

		public static void main(String[] args) {
			
			double vetor[] = new double[100];
			
			for(int i = 0;  i < vetor.length; i++) {
			
				double quadrado = Math.pow(i, 2);
				vetor[i] = quadrado;
				System.out.println("["+i+"] = " + quadrado);
				
				
			}
			
		}
}
