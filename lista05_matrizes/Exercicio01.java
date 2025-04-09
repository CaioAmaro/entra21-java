package lista05_matrizes;

public class Exercicio01 {
	public static void main(String[] args) {
		
		int lucro[][] = new int[12][2];
		
		for(int i = 0; i < lucro.length; i++) {
			
			for(int j = 0; j < lucro[i].length; j++) {
				
				if(j == 0) {
					lucro[i][j] = i+1;
				}else {
					lucro[i][j] = (i+7) * 37;
				}
				
			}
	
		}
		
		for(int i = 0; i < lucro.length; i++) {
			
			System.out.println("No mês " + lucro[i][0] + " a loja teve R$ " + lucro[i][1] + " de lucro.");
			
		}

	}
}
