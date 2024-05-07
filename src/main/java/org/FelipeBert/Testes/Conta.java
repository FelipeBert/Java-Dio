package org.FelipeBert.Testes;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void pagaBoleto(double valorAPagar) {
        validaSaldo(valorAPagar);
        debita(valorAPagar);
        enviaCreditoParaEmissor(valorAPagar);
    }

    public void validaSaldo(double valorAPagar) {
        if(valorAPagar > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debita(double valorAPagar) {
        this.saldo = this.saldo - valorAPagar;
    }

    public void enviaCreditoParaEmissor(double valorAPagar) {
        //envia valor para emissor do boleto

    }
}