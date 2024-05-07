package org.FelipeBert;

import org.FelipeBert.Testes.ApiDosCorreios;
import org.FelipeBert.Testes.CadastrarPessoa;
import org.FelipeBert.Testes.DadosLocalizacao;
import org.FelipeBert.Testes.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class UsoMocksTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarCadastro(){
        DadosLocalizacao newDadoFicticio = new DadosLocalizacao("MG", "Patos", "2", "Apartamento", "Bairro");
        Mockito.when(apiDosCorreios.buscaPeloCep("18191981981")).thenReturn(newDadoFicticio);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("felipe", "81981891", LocalDate.of(2021, 1, 1), "18191981981");

        Assertions.assertEquals("felipe", pessoa.getNome());
        Assertions.assertEquals("81981891", pessoa.getDocumento());
        Assertions.assertEquals(3, pessoa.getIdade());
        Assertions.assertEquals("MG", pessoa.getEndereco().getUf());
        Assertions.assertEquals("Patos", pessoa.getEndereco().getCidade());
        Assertions.assertEquals("Apartamento", pessoa.getEndereco().getComplemento());
    }
}