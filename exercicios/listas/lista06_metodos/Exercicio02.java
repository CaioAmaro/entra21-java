package lista6_metodos;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void venancio() {
		System.out.println("O nome dele é Venancio!");
		System.out.println("Ele tem 12 anos.");
		System.out.println("Ele é estudante do Entra21");
	}
	
	public static void renata() {
		System.out.println("O nome dela é renata!");
		System.out.println("Ela tem 17 anos.");
		System.out.println("Ela é estudante do Entra21");
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String nome = "";
		
		System.out.println("Escolha um nome.");
		System.out.print("R: ");
		nome = input.next();
		
		System.out.println();
		
		if(nome.equalsIgnoreCase("venancio")) {
			venancio();
		}else if(nome.equalsIgnoreCase("renata")) {
			renata();
		}else {
			System.out.println("Não metodo com este nome.");
		}
		
	}
}
