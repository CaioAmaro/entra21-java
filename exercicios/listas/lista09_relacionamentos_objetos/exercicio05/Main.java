package lista09_relacionamentos_objetos.exercicio05;

/*
* 5)
O objetivo deste exercício é implementar a relação entre uma pessoa e seu endereço.
Classe Pessoa:
Crie os atributos de nome e Endereco, em que Endereco é uma classe
*
Classe Endereco:
Crie três atributos privados: um do tipo String para o logradouro, outro do tipo String para o
complemento e um do tipo int para o número
Crie objetos de Pessoa
* */

public class Main {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua Saia Branca", "Portão B", 344);
        Pessoa p1 = new Pessoa("Nome", e1);

        System.out.println(p1);
    }
}
