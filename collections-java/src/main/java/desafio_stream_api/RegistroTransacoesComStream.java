package main.java.desafio_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();
        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);

            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            if (transacao.getTipoTransacao() == 'D' || transacao.getTipoTransacao() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipoTransacao() == 'S' || transacao.getTipoTransacao() == 's') {
                saldo -= valorTransacao;
            }
        }

        // Exibe o saldo final e a lista de transações ao final do processo usando Stream API
        System.out.println("\nSaldo : " + saldo);
        System.out.println("\nTransacoes:");

        List<String> listaFormatada = transacoes.stream()
                .map(transacao -> transacao.getTipoTransacao() + " de " + transacao.getValorTransicao())
                .toList();

        listaFormatada.forEach(System.out::println);

        scanner.close();
    }
}

