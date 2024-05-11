package main.java.desafio_stream_api;

import java.util.Arrays;
import java.util.List;

/*
    Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
    Com a Stream API, verifique se todos os números da lista são distintos (não se repetem)
    e exiba o resultado no console.
*/
public class Desafio9 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> integers = numeros.stream()
                .distinct()
                .toList();

        System.out.println(integers);


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
