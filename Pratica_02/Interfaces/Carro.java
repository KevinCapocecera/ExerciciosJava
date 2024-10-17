package Pratica_02.Interfaces;

public class Carro implements VeiculoInterface{

    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando");
    }
}
