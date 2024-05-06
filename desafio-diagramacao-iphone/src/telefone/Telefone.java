package telefone;

public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("ligando pelo telefone");
    }

    @Override
    public void atender() {
        System.out.println("atendendo pelo telefone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz pelo telefone");

    }
}
