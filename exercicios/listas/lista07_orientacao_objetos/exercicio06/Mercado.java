package lista07_orientacao_objetos.exercicio06;

/*
 * Nome do mercado
• Número de maçãs vendidas por ano.
• Preço de venda das maçãs.
• Número de laranjas vendidas por ano.
• Preço de venda das laranjas.
*/

public class Mercado {
	private String nome;
	private int qtdVendaMaca;
	private double precoMaca;
	private int qtdVendaLaranja;
	private double precoLaranja;

	public Mercado(){

	}

	public Mercado(String nome, int qtdVendaMaca, double precoMaca, int qtdVendaLaranja, double precoLaranja) {
		this.nome = nome;
		this.qtdVendaMaca = qtdVendaMaca;
		this.precoMaca = precoMaca;
		this.qtdVendaLaranja = qtdVendaLaranja;
		this.precoLaranja = precoLaranja;
	}

	public double obterReceitaMaca(){
		return this.precoMaca * this.qtdVendaMaca;
	}

	public double obterReceitaLaranja(){
		return this.precoLaranja * this.qtdVendaLaranja;
	}

	public double obterReceita(){
		return obterReceitaMaca() + obterReceitaLaranja();
	}

	public String getNome() {
		return nome;
	}
}
