package br.edu.infnet.appcursosonline.domain.entities;

import br.edu.infnet.appcursosonline.domain.exceptions.StringVaziaException;

public class Design extends Curso {
    private String ferramenta;
    private String area;

    public Design(String titulo, String descricao, float valor) {
        super(titulo, descricao, valor);
    }
    
    @Override
    public float calcularValorPlano() {
        return getValor() + (ferramenta == "Photoshop" ? 150 : 0) + 0.01f;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(ferramenta);
        sb.append(";");
        sb.append(area);
        
        return sb.toString();
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) throws StringVaziaException {
        if (ferramenta == "") {
            throw new StringVaziaException("O campo ferramenta não pode ser vazio.");
        }
        this.ferramenta = ferramenta;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) throws StringVaziaException {
        if (area == "") {
            throw new StringVaziaException("O campo area não pode ser vazio.");
        }
        this.area = area;
    }
    
    
}
