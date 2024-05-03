package org.FelipeBert.Collections.list.teste;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println(listaTarefas.obterDescricaoTarefas());
        listaTarefas.removerTarefa("Tarefa 1");
        listaTarefas.removerTarefa("tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println(listaTarefas.obterDescricaoTarefas());
    }
}
