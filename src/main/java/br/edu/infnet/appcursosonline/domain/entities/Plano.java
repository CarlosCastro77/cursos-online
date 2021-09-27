package br.edu.infnet.appcursosonline.domain.entities;

import br.edu.infnet.appcursosonline.domain.exceptions.TamanhoNegativoException;
import br.edu.infnet.appcursosonline.domain.utils.DataUtils;
import java.time.LocalDateTime;
import java.util.List;

public class Plano {
    private String titulo;
    private float valor;
    private Integer duracaoEmMeses;
    private Instrutor instrutor;
    private List<Curso> cursos;
    private LocalDateTime dataAssinatura;
    private LocalDateTime dataFinal;
    
    public Plano() {
        this.dataAssinatura = LocalDateTime.now();
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(titulo);
        sb.append(";");
        sb.append(valor);
        sb.append(";");
        sb.append(duracaoEmMeses);
        sb.append(";");
        sb.append(instrutor.toString());
        sb.append(";");
        sb.append(dataAssinatura.format(DataUtils.dateFmt()));
        sb.append(";");
        sb.append(dataFinal.format(DataUtils.dateFmt()));
        
        if (cursos != null) {
            sb.append(";");
            sb.append(cursos.size());
        }
        
        return sb.toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Integer getDuracaoEmMeses() {
        return duracaoEmMeses;
    }

    public void setDuracaoEmMeses(Integer duracaoEmMeses) throws TamanhoNegativoException {
        if (duracaoEmMeses <= 0) {
            throw new TamanhoNegativoException("Duração em meses não pode ser menor que 0");
        }
        
        this.dataFinal = dataAssinatura.plusMonths(duracaoEmMeses);
        this.duracaoEmMeses = duracaoEmMeses;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public LocalDateTime getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(LocalDateTime dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }
}
