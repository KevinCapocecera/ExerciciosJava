package Pratica_02.Encapsulamento;

import java.util.Objects;
import java.util.Scanner;

public class ContaBancaria {

    private double saldo = getSaldo();
    private String titular = "Kevin";

   public void depositar(double valor) {
       this.saldo += valor;
   }
   public void sacar(double valor){
       this.saldo -= valor;
   }
   public double getSaldo(){
       return this.saldo;
   }
   public String getTitular(){
       return this.titular;
   }
   public void setTitular(String nome){
       this.titular = nome;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o nome do titular da conta: ");
        conta.setTitular(sc.next());
        System.out.println("Qual operacao deseja fazer? \n 1- Depositar \n 2- Sacar\n 3- Visualizar saldo\n 4- Sair");
        String operacao = sc.next();

        while (!Objects.equals(operacao, "4")) {
            switch (operacao) {
                case "1":
                    System.out.println("Quanto deseja depositar? ");
                    conta.depositar(sc.nextInt());
                    System.out.println("Operacao sucedida");
                    break;
                 case "2":
                    System.out.println("Quanto deseja sacar? ");
                    conta.sacar(sc.nextInt());
                    System.out.println("Operacao sucedida");
                    break;
                case "3":
                    System.out.println(conta.getSaldo());
                    break;
                default : System.out.println("Operacao invalida");
            }
            System.out.println("Qual operacao deseja fazer? \n 1- Depositar \n 2- Sacar\n 3- Visualizar saldo\n 4- Sair");
            operacao =sc.next();
        }
    }
}
