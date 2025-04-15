package lista05_matrizes;

public class Exercicio02 {
	public static void main(String[] args) {
		
		int matriz[][] = {
				{1,5},
				{2,3}
		};
		
		int diagonalPrincipal = 1;
		int diagonalSecundario = 1;
		int determinante = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				

				if(i == j) {
					diagonalPrincipal *= matriz[i][j];
				}else {
					diagonalSecundario *= matriz[i][j];
				}
			}
			System.out.println("");
	
		}
		
		
		determinante = diagonalPrincipal - diagonalSecundario;
		
		System.out.println("");
		System.out.println("Determinante: " + determinante);
		
	}
}
