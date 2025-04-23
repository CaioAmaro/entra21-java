package lista07_orientacao_objetos.exercicio06;

import lista07_orientacao_objetos.exercicio02.Mercado;

/*
 * 6)
Utilizando a classe Mercado.
Atribua valores às variáveis da classe Mercado para cada um dos objetos de Mercado.


Calcule:
a) Quem teve a maior receita vendendo maçãs?
b) Quem teve a maior receita vendendo laranjas?
c) Qual das lojas teve a maior receita?
d) Qual das lojas teve a menor receita?
e) Qual das lojas ficou no "meio" em termos de receita?
f) Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou laranjas?
 * */

public class Main {
	public static void main(String[] args) {
		
		Mercado unidadeDeBlumenau = new Mercado();
		Mercado unidadeDeJoinville = new Mercado();
		Mercado unidadeDeFlorianopolis = new Mercado();
		
		Mercado vetor[] = {unidadeDeBlumenau, unidadeDeJoinville, unidadeDeFlorianopolis};
		
		vetor[0].nome = "Blumenau";
		vetor[0].qtdVendaMaca = 3;
		vetor[0].precoMaca = 3.5;
		vetor[0].qtdVendaLaranja = 5;
		vetor[0].precoLaranja = 3.4;
		
		vetor[1].nome = "Joinville";
		vetor[1].qtdVendaMaca = 2;
		vetor[1].precoMaca = 3.1;
		vetor[1].qtdVendaLaranja = 9;
		vetor[1].precoLaranja = 3.1;
		
		vetor[2].nome = "Florianopolis";
		vetor[2].qtdVendaMaca = 1;
		vetor[2].precoMaca = 34;
		vetor[2].qtdVendaLaranja = 2;
		vetor[2].precoLaranja = 5.2;
		
		
		
	}
}
