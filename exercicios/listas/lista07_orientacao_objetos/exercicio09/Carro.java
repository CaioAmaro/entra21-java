package lista07_orientacao_objetos.exercicio09;

public class Carro {
    int velocidade = 0;

    public void setVelocidade(int velocidade) {
        this.velocidade += velocidade;
    }

    public void acelerar(int aceleracao){
        if(aceleracao >= 0 && aceleracao < 20) setVelocidade(aceleracao);
        else System.out.println("Aceleração invalida! Velocidade de Aceleração permitida (0km/h - 19km/h)");
    }

    public void reduzir(int reducao){
        if(reducao >= 0 && reducao < 30) setVelocidade(-reducao);
        else System.out.println("Redução invalida! Velocidade de redução permitida (0km/h - 30km/h)");
    }
}
