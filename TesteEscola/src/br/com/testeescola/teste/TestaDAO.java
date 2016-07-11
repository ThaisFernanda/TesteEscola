package br.com.testeescola.teste;

import java.util.List;

import br.com.testeescola.beans.Aluno;
import modeloDAO.AlunoDaoImpl;

public class TestaDAO {
	public static void main(String[] args) {
		AlunoDaoImpl dao = new AlunoDaoImpl();
		Aluno aluno = new Aluno();
		
		aluno.setNome("TesteImpl");
		aluno.setCpf("999999");
		aluno.setMatricula("123iijhj");
		aluno.setLogin("teste");
		aluno.setSenha("222");
		
		
		dao.update(aluno);
		
	/*	List<Aluno> alunos = dao.recuperaTodos();
		
		for (Aluno aluno2 : alunos) {
			System.out.println(aluno2.getNome());
				}
			*/
		
			
	
			
		
		
	}

}
