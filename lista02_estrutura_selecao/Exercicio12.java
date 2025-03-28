package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Categorias de conversão");
		System.out.println("[1] Temperatura");
		System.out.println("[2] Peso");
		System.out.println("[3] Comprimento");
		System.out.println("[4] Volume");
		
		System.out.print("Escolha a opção desejada: ");
		int categoria = input.nextInt();
		
		System.out.println("");
		
		if(categoria == 1) {
			System.out.println("Opções de conversão disponivel");
			System.out.println("[11] celsius");
			System.out.println("[12] fahrenheit ");
			System.out.println("[13] kelvin");
		}else if(categoria == 2) {
			System.out.println("Opções de conversão disponivel");
			System.out.println("[21] quilos");
			System.out.println("[22] libras");
			System.out.println("[23] onças");
		}else if(categoria == 3) {
			System.out.println("Opções de conversão disponivel");
			System.out.println("[31] metros");
			System.out.println("[32] pés ");
			System.out.println("[33] polegadas");
		}else if(categoria == 4) {
			System.out.println("Opções de conversão disponivel");
			System.out.println("[41] litros");
			System.out.println("[42] galão líquido ");
			System.out.println("[43] onças líquidas");
		}else {
			System.out.println("Opção Selecionada Errado!");
		}
		
		
		System.out.print("Qual médida você deseja converter? : ");
		int operacaoOriginal = input.nextInt();
		System.out.print("Para qual medida: ");
		int operacaoConversao = input.nextInt();
		System.out.print("Insira o valor: ");
		double valor = input.nextDouble();
		
		double resultado = 0;
		
		if(operacaoOriginal <= 13 && operacaoOriginal >= 11) { //TEMPRATURA
			if(operacaoOriginal == 11) { //Celsius
				if(operacaoConversao == 12) {
					resultado = valor * 9/5 + 32; // for Fahrenheit
				}else {
					resultado = valor + 273.15; //for Kelvin
				}
			}
			
			if(operacaoOriginal == 12) { // Fahrenheit
				if(operacaoConversao == 11) {
					resultado = (valor - 32) * 5/9; //for Celsius
				}else {
					resultado = (valor - 32) * 5/9 + 273.15; // Kelvin
				}
			}
			
			if(operacaoOriginal == 13) { // Kelvin
				if(operacaoConversao == 11) {
					resultado = valor - 273.15; // Celsius
				}else {
					resultado = (valor - 273.15) * 9/5 + 32; //Fahrenheit
				}
			}
		} else if(operacaoOriginal >= 21 && operacaoOriginal <=23) { //PESO
			if(operacaoOriginal == 21) { //Quilos
				if(operacaoConversao == 22) {
					resultado = valor * 2.205; // for Libras
				}else {
					resultado = valor * 35.274; //for onças
				}
			}
			
			if(operacaoOriginal == 22) { //Libras
				if(operacaoConversao == 21) {
					resultado = valor / 2.205; // for Kilos
				}else {
					resultado = valor * 16; //for onças
				}
			}
			
			if(operacaoOriginal == 23) { // Onças
				if(operacaoConversao == 21) {
					resultado = valor / 35.274; // for Kilos
				}else {
					resultado = valor * 0.0625; //for Libras
				}
			}
		}else if(operacaoOriginal >= 31 && operacaoOriginal <=33) { //Comprimento
			if(operacaoOriginal == 31) { //Metros
				if(operacaoConversao == 32) {
					resultado = valor * 3.281; // for Pés
				}else {
					resultado = valor * 39.37; //for Polegadas
				}
			}
			
			if(operacaoOriginal == 32) { //Pés
				if(operacaoConversao == 31) {
					resultado = valor / 3.281; // for Metros
				}else {
					resultado = valor * 12; //for Polegadas
				}
			}
			
			if(operacaoOriginal == 33) { //Polegadas
				if(operacaoConversao == 31) {
					resultado = valor / 39.37; // for Metros
				}else {
					resultado = valor / 12; //for pés
				}
			}
		}else if(operacaoOriginal >= 41 && operacaoOriginal <=43) { //VOLUME
			if(operacaoOriginal == 41) { //Litros
				if(operacaoConversao == 42) {
					resultado = valor / 3.785; // for Galão Líquido
				}else {
					resultado = valor * 33.814; //for Onça Líquidas
				}
			}
			
			if(operacaoOriginal == 42) { //Galão Líquido
				if(operacaoConversao == 41) {
					resultado = valor * 3.785; // for Litros
				}else {
					resultado = valor * 128; //for Onça Líquidas
				}
			}
			
			if(operacaoOriginal == 43) { //Onça Líquidas
				if(operacaoConversao == 41) {
					resultado = valor / 33.814; // for Litros
				}else {
					resultado = valor / 128; //for Galão Líquido
				}
			}
			
		}else {
			System.out.println("Opção invalida");
			resultado = 9999999;
		}
		
		System.out.println("Resultado: " + resultado);
		
	}
}
