package lista09_relacionamentos_objetos.exercicio04;

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void sacar(double dinheiro){

        if(dinheiro <= 0){
            throw new IllegalArgumentException("Operação não realizada!");
        }

        if(dinheiro > this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente! Seu saldo atual é de R$" + this.saldo);
        }

        saldo -= dinheiro;
    }

    public void depositar(double dinheiro){
        if(dinheiro <= 0){
            throw new IllegalArgumentException("Operação não realizada!");
        }
        saldo += dinheiro;
    }

    public void transferir(double dinheiro, Conta conta){
        this.sacar(dinheiro);
        conta.depositar(dinheiro);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
