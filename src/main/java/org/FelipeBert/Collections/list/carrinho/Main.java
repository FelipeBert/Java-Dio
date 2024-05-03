package org.FelipeBert.Collections.list.carrinho;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Carrinho hotwells", 20, 16.50);
        carrinhoDeCompras.adicionarItem("Album Sepultura", 50, 120);
        carrinhoDeCompras.adicionarItem("Album", 60, 120);
        carrinhoDeCompras.adicionarItem("DVD de Kamen Rider", 5, 10);

        CarrinhoDeCompras newCarrinho = new CarrinhoDeCompras();
        for(Item i : carrinhoDeCompras.ordenaPorQuantidade()){
            newCarrinho.adicionarItem(i.getNome(), i.getQuantidade(), i.getPreco());
        }
        newCarrinho.exibirItens();
    }
}
