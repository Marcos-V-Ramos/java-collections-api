package com.marcos.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        listaItens = new ArrayList<>();
    }

    public void adicionarItem (String nome, int quantidade, double preco) {
        Item item = new Item(nome,preco, quantidade);
        listaItens.add(item);
    }
    public void removerItem (String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : listaItens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }

        listaItens.removeAll(itensParaRemover);
        System.out.println("Itens removidos.");
    }
    public double calcularValorTotal() {
        double total = 0D;
        for (Item item : listaItens) {
            total += item.getPreco() * item.getQuantidade();
        }

        return total;
    }
    public void exibirItens() {
        for (Item item : listaItens) {
            System.out.println(item);
        }
    }

    public static void main(String args[]) {
        System.out.println("Exercício 2:");
        CarrinhoDeCompras carrinhoUm = new CarrinhoDeCompras();

        carrinhoUm.adicionarItem("Cartela de Ovos", 10, 20.3);
        carrinhoUm.adicionarItem("Achocolatado 300g", 2, 4.5);
        carrinhoUm.adicionarItem("Suco em Pó - Manga", 10, 1.2);
        carrinhoUm.adicionarItem("Salgadinho Doritos", 3, 10.3);

        carrinhoUm.exibirItens();
        System.out.println( "Valor total: " + carrinhoUm.calcularValorTotal());
        carrinhoUm.removerItem("Salgadinho Doritos");
        System.out.println( "Valor total: " + carrinhoUm.calcularValorTotal());
    }
}
