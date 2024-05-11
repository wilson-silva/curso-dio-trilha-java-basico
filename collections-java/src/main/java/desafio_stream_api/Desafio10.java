package main.java.desafio_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
   Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
   Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
*/
public class Desafio10 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> integers = numeros.stream()
                .filter(n -> n % 2 != 0)
                .filter(n -> (n % 3 == 0 ||  n % 5 == 0))
                .toList();

        System.out.println(integers);
    }

}
