package lista09_relacionamentos_objetos.exercicio02;

/*
2)
Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, o nome do cliente
que comprou a flor e um boolean que determina se a flor é para presente ou não
Descubra:

a) Qual a flor mais cara?
b) Se a loja teve uma receita maior vendendo flores para presente ou não
 */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Floricultura floricultura = new Floricultura();
        Flor flor1 = new Flor("Rosa", 2.5, "Ana Beatriz", true);
        Flor flor2 = new Flor("Tulipa", 4.1, "Carlos Eduardo", false);
        Flor flor3 = new Flor("Orquídea", 3.3, "Mariana Silva", false);
        Flor flor4 = new Flor("Girassol", 5.0, "João Pedro", true);
        Flor flor5 = new Flor("Lírio", 2.8, "Fernanda Costa", false);

        List<Flor> flores  = new ArrayList<>();
        flores.add(flor1);
        flores.add(flor2);
        flores.add(flor3);
        flores.add(flor4);
        flores.add(flor5);

        floricultura.setFlores(flores);
        System.out.println("Flor mais cara: " + floricultura.obterFlorMaisCara().getNome());
        System.out.println(floricultura.mostrarDadosReceita());

    }
}
