package lista07_orientacao_objetos.exercicio11;

/*
* 11)
Você foi contratado para desenvolver uma funcionalidade de controle de empréstimo de livros.
Para isso, você deverá criar uma classe Livro que implemente as regras de empréstimo e
devolução, lançando exceções para tratar casos inválidos.
* 
* Crie a classe Livro com os seguintes
atributos e métodos:
*
Atributos:
Título do livro
Emprestado (boolean)
*
Métodos:
Emprestar: Marque o livro como emprestado. Caso o livro já esteja emprestado, deve lançar uma exceção
Devolver: Marque o livro como disponível. Caso o livro não esteja emprestado, deve lançar uma exceção
Personalize o toString para mostrar se o livro está disponível ou não
*
* */

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry potter", false);

        System.out.println(livro.toString());
        livro.emprestar();
        System.out.println(livro.toString());
        livro.devolver();
        System.out.println(livro.toString());

    }
}
