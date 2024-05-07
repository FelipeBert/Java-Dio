package org.FelipeBert;

import org.FelipeBert.Testes.Email;
import org.FelipeBert.Testes.Formato;
import org.FelipeBert.Testes.PlataformaDeEnvio;
import org.FelipeBert.Testes.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEmailTest {

    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;

    @InjectMocks
    private ServicoEnvioEmail servicoEnvioEmail;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviados(){
        String email = "user@gmail.com";
        String msg = "Hello World";
        boolean formatoHtml = true;

        servicoEnvioEmail.enviaEmail(email, msg, formatoHtml);

        Mockito.verify(plataformaDeEnvio).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue();
        Assertions.assertEquals(email, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(msg, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());

    }

}
