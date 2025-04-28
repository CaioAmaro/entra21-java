package lista07_orientacao_objetos.exercicio09;

public class Carro {
    int velocidade = 0;

    public void setVelocidade(int velocidade) {
        this.velocidade += velocidade;
    }

    public void acelerar(int aceleracao){

        try{
            if(aceleracao >= 0 && aceleracao < 20) setVelocidade(aceleracao);
            else throw new IllegalArgumentException("Aceleração invalida! Velocidade de Aceleração permitida (0km/h - 19km/h)");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    public void reduzir(int reducao){
        if(reducao >= 0 && reducao < 30) setVelocidade(-reducao);
        else throw new IllegalArgumentException("Aceleração invalida! Velocidade de Aceleração permitida (0km/h - 30km/h)");
    }
}
