package br.com.testeescola.beans;


/* É UMA CLASSE FINAL, POIS NÃO QUEREMOS QUE ESTE CLASSE TENHA HERDEIROS
ESTA CLASSE DEVERÁ SERVIR APENAS PARA SER INSTANCIADA (NEW) */ 
								
public final class Aluno extends Pessoa implements java.io.Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ATRIBUTOS DA CLASSE ALUNO  (todos privados)
    private String matricula;
    private boolean pne; 
    private String login;
    private String senha;
    
    public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/*PRECISO DISSO?????
	 * public String getNome() {
    	
    	return super.getNome();
    	
    }*/
    
    
    // METODOS DESCRITOS NO DIAGRAMA UML
    
    // <<< SOBREESCRITA DE Mï¿½TODO >>> 
    public String montaCadastro(){
        String pn = "";
        
        if(this.pne)
          pn = "\nPortador de necessidades especiais";
        
        return super.montaCadastro() + "\nMatricula: "+this.matricula+pn;
                                     
    }
    
    // FIM DOS METODOS DESCRITOS NO DIAGRAMA UML
    
    
    
    // INICIO DOS METODOS PUBLICOS GETTERS E SETTERS  
    
    
    //Pega o valor do atributo matricula
    public String getMatricula() {
        return matricula;
    }
    
    //Altera valor do atributo matricula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Pega o valor do atributo pne
    public boolean isPne() {
        return pne;
    }
    
    //Altera valor do atributo pne
    public void setPne(boolean pne) {
        this.pne = pne;
    }
    
    // FIM DOS METODOS PUBLICOS GETTERS E SETTERS  
   
    
    
}
