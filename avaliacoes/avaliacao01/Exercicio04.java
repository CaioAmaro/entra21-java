package avaliacoes.avaliacao01;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double matriz[][] = {
				{22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5,24.1, 24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8},
				{21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6,29.2, 29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0},
				{20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9,26.2, 26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8},
				{20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2},
				{19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5},
				{19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9, 29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7},
				{19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9, 25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7}
				};
		
		String dia = "";
		int ponteiroDia = 0;
		int ponteiroHoras = 0;
		double somaTemperaturasDia = 0;
		double temperaturaMediaDiaria =0;
		double somaTemperaturasHoras = 0;
		double temperaturaMediaHoras =0;
		
		System.out.println("Digite alguma dia da semana para Verificação de temperatura média diaria");
		System.out.print("R: ");
		dia = input.next();
		
		while(!(dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quinta") || dia.equalsIgnoreCase("sexta") || dia.equalsIgnoreCase("sabado"))) {
			System.out.println();
			System.out.println("Você digitou o dia da semana errado!");
			System.out.println("Tente novamente!");
			System.out.print("R: ");
			dia = input.next();
		}
		
		if(dia.equalsIgnoreCase("domingo")) {
			ponteiroDia = 0;
		}else if(dia.equalsIgnoreCase("segunda")) {
			ponteiroDia = 1;
		}else if(dia.equalsIgnoreCase("terca")) {
			ponteiroDia = 2;
		}else if(dia.equalsIgnoreCase("quarta")) {
			ponteiroDia = 3;
		}else if(dia.equalsIgnoreCase("quinta")) {
			ponteiroDia = 4;
		}else if(dia.equalsIgnoreCase("sexta")) {
			ponteiroDia = 5;
		}else if(dia.equalsIgnoreCase("sabado")) {
			ponteiroDia = 6;
		}
		

		for(int i = 0; i < matriz[ponteiroDia].length; i ++) {
			somaTemperaturasDia += matriz[ponteiroDia][i];
		}
		
		
		temperaturaMediaDiaria = somaTemperaturasDia / 24;
		
		System.out.println("");
		System.out.println("Temperatura média de "+ dia + " é " + temperaturaMediaDiaria +"°");
		

		System.out.println();
		System.out.println("Digite qual média de horas você deseja pesquisar");
		System.out.print("R: ");
		ponteiroHoras = input.nextInt();
		
		while(ponteiroHoras <= 0 || ponteiroHoras > 24) {
			System.out.println();
			System.out.println("Você digitou a hora errada!");
			System.out.println("Tente novamente!");
			System.out.print("R: ");
			ponteiroHoras = input.nextInt();
		}
		
		for(int i = 0; i < matriz.length; i++) {
			
			somaTemperaturasHoras += matriz[i][ponteiroHoras-1];
		}
		
		
		temperaturaMediaHoras = somaTemperaturasHoras/7;
		
		System.out.println("");
		System.out.println("Temperatura média de "+ ponteiroHoras + " é " + temperaturaMediaHoras +"°");
		System.out.println();
		
		
		
		double maiorTemperatura = Double.MIN_VALUE;
		double menorTemperatura = Double.MAX_VALUE;
		double amplitudeTermica = Double.MIN_VALUE;
		int diaMaiorAmplitude = 0;
		double maiorTemperaturaSave = 0;
		double menorTemperaturaSave = 0;
		
		
		
		for(int i = 0; i < matriz.length; i ++) {
			
			for(int j =0; j < matriz[i].length; j++) {
				
				if(matriz[i][j] > maiorTemperatura) {
					maiorTemperatura = matriz[i][j];
				}
				
				if(matriz[i][j] < menorTemperatura) {
					menorTemperatura = matriz[i][j];
				}
				
			}
			
			if((maiorTemperatura - menorTemperatura) > amplitudeTermica) {
				amplitudeTermica = maiorTemperatura - menorTemperatura;
				
				maiorTemperaturaSave = maiorTemperatura;
				menorTemperaturaSave = menorTemperatura;
				
				diaMaiorAmplitude = i;
			}
			
			maiorTemperatura = Double.MIN_VALUE;
			menorTemperatura = Double.MAX_VALUE;
			
			
		}
		
		String diaMaiorAmplitudeString = "";
		
		if(diaMaiorAmplitude == 0 ) {
			diaMaiorAmplitudeString = "Domingo";
		}else if(diaMaiorAmplitude == 1 ) {
			diaMaiorAmplitudeString = "segunda";
		}else if(diaMaiorAmplitude == 2 ) {
			diaMaiorAmplitudeString = "terca";
		}else if(diaMaiorAmplitude == 3 ) {
			diaMaiorAmplitudeString = "quarta";
		}else if(diaMaiorAmplitude == 4 ) {
			diaMaiorAmplitudeString = "quinta";
		}else if(diaMaiorAmplitude == 5 ) {
			diaMaiorAmplitudeString = "sexta";
		}else if(diaMaiorAmplitude == 6 ) {
			diaMaiorAmplitudeString = "sabado";
		}
		
		
		System.out.println("O dia que teve maior amplitude Termica foi " + diaMaiorAmplitudeString + " com Max " + maiorTemperaturaSave + "° Min " + menorTemperaturaSave + "°");
		System.out.println("Amplitude Termica: " + amplitudeTermica);
		
		
		
		
		
		
	}
}
