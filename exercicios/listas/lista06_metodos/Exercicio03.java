package lista06_metodos;

/*
 * 3) Faça um programa que exiba o número que o usuário entrou como parâmetro e 
 * os 20 números que vem após esse número (O parâmetro do método deve ser o número inserido pelo usuário)
 * */

public class Exercicio03 {
	
	public static void mostrarNumeroApos(int numero, int qtdNumeroApos) {
	
		System.out.println("Número que foi passado no parametro: " + numero);
		
		System.out.println("");
		System.out.println(qtdNumeroApos + " números Após ele é: ");
		for(int i = (numero + 1); i <= (numero + qtdNumeroApos); i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		mostrarNumeroApos(10, 20);
		
		
	}

}
