package br.edu.infnet.appcursosonline.domain.exceptions;

public class ValorNegativoException extends Exception {
    public ValorNegativoException(String mensagem) {
	super(mensagem);
    }
}