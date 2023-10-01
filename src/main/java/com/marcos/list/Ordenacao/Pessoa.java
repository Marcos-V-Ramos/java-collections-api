package com.marcos.list.Ordenacao;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;
    private double altura;

    private Pessoa() {

    }

    public Pessoa(String nome, int idade, double altura) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.idade, pessoa.getIdade());
    }
}
