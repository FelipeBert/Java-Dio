package org.FelipeBert.Collections.list.carrinho;

import java.util.Comparator;

public class Item implements Comparable<Item>{
    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public int compareTo(Item i) {
        return Integer.compare(quantidade, i.getQuantidade());
    }

    public String getNome(){
        return this.nome;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getPreco(){
        return this.preco;
    }
}

class ComparatorPorPreco implements Comparator<Item>{

    @Override
    public int compare(Item i1, Item i2) {
        return Double.compare(i1.getPreco(), i2.getPreco());
    }
}