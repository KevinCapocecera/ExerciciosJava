package Pratica_02.Interfaces;

public class Bicicleta implements VeiculoInterface{

    @Override
    public void acelerar() {
        System.out.println("A bicicleta esta acelerando");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta esta freando");
    }
}
