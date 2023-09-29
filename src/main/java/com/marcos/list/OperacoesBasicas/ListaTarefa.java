package com.marcos.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa : listaTarefa){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        listaTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefa.size();
    }

    public void obterDescricoesTarefas() {

        for (Tarefa tarefa : listaTarefa) {
            System.out.println("Tarefa: " + tarefa.getDescricao());
        }
    }
}