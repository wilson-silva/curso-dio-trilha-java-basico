package main.java.desafio_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
   Desafio 14 - Encontre o maior número primo da lista:
   Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
*/
public class Desafio14 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> max = numeros.stream()
                .filter(Desafio14::isPrimo)
                .max(Integer::compareTo);

        System.out.println("O maior numero primo da lista: " + max.get());
    }

    public static boolean isPrimo(int n) {
        // Obtém o valor absoluto do número para garantir que seja positivo
        n = Math.abs(n);

        // Verifica se o número é menor ou igual a 1, caso contrário, não é primo
        if (n <= 1) {
            return false;
        }

        // Faz um loop de 2 até a raiz quadrada do número
        for (int i = 2; i * i <= n; i++) {
            // Se o número for divisível por algum valor no intervalo, não é primo
            if (n % i == 0) {
                return false;
            }
        }

        // Se não foi encontrado divisor no loop, o número é primo
        return true;
    }

}
