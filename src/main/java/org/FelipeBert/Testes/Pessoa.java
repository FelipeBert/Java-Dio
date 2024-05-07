package org.FelipeBert.Testes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private String documento;
    private LocalDate nascimento;
    private DadosLocalizacao endereco;

    public Pessoa(String nome, LocalDate nascimento, String documento) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.documento = documento;
    }

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public void setEndereco(DadosLocalizacao dadosLocalizacao){
        this.endereco = dadosLocalizacao;
    }

    public DadosLocalizacao getEndereco(){
        return this.endereco;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public int getIdade(){
        int idade = (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
        if(idade > 0) {
            return idade;
        }
        //Exceção apenas para teste do lançamento de exceção
        throw new IllegalArgumentException("Idade deve ser maior que 0");
    }

    public boolean maiorDeIdade(){
        return this.getIdade() >= 18;
    }

    public static void iniciarConexao(){
        System.out.println("Iniciou Conexão");
    }

    public static void finalizarConexao(){
        System.out.println("Finalizou Conexão");
    }
}
