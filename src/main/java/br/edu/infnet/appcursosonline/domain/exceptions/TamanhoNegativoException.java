package br.edu.infnet.appcursosonline.domain.exceptions;

public class TamanhoNegativoException extends Exception {
    public TamanhoNegativoException(String mensagem) {
	super(mensagem);
    }
}