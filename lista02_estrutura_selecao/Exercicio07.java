package lista02_estrutura_selecao;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("X = ");
		double x = input.nextDouble();
		System.out.print("Y = ");
		double y = input.nextDouble();
		
		System.out.println("");
		
		
		String quadrante = "";
		
		if(x > 0 && y > 0) {
			quadrante = "1°";
		}else if(x < 0 && y > 0) {
			quadrante = "2°";
		}else if(x < 0 && y < 0) {
			quadrante = "3°";
		}else if(x > 0 && y < 0) {
			quadrante = "4°";
		}
		
		
		System.out.println("X("+x+") Y("+y+")");
		System.out.println("Quadrante: " + quadrante);
		
	}
}
