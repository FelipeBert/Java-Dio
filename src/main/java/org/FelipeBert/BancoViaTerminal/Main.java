package org.FelipeBert.BancoViaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, insira o nome do Cliente !");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        ContaTerminal contaTerminal = new ContaTerminal(nome, numero, agencia, saldo);
        System.out.println(contaTerminal.toString());
    }
}
