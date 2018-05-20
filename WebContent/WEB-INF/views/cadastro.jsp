<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Shared Room</title>
<link rel="stylesheet" href="css\cadastro.css">
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
  Nome Completo: <input  required="required" type="text" minlength="3" name="nomecompleto"><br>
  Data de Nascimento: <input required="required" type="date" name="datadenascimento"><br>
  E-mail: <input required="required" type="email" name="email"><br>
  CNPJ(Opicional):: <input required="required" type="number" minlength="14" maxlength="14" name="cnpj"><br>
  CPF:: <input required="required" type="number" minlength="11" maxlength="11"  name="cpf"><br>
  RG: <input required="required" type="number" minlength="4" maxlength="16" name="rg"><br>
  Telefone fixo: <input required="required" type="number" minlength="10" maxlength="13" name="telefonefixo"><br>
  Telefone m&oacute;vel: <input required="required" type="number" minlength="11" maxlength="13" name="telefonemovel"><br>
  Senha: <input required="required" type="password" name="senha"><br>
  Confirmar Senha: <input required="required" type="password" name="confirmarsenha"><br>
 <br/>
  <input type="submit" value="Cadastrar"  onclick="" style="width: 200px; height: 30px" >
</h3> 
<h4>
<form action="upload.java" method="POST"
enctype="multipart/form-data">
Arquivo: <input type="file" name="file"><br>
       </br></br></br></br></br>
       <img style="position: absolute; top: 30%; left: 1%;" src="foto.png" id="s1">  </a>
<input type="submit" value="Enviar">
</form>
</h4>
</body>
</html>