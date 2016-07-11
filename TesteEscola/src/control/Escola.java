package control;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.testeescola.beans.Aluno;
import control.AlunoControle;

public class Escola {
	
	// ATRIBUTOS PRIVADOS
    private String razaoSocial;
    private String nomeFantasia;
    private String cidade;
       

    
	/* ATRIBUTOS Publicos da classe Escola */
	public AlunoControle controleAluno;
	

	/* DESAFIO: implemente uma classe controle, em substituição a
	   cada uma das listas abaixo:*/
  //  private List<Professor> listaProfessores = new ArrayList<Professor>();        
  //  private List<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
  //  private List<Aula> listaAulas = new ArrayList<Aula>();
    
   
    
    //Construtor da Class Escola
    public Escola() {
    	this.razaoSocial = "Accenture do Futuro & Rede Cidad� Associados";
		this.nomeFantasia = "Accenture for the Future";
		this.cidade = "Recife";	
		
		
		/* a lista de alunos é carregadado banco de dados no contrutor da classe
		   AlunoControle() */
		this.controleAluno =  new AlunoControle();
		
		
		/*
		System.out.println("Aguarde, carregando disciplinas a partir do BD....");
    	DisciplinaDao disciplinaDao = new DisciplinaDao(Principal.con);
		this.listaDisciplinas = disciplinaDao.recupera();
	
			
		System.out.println("Aguarde, carregando professores a partir do BD....");
    	ProfessorDao professorDao = new ProfessorDao(Principal.con);
		this.listaProfessores = professorDao.recupera();
		*/
		
    }
    
    
    //Pega o valor do atributo razaoSocial
    public String getRazaoSocial() {
        return razaoSocial;
    }
    
    
    //Altera valor do atributo razaoSocial
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    //Pega o valor do atributo nomeFantasia
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    
    //Altera valor do atributo nomeFantasia
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    //Pega o valor do atributo cidade
    public String getCidade() {
        return cidade;
    }
    
    //Altera valor do atributo cidade
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


	public AlunoControle getControleAluno() {
		return controleAluno;
	}



    
  
    
    
}
