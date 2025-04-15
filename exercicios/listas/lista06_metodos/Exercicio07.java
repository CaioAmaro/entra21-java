package lista06_metodos;

import java.util.Scanner;

/*
 * 7) George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas
	histórias (Jar Jar Binks, ObiWan Kenobi, etc).

	A fórmula, supostamente, é:
	Seu primeiro nome na série Star Wars:
	i.Pegue as três primeiras letras de seu sobrenome
	ii.Adicione a ele as duas primeiras letras de seu nome
	
	Seu sobrenome na série Star Wars:
	i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
	ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
	
	Crie um método chamado generateStarWarsName que gera um nome completo Star
	Wars conforme descrito.
	Imprima o seu nome Star Wars
	As entradas serão os nomes completos.
	Para separar, por exemplo as três primeiras letras do seu sobrenome, use o atributo .charAt() das Strings
 */

public class Exercicio07 {
	
	public static void generateStarWarsName(String nome, String sobrenome, String sobrenomeMae, String cidadeNatal) {
		
		String nomeStarWars = "";
		String SobrenomeStarWars = "";
		
		for(int i=0; i < 3; i++) {
			nomeStarWars += sobrenome.charAt(i);
		}
		
		for(int i=0; i < 2; i++) {
			nomeStarWars += nome.charAt(i);
		}
		
		for(int i=0; i < 2; i++) {
			SobrenomeStarWars += sobrenomeMae.charAt(i);
		}
		
		for(int i=0; i < 3; i++) {
			SobrenomeStarWars += cidadeNatal.charAt(i);
		}
		
		System.out.println("Seu nome em Star Wars é " + nomeStarWars + " " + SobrenomeStarWars);
		
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String nome = "Caio Italo";
		String sobrenomeMae = "Lima";
		String sobrenome = "Amaro";
		String cidadeNatal = "Manaus";
		
		generateStarWarsName(nome, sobrenome, sobrenomeMae, cidadeNatal);
		
		
		
	}

}
