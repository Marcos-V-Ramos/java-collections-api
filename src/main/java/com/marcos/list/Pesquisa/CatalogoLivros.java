package com.marcos.list.Pesquisa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogos;

    public CatalogoLivros() {
        catalogos = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, LocalDate anoPublicacao) {
        catalogos.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if (!catalogos.isEmpty()) {
            for (Livro livro : catalogos) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(livro);
                }
            }
            return livrosDoAutor;
        }
        return livrosDoAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!catalogos.isEmpty()) {
            for (Livro livro : catalogos) {
                if (livro.getAnoPublicacao().getYear() >= anoInicial && livro.getAnoPublicacao().getYear() <= anoFinal) {
                    livrosPorIntervalo.add(livro);
                }
            }
            return livrosPorIntervalo;
        }
        return null;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        if (!catalogos.isEmpty()) {
            for (Livro livro : catalogos) {
                if (livro.getTitulo().equalsIgnoreCase(titulo))
                    return livro;
            }
            return null;
        }
        return null;
    }

    public static void main (String[] args) {
        System.out.print("Pesquisa");

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O Código da Vinci", "Dan Brown", LocalDate.of(2020, 4, 6));
        catalogoLivros.adicionarLivro("Anjos e Demônios", "Dan Brown", LocalDate.of(2000, 6, 1));
        catalogoLivros.adicionarLivro("Inferno", "Dan Brown", LocalDate.of(2013, 5, 14));


        catalogoLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", LocalDate.of(1997, 6, 26));
        catalogoLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", LocalDate.of(1605, 1, 16));
        catalogoLivros.adicionarLivro("A Revolta de Atlas", "Ayn Rand", LocalDate.of(1957, 10, 10));
        catalogoLivros.adicionarLivro("1984", "George Orwell", LocalDate.of(1949, 6, 8));
        catalogoLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", LocalDate.of(1813, 1, 28));
        catalogoLivros.adicionarLivro("O Grande Gatsby", "F. Scott Fitzgerald", LocalDate.of(1925, 4, 10));
        catalogoLivros.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", LocalDate.of(1967, 5, 30));
        catalogoLivros.adicionarLivro("Apanhador no Campo de Centeio", "J.D. Salinger", LocalDate.of(1951, 7, 16));
        catalogoLivros.adicionarLivro("A Culpa É das Estrelas", "John Green", LocalDate.of(2012, 1, 10));

        System.out.println(catalogoLivros.pesquisarPorAutor("Dan Brown"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("O Grande Gatsby"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2023));
    }
}
