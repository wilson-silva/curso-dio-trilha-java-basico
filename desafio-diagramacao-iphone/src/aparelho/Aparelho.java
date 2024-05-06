package aparelho;

import iphone.IPhone;
import navegador.NavegadorInternet;
import navegador.NavegadorX;
import reprodutor.IPod;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;
import telefone.Telefone;

public class Aparelho {
    public static void main(String[] args) {
        NavegadorInternet navegadorInternet = new NavegadorX();
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        System.out.println();

        ReprodutorMusical reprodutorMusical = new IPod();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();
        System.out.println();

        AparelhoTelefonico aparelhoTelefonico = new Telefone();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioVoz();

        System.out.println("--------------------------------------");

        IPhone iPhone = new IPhone();

        NavegadorInternet navegador = iPhone;
        ReprodutorMusical musical = iPhone;
        AparelhoTelefonico telefonico = iPhone;

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        System.out.println();

        musical.tocar();
        musical.pausar();
        musical.selecionarMusica();
        System.out.println();

        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();

    }
}