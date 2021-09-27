package br.edu.infnet.appcursosonline.domain.entities;

public abstract class Curso {
    private String descricao;
    private String titulo;
    private float valor;
    
    public Curso(String titulo, String descricao, float valor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public abstract float calcularValorPlano();
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo);
        sb.append(";");
        sb.append(descricao);
        
        return sb.toString();
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getValor() {
        return valor;
    } 
    
}
