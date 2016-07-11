<%@page import="br.com.testelojavirtual.beans.Aluno" %>
<%@page import="servlet.BuscaAluno"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    

<%@page import="java.util.List"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">

 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

 
    <link rel="stylesheet" href="css/normalize.css">    
    <link rel="stylesheet" href="css/style.css">


</head>
<body>


<div class="wrapper">
  
  <div class="table">
    
    <div class="row header">
      <div class="cell">
        Nome
      </div>
      <div class="cell">
        CPF
      </div>
      <div class="cell">
        Matricula
      </div>
      <div class="cell">
        Login
      </div>
      <div class="cell">
        
      </div>
    </div>
    
    
    <%
        List<Aluno> alunos = (List<Aluno>)request.getServletContext().getAttribute("alunos");
        for (Aluno aluno : alunos) {
    %>
        	
    <div class="row">
      <div class="cell">          
       <a href="http://localhost:8080/lojavirtualweb/altera=<%=aluno.getMatricula()%>"><%=aluno.getNome()%></a> 
      </div>
      <div class="cell">
        <%=aluno.getCpf()%>
      </div>
      <div class="cell">
        <%=aluno.getMatricula()%>
      </div>
      <div class="cell">
        <%=aluno.getLogin()%>
      </div>
      <div class="cell">
      <a href="http://localhost:8080/lojavirtualweb/exclui=<%=aluno.getMatricula()%>">Excluir</a> 
      </div>
    </div>
    
    
    <%
        }
    %>
    
   
    
  </div>
  
</div>
   

</body>
</html>