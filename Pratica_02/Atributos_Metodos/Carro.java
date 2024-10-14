package Pratica_02.Atributos_Metodos;


import java.util.Scanner;

public class Carro {

    private static String marca;
    private static String modelo;
    private static Integer ano;

    private static void Acelerar(){
        System.out.println("Aceleeeeera Doido");
    }
    private static void Freiar(){
        System.out.println("Freeeeeia FDP");
    }
    private static void exibirDados(){
        System.out.println("Sua carroça é um " + marca + " " + modelo + " " + ano);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca do seu carro: ");
        marca = scanner.next();
        System.out.println("Digite o Modelo do seu carro: ");
        modelo = scanner.next();
        System.out.println("Digite o Ano do seu carro: ");
        ano = scanner.nextInt();
        System.out.println("Digite a Ação(Acelerar, Freiar ou Exibir Dados): ");
        String acao = scanner.next();


        if (acao.equals("Acelerar")){
            Acelerar();
            System.out.println("Digite a Ação(Acelerar, Freiar ou Dados): ");
            acao = scanner.next();

        }else if (acao.equals("Freiar")){
            Freiar();
            System.out.println("Digite a Ação(Acelerar, Freiar ou Dados): ");
            acao = scanner.next();

        }else if(acao.equals("Dados")){
            exibirDados();
            System.out.println("Digite a Ação(Acelerar, Freiar ou Dados): ");
            acao = scanner.next();

        }else {
            System.out.println("Ação Invalida");
        }

    }
}
