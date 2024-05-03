package org.FelipeBert.IphoneChallenge.Exceptions;

public class MusicaInvalidaException extends Exception{
    public MusicaInvalidaException(){
        super("Numero não corresponde a uma Musica");
    }
}
