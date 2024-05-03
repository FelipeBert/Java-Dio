package org.FelipeBert.Collections.set;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.adicionarConvidado("Felipe bert", 1123);
        conjuntoConvidados.adicionarConvidado("Andressa", 1126);
        conjuntoConvidados.adicionarConvidado("Joao", 1124);
        conjuntoConvidados.adicionarConvidado("Pedro", 1125);
        //conjuntoConvidados.removerConvidadoPorCodigo(1123);
        //System.out.println(conjuntoConvidados.pesquisaPorCodigo(1125));
        //System.out.println(conjuntoConvidados.pesquisaPorNome("Felipe bert"));
        //conjuntoConvidados.atualizarCodigo("Felipe b", 1128);
        System.out.println(conjuntoConvidados.exibirPorNome());
        System.out.println(conjuntoConvidados.exibirPorCodigo());
        conjuntoConvidados.exibirConvidados();
    }
}
