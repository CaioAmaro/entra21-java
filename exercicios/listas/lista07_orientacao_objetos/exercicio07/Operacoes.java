package lista07_orientacao_objetos.exercicio07;

public class Operacoes {

    public static AeronaveResultado obterMaiorPassageiro(Aeronave[] vetor){
        AeronaveResultado resultado = new AeronaveResultado();

        int maiorQtdPassageiro = Integer.MIN_VALUE;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i].passageiros > maiorQtdPassageiro){
                maiorQtdPassageiro = vetor[i].passageiros;
                resultado.aeronave = vetor[i];
            }
        }

        return resultado;
    }

    public static AeronaveResultado obterMaiorTempoNoAr(Aeronave[] vetor){
        AeronaveResultado resultado = new AeronaveResultado();

        double maiorAutonomiaMinutos = Double.MIN_VALUE;

        for(int i = 0; i < vetor.length; i++){
            double autonomiaVooMinutos = vetor[i].capacidadeCombustivel / vetor[i].queimaCombustivelMinutos;

            if(autonomiaVooMinutos > maiorAutonomiaMinutos){
                maiorAutonomiaMinutos = autonomiaVooMinutos;
                resultado.aeronave = vetor[i];
                resultado.autonomiaVooMinutos = maiorAutonomiaMinutos;
            }
        }

        return resultado;
    }

    public static AeronaveResultado obterMaiorDistancia(Aeronave[] vetor){
        AeronaveResultado resultado = new AeronaveResultado();

        double maiorDistanciaKm = Double.MIN_VALUE;

        for(int i = 0; i < vetor.length; i++){

            double autonomiaVooHoras = (vetor[i].capacidadeCombustivel/vetor[i].queimaCombustivelMinutos) / 60;
            double distanciaKm = autonomiaVooHoras * vetor[i].velocidadeMax;

            if(distanciaKm > maiorDistanciaKm){
                maiorDistanciaKm = distanciaKm;

                resultado.aeronave = vetor[i];
                resultado.distanciaKm = distanciaKm;
            }
        }

        return resultado;
    }

}
