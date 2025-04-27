package lista07_orientacao_objetos.exercicio09;

/*
*
* 9)
Deseja-se criar uma classe para controlar a velocidade do carro.
Implemente os métodos:
*
Acelerar: que deve somar a velocidade atual com a atual do carro (usar setVelocidade).
Desde que o valor do parâmetro seja maior ou igual a zero e menor que 20.
Senão, lance uma exceção
*
Reduzir: que deve reduzir a velocidade atual com a atual do carro (usar setVelocidade).
Desde que o valor do parâmetro seja maior ou igual a zero e menor que 30.
Senão, lance uma exceção
*
* */

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println("Aceleração carro atual: " + carro.velocidade + "km");
        carro.acelerar(10);
        System.out.println("Aceleração carro atual: " + carro.velocidade + "km");
        carro.acelerar(19);
        System.out.println("Aceleração carro atual: " + carro.velocidade + "km");
        carro.reduzir(20);
        System.out.println("Aceleração carro atual: " + carro.velocidade + "km");

    }
}
