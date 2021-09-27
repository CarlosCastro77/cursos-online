package br.edu.infnet.appcursosonline.domain.exceptions;

public class StringVaziaException extends Exception {
    public StringVaziaException(String mensagem) {
	super(mensagem);
    }
}