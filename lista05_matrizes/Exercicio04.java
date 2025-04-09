package lista05_matrizes;

public class Exercicio04 {
	public static void main(String[] args) {
		int[][] matriz = {
			{2104, 3, 399900},
			{1600, 3, 329900},
			{2400, 3, 369000},
			{1416, 2, 232000},
			{3000, 4, 539900},
			{1985, 4, 299900},
			{1534, 3, 314900},
			{1427, 3, 199000},
			{1380, 3, 212000},
			{1494, 3, 242500},
			{1940, 4, 240000},
			{2000, 3, 347000},
			{1890, 3, 330000},
			{4478, 5, 699900},
			{1268, 3, 259900}
	};
		
		
		double precoTotal = 0;
		double mediaPreco = 0;
		double menorCasa = Double.MAX_VALUE;
		double precoMenorCasa = 0;
		double maiorPreco = Double.MIN_VALUE;
		int quantidadeQuartosCasaCara = 0;
		int qtdMaiorQuartos = Integer.MIN_VALUE;
		int qtdMenorQuartos = Integer.MAX_VALUE;
		double tamanhoMaiorQuantidadeQuartos = 0;
		double tamanhoMenorQuantidadeQuartos = 0;
		double somaTamanhoPorCasasMaisTresMil = 0;
		double mediaTamanhoPorCasasMaisTresMil = 0;
		int aux = 0;
		
		
		
		for(int i = 0; i < matriz.length; i++) {
			
			if(matriz[i][0] < menorCasa) {
				menorCasa = matriz[i][0];
				precoMenorCasa = matriz[i][2];
			}
			
			
			
			if(matriz[i][2] > maiorPreco) {
				maiorPreco = matriz[i][2];
				quantidadeQuartosCasaCara = matriz[i][1];
			}
			
			
			if(matriz[i][1] > qtdMaiorQuartos) {
				qtdMaiorQuartos = matriz[i][1];
				tamanhoMaiorQuantidadeQuartos = matriz[i][0];
				
			}else if(matriz[i][1] < qtdMenorQuartos) {
				qtdMenorQuartos = matriz[i][1];
				tamanhoMenorQuantidadeQuartos = matriz[i][0];
				
			}
			
			
			if(matriz[i][2] > 300000) {
				somaTamanhoPorCasasMaisTresMil += matriz[i][0];
				aux++;
				
			}
			
			
			
			precoTotal += matriz[i][2];
		}
		
		
		mediaPreco = precoTotal/matriz.length;
		mediaTamanhoPorCasasMaisTresMil = somaTamanhoPorCasasMaisTresMil/aux;
		
		
		System.out.println("");
		System.out.println("A) Média dos preços: R$"+ mediaPreco);
		System.out.println("B) preco da menor casa: R$"+ precoMenorCasa);
		System.out.println("C) Quantidade de Quartos da casa mais cara : "+ quantidadeQuartosCasaCara);
		System.out.println("D) Diferença entre tamanho da casa com maior e menor de casa é: " + (tamanhoMaiorQuantidadeQuartos - tamanhoMenorQuantidadeQuartos ));
		System.out.println("E) Média de tamanho, casas com preços maiores que R$ 300.000,00: " + mediaTamanhoPorCasasMaisTresMil);
		
	}
}
