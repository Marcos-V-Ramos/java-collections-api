package com.marcos.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (palavrasUnicas.isEmpty()) {
            return;
        }

        for (String palavraCorrente : palavrasUnicas) {
            if (palavraCorrente.equalsIgnoreCase(palavra)) {
                palavrasUnicas.remove(palavraCorrente);
                return;
            }
        }

        // Poderia ser usado o método contains()
    }

    public boolean verificarPalavra(String palavra) {
        for (String palavraCorrente : palavrasUnicas) {
            if (palavraCorrente.equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;

        // return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (palavrasUnicas.isEmpty()){
            System.out.println("Conjunto Set vazio!");
            return;
        }
        System.out.println(palavrasUnicas);
    }

    public static void main(String args[]) {

        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Swift");

        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
