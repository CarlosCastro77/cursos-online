package br.edu.infnet.appcursosonline.domain.testes;

import br.edu.infnet.appcursosonline.domain.entities.Instrutor;

public class InstrutorTeste {
    public static void main(String[] args) {
        Instrutor instrutor = new Instrutor("Carlos", "Instrutor de desenvolvimento mobile", "Desenvolvimento Mobile");
        System.out.println(instrutor);
    }
}
