package navegador;

public class NavegadorX implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("exibindo pagina no navegadorX");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba no navegadorX");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina no navegadorX");

    }
}
