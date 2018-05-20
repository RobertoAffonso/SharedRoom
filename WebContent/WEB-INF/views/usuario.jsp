<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Shared Room</title>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css\usuario.css">
</head>
<body>
    
<nav id="navigationBar">
  <ul>
<li><a href="inicial.html">Home</a></li>
<li><a href="cadastro.html">Cadastre-se</a></li>
<li><a href="login.html">Login</a></li>
<li><a href="faleconosco.html">Fale Conosco</a></li>
  </ul>
</nav>

<nav id="navigationBar2">
  <ul>
<li><a href="">Espa&ccedil;o</a></li>
<li><a href="">Casas</a></li>
<li><a href="">Apartamentos</a></li>
<li><a href="">Pesquisa Avan&ccedil;ada</a></li>
  </ul>
</nav>
    
<h2>
<a href="">Anuncie Aqui</a>
</h2>
    
<form  method="get" id="searchform" action="/search/">
<input type="text" value="" name="q" id="s" onfocus="defaultInput(this)" onblur="clearInput(this)" />
<input type="submit" id="searchsubmit" value="Pesquisar" style="width: 200px; height: 30px; border: none; color: #fff; background: #1E90FF;" />
</form>
    
<h1>
Shared Room
</h1>
    
    <div>
   <h3>
       Foto: <input type="file" name="file">
       </br></br></br></br></br>
       <img style="position: absolute; top: 20%; left: 20%;" src="foto.png" id="s1">  </a>
       <input type="submit" value="Enviar">
 <form action="upload.java" method="POST" enctype="multipart/form-data">
</form>
    </h3>
        <input type="button" id="editar" value="Editar Conta" style="width: 200px; height: 30px; position: absolute; top: 45%; left: 5%; " >
        <input type="button" id="cadastraranuncio" value="Cadastrar An&uacute;ncio" style="width: 200px; height: 30px; position: absolute; top: 65%; left: 5%; " >
        <h4>
            Olá Usuário</br></br></br>  
            Anúncios
            </br>
            </br>
            <p1> ativos</br>
                pausados</br> 
            finalizados</br></br></p1>
            Comentários</br></br>
            <p1>
            Perguntas</br>
            Respostas
            </p1>
            

        </h4>
  
        
    </div>
    
</body>
</html>