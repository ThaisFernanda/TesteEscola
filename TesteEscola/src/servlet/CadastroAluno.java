package servlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modeloDAO.AlunoDaoImpl;
import br.com.testeescola.beans.Aluno;

@WebServlet("/cadastraAluno")
public class CadastroAluno implements Tarefa{
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		Aluno aluno = new Aluno();
		AlunoDaoImpl dao = new AlunoDaoImpl();
		
		aluno.setNome(req.getParameter("nome"));
		aluno.setCpf(req.getParameter("cpf"));
		aluno.setMatricula(req.getParameter("matricula"));
		//aluno.setIdade(Integer.parseInt((req.getParameter("idade"))));
		aluno.setLogin(req.getParameter("login"));
		aluno.setSenha(req.getParameter("senha"));
		
		dao.insert(aluno);
		//lista = dao.recuperaTodos();
		
		req.setAttribute("aluno", aluno);
		
		//"view/login_confirmacao.jsp"
		return "view/cadastro.jsp";
		
	}


}