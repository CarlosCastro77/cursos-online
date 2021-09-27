package br.edu.infnet.appcursosonline.domain.entities;

import br.edu.infnet.appcursosonline.domain.exceptions.StringVaziaException;


public class Desenvolvimento extends Curso{
    private String linguagem;
    private String trilha;
    private boolean bootcamp;

    public Desenvolvimento(String titulo, String descricao, float valor) {
        super(titulo, descricao, valor);
    }

    @Override
    public float calcularValorPlano() {
        return getValor() * (bootcamp ? 2 : 1) + 0.01f;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(linguagem);
        sb.append(";");
        sb.append(trilha);
        return sb.toString();
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) throws StringVaziaException {
        if (linguagem == "") {
            throw new StringVaziaException("O campo linguagem não pode ser vazio.");
        }
        this.linguagem = linguagem;
    }

    public String getTrilha() {
        return trilha;
    }

    public void setTrilha(String trilha) throws StringVaziaException {
        if (trilha == "") {
            throw new StringVaziaException("O campo trilha não pode ser vazio.");
        }
        this.trilha = trilha;
    }
    
    public boolean isBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(boolean bootcamp) {
        this.bootcamp = bootcamp;
    }
    
}
