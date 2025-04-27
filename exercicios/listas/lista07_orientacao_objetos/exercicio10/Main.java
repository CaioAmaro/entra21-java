package lista07_orientacao_objetos.exercicio10;

/*
* 10)
Faça uma classe chamada OnibusEscolar, com os atributos quantidade de estudantes e
quantidade de professores
*
Faça uma exceção no método setAlunos que limite o número máximo de estudantes a 40. Se
um valor superior for informado, ajuste automaticamente para 40.
*
Caso o número de professores for 0, o número de alunos também deve ser zerado
Faça também um método chamado remover alunos, que deverá remover os alunos de acordo
com o valor passado como parâmetro
*
* */

public class Main {
    public static void main(String[] args) {

        OnibusEscolar onibusEscolar = new OnibusEscolar();

        onibusEscolar.setQuantidadeProfessores(1);
        onibusEscolar.setQuantidadeAlunos(5);
        System.out.println("Quantidade de alunos: "+ onibusEscolar.quantidadeAlunos);
        System.out.println("Quantidade de professores: "+ onibusEscolar.quantidadeProfessores);
        onibusEscolar.setQuantidadeProfessores(2);
        System.out.println("Quantidade de alunos: "+ onibusEscolar.quantidadeAlunos);
        System.out.println("Quantidade de professores: "+ onibusEscolar.quantidadeProfessores);
        onibusEscolar.removerAlunos(4);
        System.out.println("Quantidade de alunos: "+ onibusEscolar.quantidadeAlunos);
        System.out.println("Quantidade de professores: "+ onibusEscolar.quantidadeProfessores);

    }
}
