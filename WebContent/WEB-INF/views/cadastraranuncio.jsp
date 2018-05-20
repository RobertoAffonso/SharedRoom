<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Shared Room</title>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css\cadastraranuncio.css">
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
<input type="text" value=""name="q" id="s" onfocus="defaultInput(this)" onblur="clearInput(this)" />
<input type="submit" id="searchsubmit" value="Pesquisar"style="width: 200px; height: 30px; border: none; color: #fff; background: #1E90FF;" />
</form>
<h1>
Shared Room
</h1>
    
    <div>
<form1 action="/sharedroom/iniciandoCadastro" method="POST"
enctype="multipart/form-data">
<img src="foto.png" id="s1"></br</br></br></br</br> Fotos <input  requeried="required" type="file" name="file"><br></br></br> 
Descrição:
</br</br></br></br</br></br>
       <textarea required="required"  cols="30" rows="5" maxlength="1000"  name="texto"> </textarea>
       </br</br></br> </br</br></br>
       Localiza&ccedil;&atilde;o:
       <select required="required"> 
             <option value="Brasília">Brasília</option>
             <option value="São Paulo">São Paulo</option>
             <option value="Rio de Janeiro">Rio de Janeiro</option>
             <option value="Goiânia">Goiânia</option>
             <option value="Fortaleza">Fortaleza</option>
       </select></br></br>
       Endereço: <input required="required" type="text" >  
       Complemento:  <input required="required" type="text" >
       Número:  <input required="required" type="number"></br></br>
       <input type="checkbox" id="geladeira" value="Geladeira"> Geladeira
       <input type="checkbox" id="banheiro" value="Banheiro Particular"> Banheiro Particular
       <input type="checkbox" id="segunraca" value="Seguran&ccedil;a Particular">Seguran&ccedil;a Particular</br></br>
       Área Total em M²: <input type="number" id="areatotaal"></br></br>
<input type="submit" value="Cadastrar An&uacute;ncio">
</form1>

    </div>
    
</body>
</html>