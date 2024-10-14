package Pratica_01.Colecao;

import java.util.*;

public class Colecao {

    public static void main(String[] args) {
        //List - Permite Duplicidade
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(20);
        numeros.add(222);

        //Set - não permite duplicidade
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(20);
        conjunto.add(80);
        conjunto.add(222);
        conjunto.add(20);

        System.out.println(conjunto);

        //Map - lista com chave e valor
        Map<Integer, String> mapaCidade = new HashMap<>();
        mapaCidade.put(1, " Sao Paulo");
        mapaCidade.put(2," Araraquara");
        mapaCidade.put(3, " Cabreúva");

        System.out.println(mapaCidade.get(2));




    }

}
