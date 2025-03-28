package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite o Peso em KG: ");
		double peso = input.nextDouble();
		System.out.print("Digite a Altura em Metros: ");
		double altura = input.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println("");
		
		System.out.println("Imc: " + imc);
		
		if(imc < 18.5) {
			System.out.println("< 18.5 Magreza");
		}else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("18.5 – 24.9 Saudável");
		}else if(imc >= 25 && imc <= 29.9) {
			System.out.println("25.0 – 29.9 Sobrepeso");
		}else if (imc >= 30 && imc <= 34.9) {
			System.out.println("30.0 – 34.9 Obesidade Grau I");
		}else if (imc >= 35 && imc <= 39.9) {
			System.out.println("35.0 – 39.9 Obesidade Grau II (severa)");
		}else {
			System.out.println("> 40.0 Obesidade Grau III (morbida)");
		}
		
		
		
		
	}

}
