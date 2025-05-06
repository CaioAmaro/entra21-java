package lista09_relacionamentos_objetos.exercicio01;

/*
1)
Faça uma classe chamada Retangulo, com os atributos altura e largura.
Faça um método para descobrir a área e outro para descobrir o perímetro.
Crie 5 objetos de Retangulo.
Crie uma lista em outra classe para armazenar todos os objetos de Retangulo
Faça um método que encontre o Retangulo com a maior área e outro que encontre o Retangulo
com o maior perímetro
Imprima o toString desses Retangulos
 */

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Retangulo> retangulos = new ArrayList<>();
        Armazem armazem = new Armazem();

        retangulos.add(new Retangulo(2, 4));
        retangulos.add(new Retangulo(2, 5));
        retangulos.add(new Retangulo(2, 4));
        retangulos.add(new Retangulo(6, 3));
        retangulos.add(new Retangulo(2, 4));

        armazem.setRetangulos(retangulos);





    }
}
