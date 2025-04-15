package lista02_estrutura_selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		
		/** 
		*A jornada de trabalho semanal de um funcionário é de 40 horas. 
		*O funcionário que trabalhar mais de 40 horas receberá hora extra, 
		*cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
		*
		*Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
		*o valor por hora e 
		*escreva o salário total do funcionário, 
		*
		*que deverá ser acrescido das horas extras, 
		*
		*caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)  
		*/
		
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Digite R$/Hr -> ");
		double salarioHora = input.nextDouble();
		System.out.print("Digite Hr Trabalhadas -> ");
		double horasMensais = input.nextDouble();
		
		double horasExtras = horasMensais - (4*40);
		double salarioExtras = horasExtras * 0.5;
		
		double salarioMensal = (horasMensais * salarioHora) + salarioExtras;
		
		System.out.println("");
		
		System.out.println("-----------------------");
		System.out.println("Horas Normais: " + horasMensais);
		System.out.println("Horas Extras: "+df.format(horasExtras));
		System.out.println("-----------------------");
		System.out.println("R$ Extra : " + df.format(salarioExtras));
		System.out.println("R$: Mensal " + (salarioMensal-salarioExtras));
		System.out.println("R$ Total: " + salarioMensal);
		
		
		
	}
}
