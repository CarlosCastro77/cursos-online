package br.edu.infnet.appcursosonline.domain.entities;

public class Instrutor {
    private String nome;
    private String biografia;
    private String especialidade;
    
    public Instrutor(String nome, String biografia, String especialidade) {
        this.nome = nome;
        this.biografia = biografia;
        this.especialidade = especialidade;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(";");
        sb.append(biografia);
        sb.append(";");
        sb.append(especialidade);
        
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
