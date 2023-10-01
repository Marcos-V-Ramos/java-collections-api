package com.marcos.set.Ordenacao;

import javax.sound.sampled.Port;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> conjuntoProdutos;

    public CadastroProdutos() {
        conjuntoProdutos = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade) {
        conjuntoProdutos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> conjuntoProduto = new TreeSet<>(conjuntoProdutos);

        return conjuntoProduto;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> conjuntoProduto = new TreeSet<>(new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return Double.compare(p1.getPreco(), p2.getPreco());
            }
        });
        conjuntoProduto.addAll(conjuntoProdutos);
        return conjuntoProduto;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Galaxy Z Flip", 1000d, 10);
        cadastroProdutos.adicionarProduto(2, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4, "Apple Air Pods", 50d, 15);

        System.out.println(cadastroProdutos.conjuntoProdutos);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
