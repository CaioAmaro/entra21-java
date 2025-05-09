package lista09_relacionamentos_objetos.exercicio04;

/*
4)
Faça uma classe chamada Conta, com os atributos: nome do titular e saldo.

Faça métodos para:
Sacar dinheiro: o método deve receber a quantidade a ser sacada como parâmetro
Depositar dinheiro: o método deve receber a quantidade a ser depositada como parâmetro
Transferir dinheiro de uma conta para outra: o método deve receber como parâmetro o objeto
que receberá a transferência e a quantidade a ser transferida
 */

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Caio Amaro", 50);
        Conta c2 = new Conta("Brunna Ewelly", 100);

        c1.sacar(20);
        c2.depositar(100);
        c2.transferir(59,c2);
        System.out.println(c1 + "\n" + c2);

    }
}
