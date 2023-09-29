package com.marcos;

import com.marcos.list.OperacoesBasicas.ListaTarefa;

public class Main {

    public static void main (String[] args) {
        System.out.println("---- List ----");

        ListaTarefa listaDeTarefas = new ListaTarefa();

        listaDeTarefas.adicionarTarefa("Lavar o carro.");
        listaDeTarefas.adicionarTarefa("Sair com a Isa.");
        listaDeTarefas.adicionarTarefa("Comprar flores.");
        listaDeTarefas.adicionarTarefa("Enviar currículo.");

        listaDeTarefas.removerTarefa("Lavar o carro.");

        listaDeTarefas.obterDescricoesTarefas();
        System.out.println("Total de Tarefas: " + listaDeTarefas.obterNumeroTotalTarefas());
    }
}
