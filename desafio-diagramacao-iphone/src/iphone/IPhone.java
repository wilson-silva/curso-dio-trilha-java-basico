package iphone;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {


    public void tocar() {
        System.out.println("Tocando musica no iPhone");
    }

    public void pausar() {
        System.out.println("Pausando musica no Iphone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica no Iphone");
    }

    //-----------------------------------------------------------------------------------------

    public void exibirPagina() {
        System.out.println("exibindo pagina no navegador do iPhone");
    }

    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba nonavegador do iPhone");
    }

    public void atualizarPagina() {
        System.out.println("atualizando pagina no navegador do iPhone");
    }

    //-----------------------------------------------------------------------------------------

    public void ligar() {
        System.out.println("ligando pelo iPhone");
    }

    public void atender() {
        System.out.println("atendendo pelo iPhone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz pelo iPhone");
    }

}
