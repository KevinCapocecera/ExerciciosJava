package Pratica_01.Desisao;

import java.util.Scanner;

public class Decisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma idade: ");

        int idade = scanner.nextInt();
        while (idade < 0 || idade > 120){
            System.out.println("Voce é burro? Digite novamente:");
            idade = scanner.nextInt();
        }

        if (idade < 18){
            System.out.println("Voce é menor de idade");
        } else if (idade >= 18 && idade <= 60){
            System.out.println("Voce é adulto");
        } else {
            System.out.println("O museu ta com vaga aberta pra voce");
        }

    }
}
