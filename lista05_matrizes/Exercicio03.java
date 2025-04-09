package lista05_matrizes;

public class Exercicio03 {
	public static void main(String[] args) {
		
		int matrizA[][] = {
				{1,2},
				{3,4}
		};
		
		int matrizB[][] = {
				{1,2},
				{4,-7}
		};
		
		int matrizResultado[][] = new int[2][2];
		
	
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {	
				
				matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
				
			}
		}
		
		
		System.out.println("Matriz A");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		System.out.println("____________________________________________");
		
		System.out.println("Matriz B");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("____________________________________________");
		
		System.out.println("Matriz Resultado");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
}
