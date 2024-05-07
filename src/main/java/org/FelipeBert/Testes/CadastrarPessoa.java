package org.FelipeBert.Testes;

import java.time.LocalDate;

public class CadastrarPessoa {

    private final ApiDosCorreios apiDosCorreios;

    public CadastrarPessoa(final ApiDosCorreios apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, nascimento, documento);
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaPeloCep(cep);
        pessoa.setEndereco(dadosLocalizacao);
        return pessoa;
    }

}