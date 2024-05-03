package org.FelipeBert.BancoDigital;

public interface ContaMetodosInterface {

    void sacar(double valor);
    void depositar(double valor);
    //void transferir(double valor, ContaMetodosInterface contaDestino);
    void extrato();
}
