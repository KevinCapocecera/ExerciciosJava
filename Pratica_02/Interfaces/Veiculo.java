package Pratica_02.Interfaces;

public class Veiculo {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.acelerar();
        bicicleta.frear();

        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();
    }
}
