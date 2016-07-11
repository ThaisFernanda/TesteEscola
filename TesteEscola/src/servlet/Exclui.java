package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testeescola.beans.Aluno;
import modeloDAO.AlunoDaoImpl;

public class Exclui extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		AlunoDaoImpl dao = new AlunoDaoImpl();
		Aluno aluno = new Aluno();
		
		aluno.setMatricula(req.getParameter("matricula"));
		
		dao.deleta(aluno);
		
		req.setAttribute("aluno", aluno);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("view/listagem.jsp");
		dispatcher.forward(req, resp);
	}

}
