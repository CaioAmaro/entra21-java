package lista07_orientacao_objetos.exercicio06;

public class Comparacoes {

	public static Mercado getMaiorVendendorMaca(Mercado[] vetor) {
		
		Mercado mercado = new Mercado();
		double maiorReceitaMaca = Double.MIN_VALUE;


		for(int i = 0; i < vetor.length; i++) {

			if(vetor[i].obterReceitaMaca() > maiorReceitaMaca){
				mercado = vetor[i];
				maiorReceitaMaca = vetor[i].obterReceitaMaca();
			}

		}

		return mercado;
		
	}

	public static Mercado getMaiorVendendorLaranja(Mercado[] vetor) {

		Mercado mercado = new Mercado();
		double maiorReceitaLaranja = Double.MIN_VALUE;


		for(int i = 0; i < vetor.length; i++) {

			if(vetor[i].obterReceitaLaranja() > maiorReceitaLaranja){
				mercado = vetor[i];
				maiorReceitaLaranja = vetor[i].obterReceitaLaranja();
			}

		}

		return mercado;

	}

	public static Mercado getMercadoMaiorReceita(Mercado[] vetor){
		Mercado mercado = new Mercado();

		double maiorReceita = Double.MIN_VALUE;

		for(int i = 0; i < vetor.length; i++) {

			if(vetor[i].obterReceita() > maiorReceita){
				mercado = vetor[i];
				maiorReceita = vetor[i].obterReceita();
			}

		}

		return mercado;
	}

	public static Mercado getMercadoMenorReceita(Mercado[] vetor){
		Mercado mercado = new Mercado();

		double menorReceita = Double.MAX_VALUE;

		for(int i = 0; i < vetor.length; i++) {

			if(vetor[i].obterReceita() < menorReceita){
				mercado = vetor[i];
				menorReceita = vetor[i].obterReceita();
			}

		}

		return mercado;
	}

	public static Mercado getMercadoMeioReceita(Mercado[] vetor){
		Mercado mercado = new Mercado();
		String maiorReceita = getMercadoMaiorReceita(vetor).getNome();
		String menorReceita = getMercadoMenorReceita(vetor).getNome();

		for(int i = 0; i < vetor.length; i++){
			if( !vetor[i].getNome().equals(maiorReceita) && !vetor[i].getNome().equals(menorReceita) ){
				mercado = vetor[i];
			}
		}
		return mercado;
	}

	public static String getProdutoMaiorLucro(Mercado[] vetor){
		String produto = "";
		double laranja = 0;
		double maca = 0;

		for(int i = 0; i < vetor.length; i++){

			laranja = vetor[i].obterReceitaLaranja();
			maca = vetor[i].obterReceitaMaca();

		}

		if(laranja > maca){
			produto += "Laranja";
		}else{
			produto += "Maça";
		}

		return produto;
	}

}


         