package lista09_relacionamentos_objetos.exercicio01;

import java.util.List;

public class Armazem {
    private List<Retangulo> retangulos;

    public void setRetangulos(List<Retangulo> retangulos) {
        this.retangulos = retangulos;
    }

    public Retangulo obterMaiorPerimetro(){
        double maiorPerimetro = Double.MIN_VALUE;
        Retangulo retanguloResposta = null;

        for(Retangulo retangulo: retangulos) {
            if (retangulo.obterPerimetro() > maiorPerimetro) {
                maiorPerimetro = retangulo.obterPerimetro();
                retanguloResposta = retangulo;
            }
        }

        if(retanguloResposta == null){
            throw new IllegalArgumentException("Não foi possivel obter maior perimetro");
        }

        return retanguloResposta;
    }

    public Retangulo obterMaiorArea(){
        double maiorArea = Double.MIN_VALUE;
        Retangulo retanguloResposta = null;

        for(Retangulo retangulo: retangulos) {
            if (retangulo.obterPerimetro() > maiorArea) {
                maiorArea = retangulo.obterArea();
                retanguloResposta = retangulo;
            }
        }

        if(retanguloResposta == null){
            throw new IllegalArgumentException("Não foi possivel obter maior perimetro");
        }

        return retanguloResposta;
    }
}
