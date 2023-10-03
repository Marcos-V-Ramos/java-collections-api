package com.marcos.map.Pesquisa;

public class Produto {

    private String nome;
    private Double preco;
    private Integer quantidade;

    private Produto() {

    }

    public Produto(String nome, Double preco, Integer quantidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
}
