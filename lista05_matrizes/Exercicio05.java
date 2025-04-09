package lista05_matrizes;

public class Exercicio05 {
	public static void main(String[] args) {
		
		int matriz[][] = {
				{1, 8, 23},
			    {2, 6, 30},
			    {1, 9, 19},
			    {2, 7, 35},
			    {1, 5, 27},
			    {2, 10, 22},
			    {1, 4, 54},   // mulher > 50
			    {2, 6, 26},
			    {1, 7, 21},
			    {2, 8, 29},
			    {1, 6, 58},   // mulher > 50
			    {2, 3, 38},
			    {1, 9, 20},
			    {2, 5, 31},
			    {1, 10, 18},
			    {2, 2, 40},
			    {1, 7, 25},
			    {2, 6, 28},
			    {1, 4, 22},
			    {2, 8, 32},
			    {1, 5, 53},   // mulher > 50
			    {2, 9, 19},
			    {1, 6, 27},
			    {2, 7, 34},
			    {1, 8, 21},
			    {2, 3, 36},
			    {1, 10, 20},
			    {2, 5, 33},
			    {1, 7, 59},   // mulher > 50
			    {2, 6, 37}
		};
		
		double somaNotas = 0;
		double mediaNotas = 0;
		double somaNotasHomens = 0;
		double mediaNotasHomens = 0;
		double countHomens = 0;
		int idadeMulherMaisJovem = Integer.MAX_VALUE;
		double notaMulherMaisJovem = 0;
		int countMulheresMaioresCinquentaNotasMaiorQueMedia = 0;
		
		
		for(int i = 0; i < matriz.length; i++) {
			somaNotas += matriz[i][1];
			
			//Se for Homem
			if(matriz[i][0] == 2) {
				somaNotasHomens += matriz[i][1];
				countHomens++;
			}
			
			//Se for Mulher
			if(matriz[i][0] == 1) {
				
				//For Mulher Mais Jovem
				if(matriz[i][2] < idadeMulherMaisJovem) {
					idadeMulherMaisJovem = matriz[i][2];
					notaMulherMaisJovem = matriz[i][1];
				}
				
				
				
			}
				
			
		}
		
		mediaNotas = somaNotas/matriz.length;
		
		for(int i = 0; i < matriz.length; i++) {
			//Idade For Maior que 50+
			if(matriz[i][2] > 50 && matriz[i][1] > mediaNotas) {
				
				countMulheresMaioresCinquentaNotasMaiorQueMedia++;
			}
			
		}
		
		
		mediaNotasHomens = somaNotasHomens/countHomens;
		
		System.out.println("Média Notas: " + mediaNotas);
		System.out.println("Média Notas por homens: " + mediaNotasHomens);
		System.out.println("Nota da Mulher Mais Jovem: " + notaMulherMaisJovem);
		System.out.println("Quantas mulheres 50+ colocaram nota maior que média: " + countMulheresMaioresCinquentaNotasMaiorQueMedia );
		
	}
}
