package org.FelipeBert;

import org.FelipeBert.Testes.Pessoa;

import java.time.LocalDate;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class PessoaTest {

    @BeforeAll
    static void configuracao(){
        Pessoa.iniciarConexao();
    }

    @Test
    public void calcularIdadeCorretamente(){
        Pessoa qualquer = new Pessoa("Qualquer", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(qualquer.getIdade(), 24);
    }

    @Test
    public void deveRetornarSeEMaiorDeIdade(){
        Pessoa maiorIdadeTest = new Pessoa("Qualquer", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(maiorIdadeTest.maiorDeIdade());

        Pessoa menorIdadeTest = new Pessoa("Qualquer", LocalDate.of(2023, 1, 1));
        Assertions.assertFalse(menorIdadeTest.maiorDeIdade());
    }

    @Test
    public void validarSomenteUsuarioX(){
        Pessoa felipe = new Pessoa("Qualquer", LocalDate.of(2000, 1, 1));
        Assumptions.assumeFalse("jao".equals(felipe.getNome()));
        Assertions.assertEquals("felip", System.getenv("USERNAME"));
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "felip")
    public void testComVariavelDeAmbiente(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void enableOnWindows(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void enableOnMac(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    public void getIdadeExceptionTest(){
        Pessoa newPessoa = new Pessoa("15", LocalDate.now());
        Assertions.assertThrows(IllegalArgumentException.class, newPessoa::getIdade);
    }

    @Test
    public void getIdadeTest(){
        Pessoa newPessoa = new Pessoa("15", LocalDate.of(2000, 1, 1));
        Assertions.assertDoesNotThrow(() -> newPessoa.getIdade());
    }

    @AfterAll
    static void finalizar(){
        Pessoa.finalizarConexao();
    }

}