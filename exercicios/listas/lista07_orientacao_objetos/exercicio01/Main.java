package lista07_orientacao_objetos.exercicio01;


public class Main {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		
		pessoa1.nome = "Caio Amaro";
		pessoa1.sexo = 'm';
		pessoa1.dataNascimento = "10/01/2000";
		pessoa1.estadoCivil = "Casado";
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.sexo);
		System.out.println(pessoa1.dataNascimento);
		System.out.println(pessoa1.estadoCivil);
		
		System.out.println();
		
		pessoa2.nome = "Brunna Ewelly";
		pessoa2.sexo = 'f';
		pessoa2.dataNascimento = "09/07/2000";
		pessoa2.estadoCivil = "Casado";
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.sexo);
		System.out.println(pessoa2.dataNascimento);
		System.out.println(pessoa2.estadoCivil);
		
		
	}
}
