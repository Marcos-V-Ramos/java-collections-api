package com.marcos.list.Ordenacao;

import java.util.*;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listaOrdenadaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdenadaPorIdade);
        return listaOrdenadaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaOrdenadaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdenadaPorAltura, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return Double.compare(p1.getAltura(), p2.getAltura());
            }
        });
        return listaOrdenadaPorAltura;
    }

    /*
    Solução da Cami sem o uso de classe anônima:

    class ComparatorPorAltura implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa p1, Pessoa p2){
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }
    public void ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    }
     */

    public static void main (String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.61);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 10, 1.60);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 15, 1.76);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 12, 1.90);
        ordenacaoPessoas.adicionarPessoa("Nome 5", 24, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 6", 32, 1.78);

        System.out.println("Ordenado por idade: \n" + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Ordenado por altura: \n" + ordenacaoPessoas.ordenarPorAltura());
    }
}
