package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testeescola.beans.Aluno;
import modeloDAO.AlunoDaoImpl;

@WebServlet("/altera")
public class Altera extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		AlunoDaoImpl dao = new AlunoDaoImpl();
		Aluno aluno = new Aluno();
		
		aluno.setMatricula(req.getParameter("matricula"));
		if ("matricula" == aluno.getMatricula()) {
			aluno.setNome(req.getParameter("nome"));
			aluno.setCpf(req.getParameter("cpf"));
			
			//aluno.setIdade(Integer.parseInt((req.getParameter("idade"))));
			aluno.setLogin(req.getParameter("login"));
			aluno.setSenha(req.getParameter("senha"));
			
			dao.update(aluno);
			
		}else {
			PrintWriter writer = resp.getWriter();
			writer.println("<html><body>");
			writer.println("Matricula Invalida: ");
			writer.println("</body></html>");
			
		}
		
		
		
		
	}

}
