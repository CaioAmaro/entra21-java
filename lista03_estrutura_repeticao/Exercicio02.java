package lista03_estrutura_repeticao;

public class Exercicio02 {
	public static void main(String[] args) {
		
	int somaPares = 0;
	int somaImpares = 0;
	
	for(int i=1; i<=100; i++) {
		
		if(i % 2 == 0) {
			somaPares += i;
		}else {
			somaImpares += i;
		}
		
	}
	
	
	System.out.println("Soma pares: "+ somaPares);
	System.out.println("Soma impares: "+ somaImpares);
		
	}
}
