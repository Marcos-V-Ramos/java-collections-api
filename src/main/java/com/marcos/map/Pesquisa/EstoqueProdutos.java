package com.marcos.map.Pesquisa;

import javax.sound.sampled.Port;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirTodosOsProdutos() {
        System.out.println(estoqueProdutosMap); // pesquisar
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0D;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalEstoque() {
        Produto produto = null;
        double maiorQuantidadeValorTotal = 0D;

        if (!(estoqueProdutosMap.isEmpty())) {
            for (Produto p : estoqueProdutosMap.values()) {
                double quantidadeValorTotalCorrente = p.getQuantidade() * p.getPreco();
                if (quantidadeValorTotalCorrente > maiorQuantidadeValorTotal) {
                    maiorQuantidadeValorTotal = quantidadeValorTotalCorrente;
                    produto = p;
                }
            }
        }
        return produto;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(3L, "Produto 1" ,10, 28.2);
        estoque.adicionarProduto(4L, "Produto 2" ,2, 33.1);
        estoque.adicionarProduto(5L, "Produto 3" ,12, 10.5);
        estoque.adicionarProduto(6L, "Produto 4" ,6, 21.4);
        estoque.adicionarProduto(7L, "Produto 5" ,3, 54.4);

        estoque.exibirTodosOsProdutos();

        System.out.println("Valor do estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior valor: " + estoque.obterProdutoMaiorQuantidadeValorTotalEstoque());
    }
}
