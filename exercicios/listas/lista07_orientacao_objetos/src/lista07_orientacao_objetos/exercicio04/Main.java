package lista07_orientacao_objetos.exercicio04;

/*
 * 4) Crie uma classe chamada Circulo que tenha o atributo raio
Calcule a área de 5 objetos diferentes de Circulo
Para obter o valor de PI, use a função Math.PI do Java
*/

public class Main {
	public static void main(String[] args) {
		
		Circulo obj1 = new Circulo();
		Circulo obj2 = new Circulo();
		Circulo obj3 = new Circulo();
		Circulo obj4 = new Circulo();
		Circulo obj5 = new Circulo();
		
		obj1.raio = 3;
		obj2.raio = 8;
		obj3.raio = 3;
		obj4.raio = 5;
		obj5.raio = 2;
		
		
		System.out.println("Raio do circulo 1 -> "+obj1.obterRaio());
		System.out.println("Raio do circulo 2 -> "+obj2.obterRaio());
		System.out.println("Raio do circulo 3 -> "+obj3.obterRaio());
		System.out.println("Raio do circulo 4 -> "+obj4.obterRaio());
		System.out.println("Raio do circulo 5 -> "+obj5.obterRaio());
		
	}
}
