package org.FelipeBert.Testes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
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
