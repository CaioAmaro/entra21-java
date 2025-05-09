package lista09_relacionamentos_objetos.exercicio05;

public class Endereco {
    private String logradouro;
    private String complemento;
    private int numero;

    public Endereco(String logradouro, String complemento, int numero){
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", numero=" + numero +
                '}';
    }
}
