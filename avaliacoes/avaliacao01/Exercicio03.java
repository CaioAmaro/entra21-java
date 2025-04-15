package avaliacoes.avaliacao01;

public class Exercicio03 {
  public static void main(String[] args) {

    /*
     * Crie um programa Java para encontrar a primeira sequência de números seguidos 
     * em um vetor.
     * 
       Por exemplo, o vetor {6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6} 
       tem a primeira sequência sendo {0, 1, 2}.

       Exiba essa sequência.Peça para o usuário inserir os valores em um vetor de 8 posições
     * 
     * */


    int vetor[] = {0, 1, 1, 2, 6, 2, 7, 0, 1, 2};

    int pointEnd = 0;
    int pointStart = 0;
    boolean firstSequencia = false;

    for(int i = 0; i < vetor.length; i++) {

      if (i == vetor.length - 1) break; // parar no último elemento.

      if(vetor[i+1] - vetor[i] == 1) {

        if(!firstSequencia) {
          pointStart = i;    
          firstSequencia = true;
        }

      }else if(firstSequencia) { // SÓ MARCA O END POINT SE ENCONTRAR ALGUMA SÊQUENCIA.
        pointEnd = i;  
        break; // QUEBRA O LOOP QUANDO NÃO TEM SEQUÊNCIA + JÁ TER ENCONTRANDO ALGUMA OUTRA SEQUÊNCIA.
      }

    }


    if(pointStart > pointEnd ) pointEnd = vetor.length-1; // Se houver sequência, mas o endPOINT nunca foi inicializado.


    for(int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }

    System.out.println("\n");

    for(int i = 0; i < vetor.length; i++) {

      if(pointStart == 0 && pointEnd == 0 ) {
        System.out.println("Sem sequências!");
        break;
      }

      if(i >= pointStart && i <= pointEnd) {

        System.out.print(vetor[i] + " ");
      }else {
        System.out.print("X ");
      }
    }

  }
} 