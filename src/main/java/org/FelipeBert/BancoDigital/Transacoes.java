package org.FelipeBert.BancoDigital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transacoes {
    private final List<String> listaTransacoes;

    public Transacoes() {
        this.listaTransacoes = new ArrayList<>();
    }

    public void novaTransacao(Conta c1, Conta c2, double valor){
        String formatadoParaLista = "%s fez uma transação para %s no valor de %.2f no dia %s"
                .formatted(c1.getNome(), c2.getNome(), valor, LocalDate.now().toString());
        listaTransacoes.add(formatadoParaLista);
    }

    public void exibirTransacoes(){
        listaTransacoes.forEach(s -> System.out.println(s));
    }
}
