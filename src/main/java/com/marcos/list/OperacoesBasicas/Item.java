package com.marcos.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    private Item() {

    }

    public Item(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item: \n" +
                "Nome: " + getNome() + " " +
                "Preço: " + getPreco() + " " +
                "Quantidade: " + getQuantidade();
    }
}
