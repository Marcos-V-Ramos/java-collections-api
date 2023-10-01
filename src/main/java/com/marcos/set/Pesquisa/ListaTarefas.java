package com.marcos.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        conjuntoTarefas.add(new Tarefa(descricao, false));
    }
    public Tarefa removerTarefa(String descricao) {
        Tarefa tarefa = null;
        for (Tarefa tarefaCorrente: conjuntoTarefas) {
            if (tarefaCorrente.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa = tarefaCorrente;
                conjuntoTarefas.remove(tarefa);
                break;
            }
        }
        return tarefa;
    }
    public void exibirTarefas() {
        System.out.println(conjuntoTarefas);
    }
    public int contarTarefas() {
        return conjuntoTarefas.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : conjuntoTarefas) {
            if (tarefa.isEhConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : conjuntoTarefas) {
            if (!tarefa.isEhConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }
    public boolean marcarTarefaConcluida(String descricao) {
        boolean retorno = false;

        for (Tarefa tarefa : conjuntoTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setEhConcluida(true);
                retorno = true;
                break;
            }
        }
        return retorno;
    }
    public boolean marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        boolean retorno = false;

        for (Tarefa tarefaCorrente : conjuntoTarefas) {
            if (tarefaCorrente.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaPendente = tarefaCorrente;
                break;
            }
        }

        if (tarefaPendente != null) {
            if (tarefaPendente.isEhConcluida()) {
                tarefaPendente.setEhConcluida(false);
                retorno = true;
            } else {
                System.out.println("Tarefa já está marcada como Pendente!");
            }
        }

        return retorno;
    }
    public void limparListaTarefas() {
        if (conjuntoTarefas.isEmpty()) {
            System.out.println("O Conjunto já está vazio!");
        } else {
            conjuntoTarefas.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar a louça.");
        listaTarefas.adicionarTarefa("Lavar o carro.");
        listaTarefas.adicionarTarefa("Escovar os dentes.");
        listaTarefas.adicionarTarefa("Tomar banho.");
        listaTarefas.adicionarTarefa("Tomar banho.");
        listaTarefas.adicionarTarefa("Tarefa completa.");

        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.removerTarefa("Tomar banho.");

        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.exibirTarefas();
        // listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();


        listaTarefas.marcarTarefaConcluida("Tarefa completa.");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        listaTarefas.marcarTarefaPendente("Tarefa completa.");
        System.out.println(listaTarefas.obterTarefasPendentes());
    }
}
