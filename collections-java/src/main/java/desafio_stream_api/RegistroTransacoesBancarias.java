package main.java.desafio_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();
        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);

            if(transacao.getTipoTransacao() == 'D'){
                saldo += valorTransacao;
                transacoes.add(transacao);

            } else if (transacao.getTipoTransacao() == 'S') {
                saldo -= valorTransacao;
                transacoes.add(transacao);

            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        System.out.println("\nSaldo: "+saldo);
        System.out.println("\nTransacoes:");

        for(int i = 0; i < transacoes.size();  i++){
            if(transacoes.get(i).tipoTransacao == 'D'){
                System.out.println((i + 1) + ". Deposito de " + transacoes.get(i).valorTransicao);
            }else{
                System.out.println((i + 1) + ". Saque de " + transacoes.get(i).valorTransicao);

            }
        }

        scanner.close();
    }

}

