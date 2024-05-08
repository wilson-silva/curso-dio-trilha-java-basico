package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listNumeros;

    public SomaNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : listNumeros)
            soma += numero;
        return soma;
    }


    public int encontrarMaiorNumero() {
        int numMaior = Integer.MIN_VALUE;
        if (!listNumeros.isEmpty()) {
            for (Integer n : listNumeros) {
                if (n >= numMaior) {
                    numMaior = n;
                }
            }
            return numMaior;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int numMenor = Integer.MAX_VALUE;
        if (!listNumeros.isEmpty()) {
            for (Integer n : listNumeros) {
                if (n <= numMenor) {
                    numMenor = n;
                }
            }
            return numMenor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!listNumeros.isEmpty()){
            System.out.println(listNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }



    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(8);

        somaNumeros.exibirNumeros();

        System.out.println();
        System.out.println("A soma dos numeros da lista e: " + somaNumeros.calcularSoma());

        System.out.println();
        System.out.println("O maior numero encontrado e: " + somaNumeros.encontrarMaiorNumero());

        System.out.println();
        System.out.println("O menor numero encontrado e: " + somaNumeros.encontrarMenorNumero());

    }

}
