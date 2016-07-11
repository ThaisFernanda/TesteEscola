package br.com.testeescola.beans;


/* É UMA CLASSE ABSTRATA POIS NÃO QUEREMOS QUE UM OBJETO SEJA INSTANCIADO (NEW)
   ESTA CLASSE DEVERÁ SERVIR APENAS COMO MODELO PARA SER HERDADA */ 
public abstract class Pessoa implements java.io.Serializable {  
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ATRIBUTOS DA CLASSE PESSOA  (todos privados)
    private String nome;
    private int idade;
    private String cpf; 
    
    
    // aumenta 1 ano na idade
    public void atualizarIdade(){
        this.idade++;
    }
    
    
    // METODO DESCRITOS NO DIAGRAMA UML
    
    // <<< SOBREESCRITA DE MÉTODO >>>
    public String montaCadastro(){
            return "Nome: "+this.nome+
                    "\nIdade: "+this.idade+
                    "\nCPF: "+this.cpf;
    }
    // FIM DOS METODOS DESCRITOS NO DIAGRAMA UML
    
    
    
    
    
    // INICIO DOS METODOS PUBLICOS GETTERS E SETTERS  
    
    //Pega o valor do atributo nome
    public String getNome() {
        return nome;
    }
    
    //Altera valor do atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Pega o valor do atributo idade
    public int getIdade() {
        return idade;
    }
    
    //Altera valor do atributo idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //Pega o valor do atributo cpf
    public String getCpf() {
        return cpf;
    }
    
    //Altera valor do atributo cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    
    
    // FIM DOS METODOS PUBLICOS GETTERS E SETTERS  
    
}
