package reprodutor;

public class IPod implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando musica no Ipod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no Ipod");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no Ipod");
    }
}
