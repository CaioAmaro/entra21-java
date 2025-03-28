import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite comprimentro da base em cm: ");
		double base = input.nextDouble();
		
		System.out.print("Digite comprimentro da altura em cm: ");
		double altura = input.nextDouble();
		
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		
		System.out.println("");
		
		System.out.println("(Retângulo)");
		System.out.println("--------------------------");
		System.out.println("Base: " + base + "cm");
		System.out.println("Altura: " + altura + "cm");
		System.out.println("--------------------------");
		System.out.println("Área: " + area + "cm");
		System.out.println("Perimetro: " + perimetro + "cm");
		
		
	}
}

