package lista07_orientacao_objetos.exercicio03;

/*
 * 3)
A partir das representações abaixo dos objetos de uma classe Produto, escreva o código
necessário para suportar tais objetos.
Ou seja, o código necessário para criar a classe e instanciar os objetos de modo que fiquem
com o estado apresentado.

produto1: Produto
nome = “Caderno”
descricao = “Caderno em espiral tamanho médio”
precoUnitario = 4.50
desconto = 15

produto2: Produto
nome = “Caneta ESF”
descricao = “Caneta esferográfica 5mm”
precoUnitario = 1.20
desconto = 2

produto3: Produto
nome = “Esquadro”
descricao = “Esquadro de acrílico 20 cm”
precoUnitario = 2.35
desconto = 10
 * */

public class Main {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		
		produto1.nome = "Caderno";
		produto1.descricao = "Caderno em espiral tamanho médio";
		produto1.precoUnitario = 4.50;
		produto1.desconto = 15;
		
		produto2.nome = "Caneta ESF";
		produto2.descricao = "Caneta esferográfica 5mm";
		produto2.precoUnitario = 1.20;
		produto2.desconto = 2;
		
		produto3.nome = "Esquadro";
		produto3.descricao = "Esquadro de acrílico 20 cm";
		produto3.precoUnitario = 2.35;
		produto3.desconto = 10;
		
		
	}
}
