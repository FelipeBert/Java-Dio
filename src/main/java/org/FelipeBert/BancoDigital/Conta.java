package org.FelipeBert.BancoDigital;

public abstract class Conta implements ContaMetodosInterface {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private Transacoes transacoes = new Transacoes();

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        transacoes.novaTransacao(this, contaDestino, valor);
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome(){
        return this.cliente.getNome();
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }

    public void exibirTransacoes(){
        transacoes.exibirTransacoes();
    }
}
