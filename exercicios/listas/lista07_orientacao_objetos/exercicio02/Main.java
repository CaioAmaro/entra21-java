package lista07_orientacao_objetos.exercicio02;

/*
 * 2) Crie uma classe denominada Mercado.
	Essa classe terá 5 atributos, as informações que deverão ser guardadas são:
• Nome do mercado
• Número de maçãs vendidas por ano.
• Preço de venda das maçãs.
• Número de laranjas vendidas por ano.
• Preço de venda das laranjas.
Crie 3 objetos da classe Mercado chamados:
unidadeDeBlumenau
unidadeDeJoinville
unidadeDeFlorianopolis
Atribua valores a esses objetos 
*/

public class Main {
	public static void main(String[] args) {
		
		Mercado unidadeDeBlumenau = new Mercado();
		Mercado unidadeDeJoinville = new Mercado();
		Mercado unidadeDeFlorianopolis = new Mercado();
		
		unidadeDeBlumenau.nome = "Blumenau";
		unidadeDeBlumenau.qtdVendaMaca = 3;
		unidadeDeBlumenau.precoMaca = 3.5;
		unidadeDeBlumenau.qtdVendaLaranja = 5;
		unidadeDeBlumenau.precoLaranja = 3.4;
		
		unidadeDeJoinville.nome = "Joinville";
		unidadeDeJoinville.qtdVendaMaca = 2;
		unidadeDeJoinville.precoMaca = 3.1;
		unidadeDeJoinville.qtdVendaLaranja = 9;
		unidadeDeJoinville.precoLaranja = 3.1;
		
		unidadeDeFlorianopolis.nome = "Florianopolis";
		unidadeDeFlorianopolis.qtdVendaMaca = 1;
		unidadeDeFlorianopolis.precoMaca = 34;
		unidadeDeFlorianopolis.qtdVendaLaranja = 2;
		unidadeDeFlorianopolis.precoLaranja = 5.2;
		
		
		
	}
}
