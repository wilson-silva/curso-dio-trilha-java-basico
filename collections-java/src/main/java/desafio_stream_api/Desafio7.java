package main.java.desafio_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
    Desafio 7 - Encontrar o segundo número maior da lista:
    Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
*/
public class Desafio7 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer segundoMaior = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);


        System.out.println("SEgundo número maior: " + segundoMaior);


    }
}
