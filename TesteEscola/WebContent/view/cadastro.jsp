<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Aluno</title>
</head>
<body>


<font color="red"> ${mensagem} </font> <br> 
   <!--http://localhost:8080/TesteLojaVirtual/cadastraAluno --> 
<h2>CADASTRO</h2> 
<form method="POST" action="executa?tarefa=CadastroAluno"> 
        <fieldset>
            <legend>Login</legend>
            <input type="hidden" name="acao" value="cadastro">
            <p>Nome: <input type="text" name="nome"   ></p>
            <p>CPF: <input type="text" name="cpf"   ></p>
            <p>Matricula: <input type="text" name="matricula"   ></p>
            <p>Idade: <input type="text" name="idade"   ></p>
            <p>Usuario: <input type="text" name="login"   ></p>
            <p>Senha: <input type="password" name="senha"   ></p>

            <center><button type="submit">Cadastrar</button>
        </fieldset>
    </form>
    
<br>
   

</body>
</html>