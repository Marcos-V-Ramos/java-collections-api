package com.marcos.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.lang.Integer;

public class ContagemPalavras {

    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public int exibirContagemPalavras() {
        int total = 0;

        for (Integer contagem : palavras.values()) {
            total += contagem;
        }
        return total;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = "";
        int maiorValor = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorValor) {
                maiorValor = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();
        palavras.adicionarPalavras("Isabelle", 24052003);
        palavras.adicionarPalavras("Java", 343);
        palavras.adicionarPalavras("TypeScript", 122);
        palavras.adicionarPalavras("Foo Fighters", 103);
        palavras.adicionarPalavras("JavaScript", 31);

        palavras.removerPalavra("JavaScript");

        System.out.println("Todas as palavras: " + palavras);
        System.out.println("Contagem total: " + palavras.exibirContagemPalavras());
        System.out.println("Palavra mais frequente: " + palavras.encontrarPalavraMaisFrequente());
    }
}
