package org.FelipeBert.Collections.set;

import java.util.Comparator;
import java.util.Objects;

public class Convidado implements Comparable<Convidado>{
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigoConvite(int codigoConvite){
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite() && Objects.equals(getNome(), convidado.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCodigoConvite());
    }

    @Override
    public int compareTo(Convidado c) {
        return this.nome.compareTo(c.getNome());
    }
}

class ComparatorPorCodigo implements Comparator<Convidado>{

    @Override
    public int compare(Convidado c1, Convidado c2) {
        return Integer.compare(c1.getCodigoConvite(), c2.getCodigoConvite());
    }
}
