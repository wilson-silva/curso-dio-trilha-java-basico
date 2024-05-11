package main.java.desafio_stream_api;

public class Transacao {
    public char tipoTransacao;
    public double valorTransicao;

    public Transacao(char tipoTransacao, double valorTransicao) {
        this.tipoTransacao = tipoTransacao;
        this.valorTransicao = valorTransicao;
    }

    public char getTipoTransacao() {
        return tipoTransacao;
    }

    public double getValorTransicao() {
        return valorTransicao;
    }

}