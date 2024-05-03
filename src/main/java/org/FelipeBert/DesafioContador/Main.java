package org.FelipeBert.DesafioContador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor do intervalo: ");
        int firstParameter = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o segundo valor do intervalo: ");
        int secondParameter = scanner.nextInt();

        try{
           Contar(firstParameter, secondParameter);
        }catch (ParametrosInvalidosException e){
            System.out.printf("Segundo parametro dever maior que o primeiro");
        }
    }
    static void Contar(int n1, int n2) throws ParametrosInvalidosException
    {
        if(n2 < n1) {
            throw new ParametrosInvalidosException();
        }
        int intervalo = n2 - n1;
        for(int i = 0; i < intervalo; i++)
        {
            System.out.println("Imprimindo o número %d".formatted(i));
        }
    }
}

