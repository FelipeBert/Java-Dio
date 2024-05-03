package org.FelipeBert.Collections.map.contato;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Felipe", 123456);
        agendaContatos.adicionarContato("Felipe", 1234567);
        agendaContatos.adicionarContato("Gabriel", 1234567);
        agendaContatos.adicionarContato("Joao", 12345);
        agendaContatos.adicionarContato("Fernado", 1234);
        agendaContatos.adicionarContato("Gabriela", 123);
        agendaContatos.adicionarContato("Jaqueline", 12);
        agendaContatos.adicionarContato("Helena", 1);
        agendaContatos.removerContatoPorNome("Jaqueline");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Helena"));
    }
}
