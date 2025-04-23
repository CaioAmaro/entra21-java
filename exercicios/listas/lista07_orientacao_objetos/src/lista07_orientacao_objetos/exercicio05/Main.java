package lista07_orientacao_objetos.exercicio05;

/*
 * 5) Crie uma classe Empregado que terá como atributos:
	Identificação
	Nome
	Sobrenome
	Salário (mensal)

Crie métodos para:
Saber o salário anual do empregado
Saber o nome completo do empregado
Modificar o salário, o parâmetro do método deve ser o percentual de aumento
*/

public class Main {
	public static void main(String[] args) {
		Empregado empregado = new Empregado();
		
		empregado.nome = "Caio";
		empregado.sobrenome = "Amaro";
		empregado.salarioMensal = 1000;
		empregado.indentificacao = 340;
		
		System.out.println("Matricula: " + empregado.indentificacao);
		System.out.println("Nome Completo: " + empregado.obterNomeCompleto());
		System.out.println("Salario Mensal: R$ "+empregado.salarioMensal);
		System.out.println("Salario Anual: R$ "+empregado.calcularSalarioAnual());
		
		
		System.out.println("Salario Mensal: R$ "+empregado.salarioMensal);
		System.out.println(empregado.modificarSalarioMensal(0) + "\n");
		
		System.out.println("Salario Mensal: R$ "+empregado.salarioMensal);
		System.out.println(empregado.modificarSalarioMensal(100) + "\n");
		
		System.out.println("Salario Mensal: R$ "+empregado.salarioMensal);
		System.out.println(empregado.modificarSalarioMensal(-50) + "\n");
		
	}
}
