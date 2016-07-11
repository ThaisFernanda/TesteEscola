package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testeescola.beans.Aluno;
import modeloDAO.AlunoDaoImpl;

@WebServlet("/buscaAluno")
public class BuscaAluno implements Tarefa{
	

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
		AlunoDaoImpl dao = new AlunoDaoImpl();
		List<Aluno> alunos = new ArrayList<>();
		Aluno aluno = null;
		
		String matricula = req.getParameter("matricula");
		if (matricula != null && matricula != "") {
			aluno = dao.recupera(matricula);
			alunos.add(aluno);		
		}else {
			alunos = dao.recuperaTodos();
		}
		
		req.setAttribute("alunos", alunos);
		return "/view/buscaAluno.jsp";
	}
	
	

}
