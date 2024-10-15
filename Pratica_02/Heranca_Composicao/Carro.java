package Pratica_02.Heranca_Composicao;


public class Carro {

    public static String marca;
    public static String modelo;
    public static Integer ano;
    public static Motor motor;

        public Carro(String marca, String modelo, Integer ano, Motor motor) {

    }

    public Carro() {
        Carro.marca = marca;
        Carro.modelo = modelo;
        Carro.ano = ano;
        Carro.motor = motor;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
    }
}
