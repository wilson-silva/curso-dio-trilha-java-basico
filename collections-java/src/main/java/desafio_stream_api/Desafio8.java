package main.java.desafio_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/*
    Desafio 8 - Somar os dígitos de todos os números da lista:
    Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
*/
public class Desafio8 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .mapToInt(Desafio8::sumDigits)
                .sum();

        System.out.println("Soma dos dígitos de todos os números: " + somaDigitos);


    }

    private static int sumDigits(Integer num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Adiciona o último dígito do número atual à soma. (resto)
            num /= 10; // Remove o último dígito do número contido na variável number
        }
        return sum;
    }
}
