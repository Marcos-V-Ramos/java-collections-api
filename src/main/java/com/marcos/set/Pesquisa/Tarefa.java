package com.marcos.set.Pesquisa;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean ehConcluida;

    public Tarefa(String descricao, boolean ehConcluida) {
        setDescricao(descricao);
        setEhConcluida(ehConcluida);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEhConcluida() {
        return ehConcluida;
    }

    public void setEhConcluida(boolean ehConcluida) {
        this.ehConcluida = ehConcluida;
    }

    @Override
    public String toString() {
        return "{ descricao: " + descricao + ", ehConcluida: " + ehConcluida +" }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }
}
