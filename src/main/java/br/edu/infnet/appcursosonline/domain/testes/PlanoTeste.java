package br.edu.infnet.appcursosonline.domain.testes;

import br.edu.infnet.appcursosonline.domain.entities.Curso;
import br.edu.infnet.appcursosonline.domain.entities.Desenvolvimento;
import br.edu.infnet.appcursosonline.domain.entities.Design;
import br.edu.infnet.appcursosonline.domain.entities.Instrutor;
import br.edu.infnet.appcursosonline.domain.entities.Negocio;
import br.edu.infnet.appcursosonline.domain.entities.Plano;
import br.edu.infnet.appcursosonline.domain.exceptions.StringVaziaException;
import br.edu.infnet.appcursosonline.domain.exceptions.TamanhoNegativoException;
import br.edu.infnet.appcursosonline.domain.exceptions.ValorNegativoException;
import java.util.ArrayList;
import java.util.List;

public class PlanoTeste {
    public static void main(String[] args) {
        Instrutor instrutor = new Instrutor("Carlos", "Apenas um instrutor de programação", "Front-End");
        
        Desenvolvimento cursoAndroid = new Desenvolvimento(
            "Desenvolvimento Android",
            "Curso de desenvolvimento Android com Java",
            150
        );
        
        try {
            cursoAndroid.setLinguagem("Java");
            cursoAndroid.setTrilha("Mobile");
        } catch (StringVaziaException e) {
            e.getMessage();
        }
        cursoAndroid.setBootcamp(false);
        
        
        Desenvolvimento cursoWeb = new Desenvolvimento(
            "Desenvolvimento ReactJS",
            "Curso de desenvolvimento Web com JavaScript e o Framework ReactJS",
            150
        );
        
        try {
            cursoWeb.setLinguagem("JavaScript");
            cursoWeb.setTrilha("Web");
        } catch (StringVaziaException e) {
            e.getMessage();
        }
        cursoWeb.setBootcamp(false);
        
        
        Design cursoPhotoshop = new Design(
            "Edição de Imagens com Photoshop 2021",
            "Curso de edição de imagens utilizando a ultima versão do Photoshop",
            100
        );
        try {
            cursoPhotoshop.setFerramenta("Photoshop");
            cursoPhotoshop.setArea("Design Gráfico");
        } catch (StringVaziaException e) {
            e.getMessage();
        }
        
        
        Negocio cursoVendas = new Negocio(
            "Vivendo de Vendas",
            "Técnicas e comportamentos para você tornar-se um profissional de vendas.",
            90
        );
        try {
            cursoVendas.setDuracaoEmMeses(6);
            cursoVendas.setInvestimentoInicial(600);
            cursoVendas.setLucroMensal(100);
        } catch (TamanhoNegativoException | ValorNegativoException e) {
            e.getMessage();
        }
        
        List<Curso> listaDesenvolvimento = new ArrayList<Curso>();
        listaDesenvolvimento.add(cursoAndroid);
        listaDesenvolvimento.add(cursoWeb);
        
        List<Curso> listaDesign = new ArrayList<Curso>();
        listaDesign.add(cursoPhotoshop);
        
        List<Curso> listaNegocio = new ArrayList<Curso>();
        listaNegocio.add(cursoVendas);
        
        
        
        Plano plano3MesesDev = new Plano();
        plano3MesesDev.setCursos(listaDesenvolvimento);
        try {
            plano3MesesDev.setDuracaoEmMeses(3);
        } catch (TamanhoNegativoException e) {
            e.getMessage();
        }
        plano3MesesDev.setInstrutor(instrutor);
        plano3MesesDev.setTitulo("Plano Desenvolvimento 3 Meses");
        float valor3MesesDev = 0;
        for (Curso curso : plano3MesesDev.getCursos()) {
            valor3MesesDev += curso.getValor();
        }
        plano3MesesDev.setValor(valor3MesesDev);
        
        System.out.println(plano3MesesDev);
        
        
        
        Plano plano3MesesDesign = new Plano();
        plano3MesesDesign.setCursos(listaDesign);
        try {
            plano3MesesDesign.setDuracaoEmMeses(3);
        } catch (TamanhoNegativoException e) {
            e.getMessage();
        }
        plano3MesesDesign.setInstrutor(instrutor);
        plano3MesesDesign.setTitulo("Plano Design 3 Meses");
        float valor3MesesDesign = 0;
        for (Curso curso : plano3MesesDesign.getCursos()) {
            valor3MesesDesign += curso.getValor();
        }
        plano3MesesDesign.setValor(valor3MesesDesign);
        
        System.out.println(plano3MesesDesign);

        

        Plano plano3MesesNegocio = new Plano();
        plano3MesesNegocio.setCursos(listaDesign);
        try {
            plano3MesesNegocio.setDuracaoEmMeses(3);
        } catch (TamanhoNegativoException e) {
            e.getMessage();
        }
        plano3MesesNegocio.setInstrutor(instrutor);
        plano3MesesNegocio.setTitulo("Plano Design 3 Meses");
        float valor3MesesNegocio = 0;
        for (Curso curso : plano3MesesNegocio.getCursos()) {
            valor3MesesNegocio += curso.getValor();
        }
        plano3MesesNegocio.setValor(valor3MesesNegocio);
        
        System.out.println(plano3MesesNegocio);
    }
}
