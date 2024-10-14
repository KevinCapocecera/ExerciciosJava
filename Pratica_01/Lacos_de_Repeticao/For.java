package Pratica_01.Lacos_de_Repeticao;

import java.util.List;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {


        List<Integer> novosNumeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a tabuada que deseja: ");
            int tabuada = scanner.nextInt();
            for (Integer i : novosNumeros) {
                int x = i * tabuada;
                System.out.println(i + " * " + tabuada + " = " + x);
            }


        /*novosNumeros.forEach(n -> {
            Integer x = n + j;
            System.out.println("x = " + x);
        }
        );
        maneira JavaScript pra fazer for

        for(int i = 0; i < novosNumeros.size(); i++){
            System.out.println(novosNumeros.get(i));
        }

        for(Integer i : novosNumeros){
            System.out.println(i);
        }

        //Pegando somente os numeros ímpares
        for (Integer i : novosNumeros){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("\n");
        //Pegando somente os numeros pares
        for (Integer i : novosNumeros){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }*/

    }
}
