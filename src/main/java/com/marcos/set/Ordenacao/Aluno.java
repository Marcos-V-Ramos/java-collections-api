package com.marcos.set.Ordenacao;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private String matricula;
    private Double nota;

    private Aluno() {

    }

    public Aluno(String nome, String matricula, Double nota) {
        setNome(nome);
        setMatricula(matricula);
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public int compareTo(Aluno a) {
        return this.getNome().compareTo(a.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }
}
