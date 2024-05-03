package org.FelipeBert.Escola;

public class Aluno {
    private String nome;
    private int idade;
    private String cpf;
    private EstadoBrasileiro estadoBrasileiro;

    public Aluno(){}

    public Aluno(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstadoBrasileiro(){
        return "%s - %s".formatted(this.estadoBrasileiro.getSigla(), this.estadoBrasileiro.getNome());
    }

    public void setEstadoBrasileiro(EstadoBrasileiro estadoBrasileiro){
        this.estadoBrasileiro = estadoBrasileiro;
    }
}
