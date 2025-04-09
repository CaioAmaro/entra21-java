package lista05_matrizes;

public class Exercicio07 {
	public static void main(String[] args) {
		
		int matriz[][] = {
				{3, 6, 7, 3 ,5},
				{2, 3, 5, 5, 7},
				{7, 3, 5, 2, 3}
		};
		
		
		int numerosVerificados[] = new int[15];
		int percorrer = 0; //percorre numeros verificados.  [3] 
		
		
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				int ocorrencias = 0;
				
				
				for(int k = 0; k < numerosVerificados.length; k++) {
					if(matriz[i][j] == numerosVerificados[k]) {
						ocorrencias++;
					}
				}
				
				
				if(ocorrencias == 0) {
					numerosVerificados[percorrer] = matriz[i][j];
					percorrer++;
				}
				
				
			}
		}
		
		for(int i = 0; i < numerosVerificados.length; i++) {
			int ocorrencias = 0;
			
			for(int j = 0; j < matriz.length; j++) {
				for(int l = 0; l < matriz[j].length; l++) {
					
					if(numerosVerificados[i] == matriz[j][l]) {
						ocorrencias++;
					}
					
				}
			}
			
			if(ocorrencias > 1) {
				System.out.println("Existem números repetidos do valor ["+numerosVerificados[i]+"] - ");
				System.out.println(" ");
				
				
				for(int j = 0; j < matriz.length; j++) {
					for(int l = 0; l < matriz[j].length; l++) {
						
						if(numerosVerificados[i] == matriz[j][l]) {
							System.out.println("Indice["+(j+1)+"]["+(l+1)+"]");							
						}
						
						
						
					}
					
				}
				
				
		System.out.println(" ");
		
				for(int j = 0; j < matriz.length; j++) {
					for(int l = 0; l < matriz[j].length; l++) {
						
						if(numerosVerificados[i] == matriz[j][l]) {
							System.out.print(matriz[j][l] + " ");							
						}else {
							System.out.print("X ");
						}
						
						
						
					}
					
					System.out.println("");
					
				}
				
				System.out.println(" ");
				
				
			}
			
			
		}
		
		int qtdPares = 0;
		
		//QUANTIDADE NUMEROS PARES
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] % 2 == 0) {
					qtdPares++;
				}
			}
		}
		
	
		
		
		double soma = 0;
		double mediaNumeros = 0;
		int qtdImpares = 0;
		
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
		}
		
		mediaNumeros = soma / (matriz.length * matriz[0].length);
		
		
		
		//QuANTIDADE IMPARES MAIORES QUE MÉDIA
				for(int i = 0; i < matriz.length; i++) {
					for(int j = 0; j < matriz[i].length; j++) {
						if((matriz[i][j] % 2) != 0 && matriz[i][j] > mediaNumeros) {
							qtdImpares++;
						}
					}
				}
				
				System.out.println("");
				System.out.println("Média dos numeros é " + mediaNumeros);
				System.out.println("Quantidade de números Impares é maiores que média "+qtdImpares);
				System.out.println("Quantidade de números pares é "+qtdPares);
		
	
		
	}
}
