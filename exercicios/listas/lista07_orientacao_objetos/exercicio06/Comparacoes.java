package lista07_orientacao_objetos.exercicio06;

public class Comparacoes {

	public static Mercado getMaiorVendendorMaca(Mercado[] vetor) {
		
		Mercado mercado = new Mercado();
		double receitaMaca = Double.MIN_VALUE;


		for(int i = 0; i < vetor.length; i++) {

			double receitaComparando = vetor[i].precoMaca * vetor[i].qtdVendaMaca;

			System.out.println(receitaComparando);

			if(receitaComparando > receitaMaca){
				System.out.println("entrei");
				mercado = vetor[i];
				receitaMaca = receitaComparando;
			}

		}

		return mercado;
		
	}

	public static Mercado getMaiorVendendorLaranja(Mercado[] vetor) {

		Mercado mercado = new Mercado();
		double receitaLaranja = Double.MIN_VALUE;


		for(int i = 0; i < vetor.length; i++) {

			double receitaComparando = vetor[i].precoLaranja * vetor[i].qtdVendaLaranja;

			if(receitaComparando > receitaLaranja){
				mercado = vetor[i];
				receitaLaranja = receitaComparando;
			}

		}

		return mercado;

	}

	public static Mercado getMercadoMaiorReceita(Mercado[] vetor){
		Mercado mercado = new Mercado();

		double receitaTotal = Double.MIN_VALUE;


		for(int i = 0; i < vetor.length; i++) {

			double receitaComparando = (vetor[i].precoLaranja * vetor[i].qtdVendaLaranja) + (vetor[i].precoMaca * vetor[i].qtdVendaMaca);

			if(receitaComparando > receitaTotal){
				mercado = vetor[i];
				receitaTotal = receitaComparando;
			}

		}

		return mercado;
	}

	public static Mercado getMercadoMenorReceita(Mercado[] vetor){
		Mercado mercado = new Mercado();

		double receitaTotal = Double.MAX_VALUE;


		for(int i = 0; i < vetor.length; i++) {

			double receitaComparando = (vetor[i].precoLaranja * vetor[i].qtdVendaLaranja) + (vetor[i].precoMaca * vetor[i].qtdVendaMaca);

			if(receitaComparando < receitaTotal){
				mercado = vetor[i];
				receitaTotal = receitaComparando;
			}

		}

		return mercado;
	}

	public static Mercado getMercadoMeioReceita(Mercado[] vetor){
		Mercado mercado = new Mercado();
		Mercado maiorReceita = getMercadoMaiorReceita(vetor);
		Mercado menorReceita = getMercadoMenorReceita(vetor);

		for(int i = 0; i < vetor.length; i++){
			if( !vetor[i].nome.equals(maiorReceita.nome) && !vetor[i].nome.equals(menorReceita.nome) ){
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

			laranja = vetor[i].precoLaranja * vetor[i].qtdVendaLaranja;
			maca = vetor[i].precoMaca * vetor[i].qtdVendaMaca;

		}

		if(laranja > maca){
			produto += "Laranja";
		}else{
			produto += "Maça";
		}

		return produto;
	}

}


         