package lista01_introducao;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite A: ");
		double valorA = input.nextDouble();
		
		System.out.print("Digite B: ");
		double valorB = input.nextDouble();
		
		System.out.print("Digite C: ");
		double valorC = input.nextDouble();
		
		System.out.println("");
		
		double areaTriangulo = (valorA * valorC) / 2;
		
		final double PI = 3.14;
		double areaCirculo = PI * Math.pow(valorC, 2);
		
		double areaTrapezio = ((valorA + valorB) * valorC) / 2;
		
		double areaQuadrado = Math.pow(valorB, 2);
		
		double areaRetangulo = valorA * valorB;
		
		System.out.println("A) Área Tringulo: " + areaTriangulo);
		System.out.println("B) Área Círculo: " + areaCirculo);
		System.out.println("C) Área Trapézio: " + areaTrapezio);
		System.out.println("D) Área quadrado: "+ areaQuadrado);
		System.out.println("E) Área retângulo "+ areaRetangulo);
		
	}
}
