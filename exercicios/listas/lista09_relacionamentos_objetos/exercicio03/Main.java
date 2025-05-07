package lista09_relacionamentos_objetos.exercicio03;

/*
3)
Crie um sistema para uma loja de materiais de construção
Os objetos terão os atributos:

Nome, descrição, preço, volume (tamanho), peso e quantidade em estoque

Crie métodos para:
Adicionar mais unidades da peça ao estoque
Vender um produto, podendo ser vendido até o mesmo número de peças que tem no estoque
Colocar o produto em promoção, o parâmetro do método deve ser a porcentagem do desconto

Descubra:
a) Qual o material mais caro
b) Qual o material mais caro por metro cúbico
c) Qual o material mais denso
d) Qual o material que mais ocupa espaço no estoque
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MateriaisContrucao materiaisContrucao = new MateriaisContrucao();
        Material m1 = new Material("Martelo", "cabo de aço 30 polegadas", 30.00, 3.4, 13.6, 50);
        Material m2 = new Material("Chave de Fenda", "haste cromada 20 cm", 15.50, 1.2, 5.0, 100);
        Material m3 = new Material("Alicate", "isolado 1000V", 22.90, 2.0, 7.3, 75);
        Material m4 = new Material("Serrote", "lâmina de aço carbono 18", 45.00, 5.1, 20.0, 30);
        Material m5 = new Material("Trena", "fibra de vidro 5 metros", 12.75, 0.5, 2.2, 200);

        List<Material> materiais = new ArrayList<>();
        Collections.addAll(materiais,
                m1,
                m2,
                m3,
                m4,
                m5);

        materiaisContrucao.setMateriais(materiais);
        System.out.println(materiaisContrucao.mostarMaterialMaisCaro());
        System.out.println(materiaisContrucao.mostrarMaiorPrecoCubido());
        System.out.println(materiaisContrucao.mostrarMaiorDensidade());
        System.out.println(materiaisContrucao.mostrarMaiorEspacoOcupado());

    }
}
