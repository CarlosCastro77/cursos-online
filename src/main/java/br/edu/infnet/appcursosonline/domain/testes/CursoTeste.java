package br.edu.infnet.appcursosonline.domain.testes;

import br.edu.infnet.appcursosonline.domain.entities.Desenvolvimento;
import br.edu.infnet.appcursosonline.domain.entities.Design;
import br.edu.infnet.appcursosonline.domain.entities.Negocio;
import br.edu.infnet.appcursosonline.domain.exceptions.StringVaziaException;
import br.edu.infnet.appcursosonline.domain.exceptions.TamanhoNegativoException;
import br.edu.infnet.appcursosonline.domain.exceptions.ValorNegativoException;

public class CursoTeste {
    public static void main(String[] args) {
        try {
            Desenvolvimento cursoAndroid = new Desenvolvimento(
                "Desenvolvimento Android",
                "Curso de desenvolvimento Android com Java",
                150
            );
            cursoAndroid.setLinguagem("Java");
            cursoAndroid.setTrilha("Mobile");
            cursoAndroid.setBootcamp(false);
            System.out.println(cursoAndroid);
            System.out.println("######################################");
        } catch (StringVaziaException e) {
            e.getMessage();
        }
        
        
        try {
            Desenvolvimento cursoWeb = new Desenvolvimento(
                "Desenvolvimento ReactJS",
                "Curso de desenvolvimento Web com JavaScript e o Framework ReactJS",
                150
            );
            cursoWeb.setLinguagem("JavaScript");
            cursoWeb.setTrilha("Web");
            cursoWeb.setBootcamp(false);
            System.out.println(cursoWeb);
            System.out.println("######################################");
        } catch (StringVaziaException e) {
            e.getMessage();
        }
        
        
        try {
            Design cursoPhotoshop = new Design(
                "Edição de Imagens com Photoshop 2021",
                "Curso de edição de imagens utilizando a ultima versão do Photoshop",
                100
            );
            cursoPhotoshop.setFerramenta("Photoshop");
            cursoPhotoshop.setArea("Design Gráfico");
            System.out.println(cursoPhotoshop);
            System.out.println("######################################");
        } catch (StringVaziaException e) {
            e.getMessage();
        }
        
       
        try {
             Negocio cursoVendas = new Negocio(
                "Vivendo de Vendas",
                "Técnicas e comportamentos para você tornar-se um profissional de vendas.",
                90
            );
            cursoVendas.setDuracaoEmMeses(6);
            cursoVendas.setInvestimentoInicial(600);
            cursoVendas.setLucroMensal(100);
            System.out.println(cursoVendas);
            System.out.println("######################################");
        } catch (TamanhoNegativoException | ValorNegativoException e) {
            e.getMessage();
        }
    }
}
