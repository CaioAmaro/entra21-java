package lista08_arraylist.exercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Crie uma Array List e inverta ela
public class main {
    public static void main(String[] args) {
        List<Integer> listaInteger = new ArrayList<>();
        listaInteger.add(4);
        listaInteger.add(3);
        listaInteger.add(5);
        listaInteger.add(1);
        listaInteger.add(2);

        System.out.println("Lista Original");
        System.out.println(listaInteger);

        listaInteger.sort(Collections.reverseOrder());
        System.out.println("Lista Ordenada Decrescente");
        System.out.println(listaInteger);
    }
}
