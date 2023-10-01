package com.marcos.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listaNumeros;
    public OrdenacaoNumeros() {
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenados = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdenados);
        return numerosOrdenados;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenados = ordenarAscendente();
        numerosOrdenados.sort(Collections.reverseOrder());
        return numerosOrdenados;
    }

    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros on = new OrdenacaoNumeros();

        on.adicionarNumero(10);
        on.adicionarNumero(-12);
        on.adicionarNumero(-123);
        on.adicionarNumero(34);
        on.adicionarNumero(45);
        on.adicionarNumero(20);
        on.adicionarNumero(21);

        System.out.println(on.ordenarAscendente());
        System.out.println(on.ordenarDescendente());
        on.exibirNumeros();
    }
}
