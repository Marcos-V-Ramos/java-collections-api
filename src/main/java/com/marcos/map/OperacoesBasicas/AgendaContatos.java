package com.marcos.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, String> agendaContatoMap;

    public AgendaContatos() {
        agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato (String nome, String telefone) {
        agendaContatoMap.put(nome, telefone); // o método put() serve tanto para adicionar quanto para atualizar.
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public String pesquisarPorNome(String nome) {
        String telefone = "";

        if (!agendaContatoMap.isEmpty()) {
            telefone = agendaContatoMap.get(nome);
        }

        return telefone;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Isabelle", "(11)92351-1752");
        agendaContatos.adicionarContato("Isabelle", "(11)91451-7151");
        agendaContatos.adicionarContato("Isabelle", "(11)94459-7452"); // permanecerá o último. (atualização)

        agendaContatos.adicionarContato("Vinicius", "(11)96082-6242");
        agendaContatos.adicionarContato("José", "(11)95934-2321");
        agendaContatos.adicionarContato("Mateus", "(11)91451-7451");
        agendaContatos.adicionarContato("Ana", "(11)99959-7416");

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Ana");

        agendaContatos.exibirContatos();

        System.out.println("Pesquisando por nome: " + agendaContatos.pesquisarPorNome("Isabelle"));
    }
}
