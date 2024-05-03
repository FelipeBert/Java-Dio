package org.FelipeBert.Collections.list.carrinho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras{
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco){
        itemList.add(new Item(nome, quantidade, preco));
    }

    public List<Item> ordenaPorQuantidade(){
        List<Item> listaPorQuantidade = new ArrayList<>(itemList);
        Collections.sort(listaPorQuantidade);
        return listaPorQuantidade;
    }

    public List<Item> ordenaPorPreco(){
        List<Item> listaPorPreco = new ArrayList<>(itemList);
        Collections.sort(listaPorPreco, new ComparatorPorPreco());
        return listaPorPreco;
    }

    public void removerItemPorNome(String nome){
        List<Item> listaParaRemover = new ArrayList<>();

        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                listaParaRemover.add(i);
            }
        }
        itemList.removeAll(listaParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : itemList){
            total += (i.getPreco() * i.getQuantidade());
        }
        return total;
    }

    public void exibirItens(){
        for(Item i : itemList){
            System.out.printf("Item: %s, Preço Unitario: %.2f, quantidade: %d%n",
                    i.getNome(), i.getPreco(), i.getQuantidade());
        }
    }
}