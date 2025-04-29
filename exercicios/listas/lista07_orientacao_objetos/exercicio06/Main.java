package lista07_orientacao_objetos.exercicio06;

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
		
		Mercado unidadeDeBlumenau = new Mercado("Blumenau", 15, 1, 1, 1);
		Mercado unidadeDeJoinville = new Mercado("Joinville", 11, 1, 1, 1);
		Mercado unidadeDeFlorianopolis = new Mercado("Florianopolis", 13, 1, 1, 1);
		
		Mercado[] vetor = {unidadeDeBlumenau, unidadeDeJoinville, unidadeDeFlorianopolis};

		System.out.println("Maior vendendor de maça é " + Comparacoes.getMaiorVendendorMaca(vetor).getNome() );
		System.out.println("Maior vendendor de Laranja é " + Comparacoes.getMaiorVendendorLaranja(vetor).getNome() );
		System.out.println("Maior receita foi " + Comparacoes.getMercadoMaiorReceita(vetor).getNome());
		System.out.println("Menor receita foi " + Comparacoes.getMercadoMenorReceita(vetor).getNome());
		System.out.println("Meio receita foi " + Comparacoes.getMercadoMeioReceita(vetor).getNome());
		System.out.println("Produto que teve mais receita foi " + Comparacoes.getProdutoMaiorLucro(vetor));
	}
}
