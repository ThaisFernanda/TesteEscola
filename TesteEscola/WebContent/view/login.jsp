<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <form method="post" action="http://localhost:8080/exemplojsp/htdocs/alunocadastro.jsp"> -->

<font color="red"> ${mensagem} </font> <br>

<h2>LOGIN</h2> 
    
<form method="POST" action="http://localhost:8080/lojavirtualweb/servlet"> 
        <fieldset>
            <legend>Login</legend>
            <input type="hidden" name="acao" value="logar">
            <p>Usuario: <input type="text" name="user"   ></p>
            <p>Senha: <input type="password" name="pass"   ></p>

            <center><button type="submit">Entrar</button>
        </fieldset>
    </form>
    
<br>

Ainda não tem login ? <a href="http://localhost:8080/lojavirtualweb/view/cadastro.jsp">Cadastre-se</a>
   

</body>
</html>