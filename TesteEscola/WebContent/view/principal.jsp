<%@page import="br.com.testelojavirtual.beans.Aluno"%>
<html> 
<head>
 <title> Como usar DIV </title>
 <meta name="description" content="Aprenda a usar a tag div em HTML & CSS">
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <link rel="stylesheet" type="text/css" href="css/estilo.css"/>


</head>


<body>
 <div id="header">
       <b> Cabeçalho: Exemplo HTML: uso de DIV´s com CSS externo (estilo.css) </b> <br>       
       <img src="../img/accenture.jpg" width="20%" > </img> <br>      
       <b>Usuário: ${aluno.nome}</b><br>
       <b>Logout</b>
       <a href="view/cadastro.jsp"> Logout </a> 
 </div>

 <div id="content">
 
 
 <div class="container">

  <div class="esquerda">
    
    
	
<h3>Menu</h3>

<ul id="menu">
  <li><a href="https://pt.wikipedia.org/wiki/HTML">HTML</a></li>
  <li><a href="https://pt.wikipedia.org/wiki/Cascading_Style_Sheets">CSS</a></li>
  <li><a href="https://pt.wikipedia.org/wiki/JavaScript">JavaScript</a></li>
  <li><a href="https://pt.wikipedia.org/wiki/Java_(linguagem_de_programa%C3%A7%C3%A3o)">JAVA</a></li>
</ul>
	
  </div>


  <div class="meio">

  <h1>Conteúdo: </h1>  
  <img src="../img/gandi.jpg"> </img>
  
  <jsp:include page="listagem.jsp"/>

  </div>

  
  <div class="direita">
  
  <form>Buscar:<br><input type=text></form>  

  </div>
  
  <span class="clearfloat"></span>


</div>

</div>

 <div id="foot">
 
     <h2> Rodapé: Todos os direitos Reservados </h2>
     
 </div>

</body>

</html>