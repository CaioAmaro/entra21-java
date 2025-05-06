package lista08_arraylist.exercicio04;

/*
4)
Faça um algoritmo que descubra se uma Array List possui o número que o usuário entrou.
Imprima também o seu índice
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Integer> listaNumero = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 50; i++){
            listaNumero.add((i+1));
        }

        System.out.println("Lista de números: ");
        System.out.println(listaNumero);


        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if(listaNumero.contains(numero)){
            System.out.println("Número foi encontrado na posição ["+listaNumero.indexOf(numero)+"]");
        }else{
            System.out.println("Número não foi encontrado!");
        }

    }
}
