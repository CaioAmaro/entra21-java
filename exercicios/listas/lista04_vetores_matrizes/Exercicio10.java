package lista04_vetores_matrizes;

public class Exercicio10 {
	public static void main(String[] args) {
		
		String respostaHomem[] = {"NÃO", "SIM", "NÃO", "IND", "SIM"};
		String respostaMulher[] = {"NÃO", "SIM", "NÃO", "IND", "SIM"};
		int pontos = 0;
		
		
		for(int i = 0; i <5; i++) {
			if(respostaHomem[i].equals(respostaMulher[i])) {
				pontos +=3;
			}else if(respostaHomem[i].equals("IND") || respostaMulher[i].equals("IND")){
				pontos +=2;
			}else {
				pontos -=2;
			}
		}
		
		
		System.out.println("Pontuação: " + pontos);
		
		if(pontos == 15 ) {
			System.out.println("Casem!");
		}else if(pontos <= 14 && pontos >= 10) {
			System.out.println("Vocês têm muita coisa em comum!");
		}else if(pontos <= 9 && pontos >= 5 ) {
			System.out.println("Melhor não perder tempo.");
		}else if(pontos <= -1 && pontos >= -9) {
			System.out.println("Melhor não perder tempo.");
		}else if(pontos <= 10) {
			System.out.println("Vocês se odeiam!");
		}else {
			System.out.println("Erro!");
		}
		
	}
}
