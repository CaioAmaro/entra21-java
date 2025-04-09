package lista05_matrizes;

public class Exercicio06 {
	public static void main(String[] args) {
		
		String matrizA[][] = {
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"}
		};
		
		String matrizB[][] = {
				{"*", "*", "*", "*"},
				{"*", " ", " ", "*"},
				{"*", " ", " ", "*"},
				{"*", "*", "*", "*"}
		};
		
		String matrizC[][] = {
				{"*", " ", " ", " "},
				{"*", "*", " ", ""},
				{"*", "*", "*", ""},
				{"*", "*", "*", "*"}
		};
		
		
		
		System.out.println("Matriz A");
		for(int i=0; i < matrizA.length; i++) {
			for(int j=0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("Matriz B");
		for(int i=0; i < matrizB.length; i++) {
			for(int j=0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("Matriz C");
		for(int i=0; i < matrizC.length; i++) {
			for(int j=0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println("");
		}
		
		
	}
}
