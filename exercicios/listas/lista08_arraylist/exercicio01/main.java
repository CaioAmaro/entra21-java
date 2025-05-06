package lista08_arraylist.exercicio01;

//Coloque 5 elementos em uma Array List e ordene-os

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

        listaInteger.sort(null);
        System.out.println("Lista Ordenada");
        System.out.println(listaInteger);

    }
}
