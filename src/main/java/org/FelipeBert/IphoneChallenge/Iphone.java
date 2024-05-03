package org.FelipeBert.IphoneChallenge;

import org.FelipeBert.IphoneChallenge.Exceptions.ComandoInvalidoException;
import org.FelipeBert.IphoneChallenge.Exceptions.CorreioDeVozInvalidoException;
import org.FelipeBert.IphoneChallenge.Exceptions.MusicaInvalidaException;
import org.FelipeBert.IphoneChallenge.Exceptions.TamanhoNumeroInvalidoException;
import org.FelipeBert.IphoneChallenge.Aparelho.AparelhoTelefonico;
import org.FelipeBert.IphoneChallenge.Navegador.NavegadorWeb;
import org.FelipeBert.IphoneChallenge.Reprodutor.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorWeb, ReprodutorMusical {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void atender() {
        System.out.println("Pressione o Botão Verde para Atender a Ligação");
        System.out.println("Chamada Atendida!");
        chamadaEncerrada();
    }

    @Override
    public void ligar() {
        System.out.println("Digite o numero para o qual deseja ligar: ");
        try{
            String numero = scanner.nextLine();
            if(numero.length() != 11){
                throw new TamanhoNumeroInvalidoException();
            }
            System.out.println("Ligando para o Numero...");
            chamadaEncerrada();
        }catch (TamanhoNumeroInvalidoException e){
            System.out.printf("Numero Invalido %s%n", e.getMessage());
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Disque os Numeros 105 para iniciar o Correio de Voz");
        try {
            int comando = scanner.nextInt();
            if(comando != 105){
                throw new CorreioDeVozInvalidoException();
            }
            System.out.println("Correio de Voz Iniciado");
            chamadaEncerrada();
        }catch (CorreioDeVozInvalidoException e){
            System.out.printf("Numero não Reconhecido %s%n", e.getMessage());
        }
    }

    @Override
    public void exibirPagina() {
        System.out.println("Digite a URL da pagina que deseja Acessar: ");
        String pagina = scanner.nextLine();
        System.out.printf("Exibindo pagina %s%n", pagina);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pressiona o Botão para atualizar a Pagina");
        System.out.println("Pagina Atualizada");
    }

    @Override
    public void exibirNovaAba() {
        System.out.println("Pressione o Botao de + para abrir uma nova aba");
        try {
            String botao = scanner.nextLine();
            if(botao != "+"){
                throw new ComandoInvalidoException();
            }
            System.out.println("Nova Aba Criada");
        }catch (ComandoInvalidoException e){
            System.out.printf("Botão Invalido %s%n", e.getMessage());
        }
    }

    @Override
    public void tocar() {
        selecionarMusica();
        System.out.println("Tocando Música");
    }

    @Override
    public void pausar() {
        System.out.println("Pressione o Botão para pausar a musica");
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica() {
        String[] musicas = {"Sorry - Buckcherry",
                "Remiver - The Weeknd",
                "Dengo = João Gomes",
                "Eu Tava Aqui Pensando Deixa Eu Falar Pra Você - Josue Bom de Faixa"
        };

        System.out.println("Selecione o numero de uma das musicas");
        for(int i = 0; i < musicas.length; i++){
            System.out.printf(musicas[i], i);
        }
        try {
            int escolhida = scanner.nextInt();
            if(escolhida > musicas.length - 1 || escolhida < 0){
                throw new MusicaInvalidaException();
            }
            System.out.printf("Musica Selecionada %s%n", musicas[escolhida]);
        }catch (MusicaInvalidaException e){
            System.out.printf("Numero Invalido %s%n", e.getMessage());
        }
    }

    private void chamadaEncerrada(){
        System.out.println("Chamada Encerrada");
    }
}
