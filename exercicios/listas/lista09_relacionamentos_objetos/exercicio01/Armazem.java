package lista09_relacionamentos_objetos.exercicio01;

import java.util.List;

public class Armazem {
    private List<Retangulo> retangulos;

    public void setRetangulos(List<Retangulo> retangulos) {
        this.retangulos = retangulos;
    }

    public Retangulo obterMaiorPerimetro(){
        double maiorPerimetro = Double.MIN_VALUE;

        for(Retangulo retangulo: retangulos){
            if(retangulo.obterPerimetro() > maiorPerimetro){
                maiorPerimetro = retangulo.obterPerimetro();
                Retangulo retanguloResposta = new Retangulo(retangulo.getAltura(), retangulo.getLargura());
            }else{
                throw new IllegalArgumentException("Não conseguimos encontrar o maior Perimetro");
            }
        }
        return new Retangulo(0,0);
    }

    public double obterMaiorArea(){
        double maiorArea = Double.MIN_VALUE;

        for(Retangulo retangulo: retangulos){
            if(retangulo.obterArea() > maiorArea){
                maiorArea = retangulo.obterArea();
            }
        }

        return maiorArea;
    }
}
