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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ArquivoTeste {
    public static void main(String[] args) {
        String dir = "C:/dev/";
        String arq = "planos.txt";
        
        try {
            
            try {
                FileReader file = new FileReader(dir+arq);				
                BufferedReader leitura = new BufferedReader(file);
				
		FileWriter fileW = new FileWriter(dir+"out_"+arq);
		BufferedWriter escrita = new BufferedWriter(fileW);
				
		String linha = null;
		String[] campos;
				
		linha = leitura.readLine();
                
                List<Curso> cursos = new ArrayList<Curso>();
                Plano plano = new Plano();
                
                
                while(linha != null) {
                    campos = linha.split(";");
                    
                    switch(campos[0]) {
                        case "Plano":
                            plano.setTitulo(campos[1]);
                            plano.setDuracaoEmMeses(Integer.valueOf(campos[2]));
                            Instrutor instrutor = new Instrutor(
                                campos[3],
                                campos[4],
                                campos[5]
                            );
                            plano.setInstrutor(instrutor);
                            break;
                        case "Desenvolvimento":
                            Desenvolvimento desenvolvimento = new Desenvolvimento(
                                campos[1],
                                campos[2],
                                Float.valueOf(campos[3])
                             );
                            desenvolvimento.setLinguagem(campos[4]);
                            desenvolvimento.setTrilha(campos[5]);
                            desenvolvimento.setBootcamp(Boolean.valueOf(campos[6]));
                            cursos.add(desenvolvimento);
                            break;
                        case "Negocio":
                            Negocio negocio = new Negocio(
                                campos[1],
                                campos[2],
                                Float.valueOf(campos[3])
                            );
                            negocio.setInvestimentoInicial(Float.valueOf(campos[4]));
                            negocio.setLucroMensal(Float.valueOf(campos[5]));
                            negocio.setDuracaoEmMeses(Integer.valueOf(campos[6]));
                            cursos.add(negocio);
                            break;
                        case "Design":
                            Design design = new Design(
                                campos[1],
                                campos[2],
                                Float.valueOf(campos[3])
                            );
                            design.setArea(campos[4]);
                            design.setFerramenta(campos[5]);
                            cursos.add(design);
                            break;
                        default:
                            System.out.println("Curso inválido");
                            break;
                    }
                    linha = leitura.readLine();
                }
                plano.setCursos(cursos);
                
                for (Curso curso : plano.getCursos()) {
                    escrita.write(
                        plano.getTitulo() + ";" +
                        plano.getInstrutor().getNome() + ";" +
                        curso.getTitulo() + ";" +
                        curso.getValor() + ";"
                    );
                }
                
                leitura.close();
                file.close();
                
                escrita.close();
                fileW.close();

            } catch (IOException | TamanhoNegativoException | StringVaziaException | ValorNegativoException e) {
                System.out.println(e.getMessage());
            }
            
        } finally {
            System.out.println("Processamento realizado!!!");
	}
    }
}
