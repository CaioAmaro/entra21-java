package lista07_orientacao_objetos.exercicio07;

/*
* Faça uma classe chamada Aeronave.
Com os atributos:
• Modelo
• Passageiros
• Velocidade máxima
• Capacidade de combustível
• Queima de combustível por minuto
*
Crie 4 objetos de sua preferência.
*
Calcule:
a) Qual aeronave leva o maior número de passageiros?
b) Qual das aeronaves pode ficar no ar por mais tempo?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais
longe?
*
* */

public class Main {
    public static void main(String[] args) {

        Aeronave aeronave1 = new Aeronave("Gol", 203, 850, 23000, 40);
        Aeronave aeronave2 = new Aeronave("Latam", 350, 830, 25000, 38);
        Aeronave aeronave3 = new Aeronave("Azul", 285, 810, 22000, 42);
        Aeronave aeronave4 = new Aeronave("Avianca", 450, 840, 24000, 39);

        Aeronave[] vetor = {aeronave1, aeronave2, aeronave3, aeronave4};

        System.out.println("Aeronave que tem maior quantidade de passageiros é " + Operacoes.obterMaiorPassageiro(vetor).aeronave.modelo);

        AeronaveResultado resultado = Operacoes.obterMaiorTempoNoAr(vetor);
        System.out.println("Aeronave " + resultado.aeronave.modelo + " é que fica mais tempo no ar com " + (int) resultado.autonomiaVooMinutos + " minutos");

        resultado = Operacoes.obterMaiorDistancia(vetor);
        System.out.println("Aernova " + resultado.aeronave.modelo + " Consegue percorrer a maior distância que é " + (int) resultado.distanciaKm + "Km");



    }
}
