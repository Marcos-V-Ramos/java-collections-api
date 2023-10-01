package com.marcos.set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> conjuntoAlunos;

    public GerenciadorAlunos() {
        this.conjuntoAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, String matricula, Double nota) {
        conjuntoAlunos.add(new Aluno(nome, matricula, nota));
    }

    public Aluno removerAluno(String matricula) {
        if (conjuntoAlunos.isEmpty()) {
            System.out.println("Conjunto vazio!");
            return null;
        }

        Aluno aluno = null;

        for (Aluno alunoCorrente : conjuntoAlunos) {
            if (alunoCorrente.getMatricula().equalsIgnoreCase(matricula)) {
                aluno = alunoCorrente;
                conjuntoAlunos.remove(alunoCorrente);
                return aluno;
            }
        }
        return aluno;
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosOrdenadosPorNome = new TreeSet<>(conjuntoAlunos);

        return alunosOrdenadosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosOrdenadosPorNota = new TreeSet<>(new Comparator<Aluno>() {
            @Override
            public int compare(Aluno o1, Aluno o2) {
                return Double.compare(o1.getNota(), o2.getNota());
            }
        });

        alunosOrdenadosPorNota.addAll(conjuntoAlunos);

        return alunosOrdenadosPorNota;
    }
    public void exibirAlunos() {
        System.out.println(conjuntoAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerAlunos = new GerenciadorAlunos();

        gerAlunos.adicionarAluno("Mateus", "A3SD3FF", 8.7D);
        gerAlunos.adicionarAluno("Mateus", "A3SD3FF", 8.7D);
        gerAlunos.adicionarAluno("João", "B2CD4GG", 9.5D);
        gerAlunos.adicionarAluno("Maria", "C5EF6HH", 7.2D);
        gerAlunos.adicionarAluno("Pedro", "D7GH8II", 8.0D);
        gerAlunos.adicionarAluno("Ana", "E9IJ0KK", 6.8D);
        gerAlunos.adicionarAluno("Lucas", "F1KL2MM", 9.8D);
        gerAlunos.adicionarAluno("Carla", "G3MN4OO", 7.5D);
        gerAlunos.adicionarAluno("Isabelle", "H5OP6QQ", 8.3D);
        gerAlunos.adicionarAluno("Mariana", "I7QR8SS", 7.9D);
        gerAlunos.adicionarAluno("Rafael", "J9ST0UU", 9.0D);

        gerAlunos.adicionarAluno("Sofia", "K1UV2WW", 8.6D);
        gerAlunos.adicionarAluno("Sofia", "K1UV2WW", 8.6D);
        gerAlunos.adicionarAluno("Sofia", "K1UV2WW", 8.6D);
        gerAlunos.adicionarAluno("Sofia", "K1UV2WW", 8.6D);

        System.out.println("Alunos ordenados por nome: " + gerAlunos.exibirAlunosPorNome());

        gerAlunos.removerAluno("F1KL2MM"); // Removerá o Lucas.
        gerAlunos.removerAluno("K1UV2WW"); // Removerá a Sofia.

        System.out.println("Alunos ordenados por nota: " + gerAlunos.exibirAlunosPorNota());
        gerAlunos.exibirAlunos();
    }
}
