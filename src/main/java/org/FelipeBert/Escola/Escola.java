package org.FelipeBert.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(21);
        felipe.setEstadoBrasileiro(EstadoBrasileiro.SAO_PAULO);

        System.out.println("O aluno %s tem %d anos e mora no %s"
                .formatted(felipe.getNome(), felipe.getIdade(), felipe.getEstadoBrasileiro()));
    }
}
