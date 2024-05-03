package org.FelipeBert.BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(1500);
        cc.transferir(100, poupanca);

        cc.extrato();
        cc.exibirTransacoes();
        poupanca.extrato();
    }
}
