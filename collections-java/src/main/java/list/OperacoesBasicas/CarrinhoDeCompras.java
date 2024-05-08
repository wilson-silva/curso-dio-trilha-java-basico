package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!listaItem.isEmpty()){
            for (Item item : listaItem) {
                if(item.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(item);
                }
            }
            listaItem.removeAll(itensParaRemover);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valoTotal = 0d;
        if (!listaItem.isEmpty()) {
            for (Item item : listaItem){
                valoTotal += item.getPreco() * item.getQuantidade();
            }
            return valoTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!listaItem.isEmpty()) {
            for (Item item : listaItem) {
                System.out.println(item);
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("caneta", 2.0, 10);
        carrinhoDeCompras.adicionarItem("lápis", 1.0, 10);
        carrinhoDeCompras.adicionarItem("borracha", 1.0, 10);

        carrinhoDeCompras.exibirItens();

        System.out.println("---------------------------");
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("caneta");

        System.out.println("---------------------------");
        carrinhoDeCompras.exibirItens();

        System.out.println("---------------------------");
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }

}
