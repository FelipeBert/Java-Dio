package org.FelipeBert.BancoViaTerminal;

public class ContaTerminal {
    private String nome;
    private int numero;
    private String agencia;
    private double saldo;

    public ContaTerminal(String nome, int numero, String agencia, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo de %.2f já está disponível para saque.", nome, agencia, numero, saldo);
    }
}
