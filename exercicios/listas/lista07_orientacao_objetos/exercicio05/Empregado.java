package lista07_orientacao_objetos.exercicio05;

public class Empregado {
	public  int indentificacao;
	public String nome;
	public String sobrenome;
	public double salarioMensal;

	public double calcularSalarioAnual() {
		return salarioMensal * 12;
	}

	public String obterNomeCompleto() {
		return nome + " " + sobrenome;
	}

	public String modificarSalarioMensal(double percentual) {
		
		percentual = percentual/100;
		
		if(percentual == 0) return "Alteração não realizada, percentual precisa ser diferente de 0";
		
		if(percentual < 0) {
			System.out.println("Valor Referente: -R$ " + -1 * (percentual * salarioMensal) );
			salarioMensal += percentual * salarioMensal;
			return "Modificação Realizada salario mensal foi diminuido para " + salarioMensal;
		}
		
		if(percentual > 0) {
			System.out.println("Valor Referente: R$ " + percentual * salarioMensal );
			salarioMensal += percentual * salarioMensal;
			return "Modificação Realizada salario mensal foi aumentado para " + salarioMensal;
		}
		
		return "";
		
	}
}
