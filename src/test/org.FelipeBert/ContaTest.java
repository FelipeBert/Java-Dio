package org.FelipeBert;

import org.FelipeBert.Testes.Conta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTest {

    @Spy
    private Conta conta = new Conta(3000d);

    @Test
    void validarOrdemDeChamada(){
        conta.pagaBoleto(50);

        InOrder inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).pagaBoleto(50);
        inOrder.verify(conta).validaSaldo(50);
        inOrder.verify(conta).debita(50);
        inOrder.verify(conta).enviaCreditoParaEmissor(50);
    }

    @Test
    void validarNumeroDeChamadas(){
        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(1000);
        conta.validaSaldo(1500);

        Mockito.verify(conta, Mockito.times(4)).validaSaldo(ArgumentMatchers.anyDouble());
    }
}
