package lista08_arraylist.exercicio03;

/*
Crie uma Array List
O usuário vai colocando valores decimais até ele colocar o número 0.
Calcular:
a) Qual o menor número
b) Qual o maior número
c) Calcular a média
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Double> listaDouble = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        double valor = -1;
        double maxValor = Double.MIN_VALUE;
        double minValor = Double.MAX_VALUE;
        double somaTotal = 0;

        while(valor != 0) {

            System.out.print("Digite um valor: ");
            valor = input.nextDouble();

            if(valor != 0){
                listaDouble.add(valor);
            }else{
                System.out.println("\n Saindo...\n");
            }

        }

        for(Double numero: listaDouble){
            if(numero > maxValor){
                maxValor = numero;
            }
            if(numero < minValor){
                minValor = numero;
            }
            somaTotal += numero;
        }


        System.out.println("Maior valor: " + maxValor);
        System.out.println("Menor valor: " + minValor);
        System.out.println("Média valor: " + somaTotal/listaDouble.size());


    }
}
