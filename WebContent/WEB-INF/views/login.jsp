<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Shared Room</title>
<link rel="stylesheet" href="css\login.css">
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
<a href=""style="color: blue;">Anuncie Aqui</a>
</h2>
<h1>
Shared Room
</h1>
<form  method="get" id="searchform" action="/search/">
<input type="text" value=""name="q" id="s" onfocus="defaultInput(this)" onblur="clearInput(this)" />
<input type="submit" id="searchsubmit" value="Pesquisar"style="width: 200px; height: 30px; border: none; color: #fff; background: #1E90FF;" />
</form>

<div>
</div>
<h3>
  E-mail: <input type="email" name="lname"><br>
  Senha: <input type="password" name="lname"><br>
 <br/>
  <input type="submit" value="Login"style="width: 200px; height: 30px" >
  <input type="submit" value="Cadastre-se" onclick="location. href='cadastro.html'" style="width: 200px; height: 30px" >
</h3> 
<h4>
<a href="recuperarsenha.html"style="color: blue;">Esqueceu sua senha?</a>
</h4> 
</body>
</html>