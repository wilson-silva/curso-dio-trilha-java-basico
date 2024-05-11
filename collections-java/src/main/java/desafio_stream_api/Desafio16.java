package main.java.desafio_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Desafio 16 - Agrupe os números em pares e ímpares:
    Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra
    contendo os números ímpares da lista original, e exiba os resultados no console.
*/
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupar os números em pares e ímpares
        Map<Boolean, List<Integer>> grupos = numeros.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        // Exibir os resultados no console
        System.out.println("Números pares: " + grupos.get(true));
        System.out.println("Números ímpares: " + grupos.get(false));
    }
}
