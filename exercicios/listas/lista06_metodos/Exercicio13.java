package lista06_metodos;

import java.util.Scanner;

/*
 * 13) Faça um método que calcule o perímetro e outro que calcule a área de um retângulo
	passando a altura e largura como parâmetros
	Retornar os valores calculados
 * */

public class Exercicio13 {
	
	public static double area(double altura, double largura) {
		return altura*largura;
	}
	
	public static double perimetro(double altura, double largura) {
		return 2*(altura+largura);
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Altura: ");
		double altura = input.nextDouble();
		System.out.print("Largura: ");
		double largura = input.nextDouble();
		
		System.out.println(area(altura,largura));
		System.out.println(perimetro(altura,largura));
	}
}
