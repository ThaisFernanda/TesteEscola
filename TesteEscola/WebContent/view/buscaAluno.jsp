<%@page import="br.com.testelojavirtual.beans.Aluno"%>
<%@page import="servlet.BuscaAluno"%>
<%@page import="java.util.List"%>


<!DOCTYPE html >
<html>
<head>

<title>Busca Aluno| Escola</title>
<meta charset=UTF-8">
</head>
<body>

	Resultado da Busca:

	<ul>

		<%
			List<Aluno> alunos = (List<Aluno>) request.getAttribute("alunos");
			for (Aluno aluno : alunos) {
		%>
		<li>
			<%
				out.println(aluno.getNome());
			%>
		</li>

		<%
			}
		%>


	</ul>


</body>
</html>