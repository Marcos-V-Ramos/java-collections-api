package com.marcos.set.Pesquisa;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        conjuntoContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        conjuntoContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(conjuntoContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> nomesEncontrados = new HashSet<>();

        for (Contato contato : conjuntoContatos) {
            if (contato.getNome().toLowerCase().contains(nome.toLowerCase())) {
                nomesEncontrados.add(contato);
            }
        }
        return nomesEncontrados;
    }

    public boolean atualizarNumeroContato(String nome, String novoNumero) {
        boolean status = false;

        for (Contato contato : conjuntoContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setTelefone(novoNumero);
                status = true;
                break;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", "123456");
        agendaContatos.adicionarContato("Camila", "5665");
        agendaContatos.adicionarContato("Camila Cavalcante", "1111111");
        agendaContatos.adicionarContato("Camila DIO", "654987");
        agendaContatos.adicionarContato("Maria Silva", "1111111");
        agendaContatos.adicionarContato("Marcos", "1111111");
        agendaContatos.adicionarContato("Marcos V", "123321");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        boolean contatoAtualizado = agendaContatos.atualizarNumeroContato("Marcos V", "1196082-6242");
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}
