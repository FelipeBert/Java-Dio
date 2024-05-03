package org.FelipeBert.StreamApi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        /*
        Supplier<Integer> teste = () -> 3;

        List<Integer> listaSaudacoes = Stream.generate(teste)
            .limit(5)
            .toList();
        */

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}