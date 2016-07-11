package br.com.testeescolal.util;

public class SQL {
	public static final String INSERE_ALUNO = "insert into aluno (nome,cpf,matricula,idade,login,senha) values (?,?,?,?,?,?)";	
	public static final String UPDATE_ALUNO = "update aluno set nome = ?, cpf = ?, matricula = ?, idade = ?, login = ?,senha = ? where matricula = ?";	
	public static final String DELETA_ALUNO = "delete from aluno where matricula = ?";
	public static final String BUSCA_TODOS_ALUNOS = "Select * from aluno order by nome";
	public static final String BUSCA_ALUNO_MATRICULA = "Select * from aluno where matricula = ?";
}