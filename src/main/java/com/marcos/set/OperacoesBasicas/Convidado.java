package com.marcos.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoConvite;

    private Convidado() {

    }
    public Convidado(String nome, int codigoConvite) {
        this.setNome(nome);
        this.setCodigoConvite(codigoConvite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Convidado convidado)) {
            return false;
        }
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }
}
