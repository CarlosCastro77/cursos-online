package br.edu.infnet.appcursosonline.domain.entities;

import br.edu.infnet.appcursosonline.domain.exceptions.TamanhoNegativoException;
import br.edu.infnet.appcursosonline.domain.exceptions.ValorNegativoException;

public class Negocio extends Curso{
    float investimentoInicial;
    float lucroMensal;
    Integer duracaoEmMeses;

    public Negocio(String titulo, String descricao, float valor) {
        super(titulo, descricao, valor);
    }

    @Override
    public float calcularValorPlano() {
        return getValor() + (duracaoEmMeses > 6 ? 50 : 0) + 0.01f;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(investimentoInicial);
        sb.append(";");
        sb.append(lucroMensal);
        
        return sb.toString();
    }

    public float getInvestimentoInicial() {
        return investimentoInicial;
    }

    public void setInvestimentoInicial(float investimentoInicial) throws ValorNegativoException {
        if (investimentoInicial <= 0.0) {
            throw new ValorNegativoException("O valor do investimento inicial precisa ser maior do que 0");
        }
        this.investimentoInicial = investimentoInicial;
    }

    public float getLucroMensal() {
        return lucroMensal;
    }

    public void setLucroMensal(float lucroMensal) throws ValorNegativoException {
        if (lucroMensal <= 0.0) {
            throw new ValorNegativoException("O valor do lucro mensal precisa ser maior do que 0");
        }
        this.lucroMensal = lucroMensal;
    }

    public Integer getDuracaoEmMeses() {
        return duracaoEmMeses;
    }

    public void setDuracaoEmMeses(Integer duracaoEmMeses) throws TamanhoNegativoException {
        if (duracaoEmMeses <= 0) {
            throw new TamanhoNegativoException("O valor da duração precisa ser maior do que 0");
        }
        this.duracaoEmMeses = duracaoEmMeses;
    }

    
}
