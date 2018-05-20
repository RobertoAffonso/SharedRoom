<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Shared Room</title>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css\cadastrarcartao.css">
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
        <h3> 
            <p1>
                Adicione um Cartão</br></br>
            </p1>
            Tipo de Cartão</br> <select>
  <option value="Visa">Visa</option>
  <option value="Mastercard">Mastercard</option>
  <option value="American Express">American Express</option>
  <option value="Elo">Elo</option>
</select></br>
<p2>
    Número do Cartão</br> <input type="number" id="ncartao"  maxlength="16px" minlength="13">
</p2>

</br>

<p4>
    Código de Segurança </br>
    <input size="3px" type="number" id="codseg"  maxlength="3" minlength="3"> 
</p4>
</br>

<p5>
    Data de Validade </br>
    <input type="date" id="datavalidade" > 
</p5>
</br>
<p3>
    Nome do Titular </br>
    <input size="40px" type="text" id="titular" > 
</p3>
</br></br>
<input type="submit" id="vai" value="Enviar">
        </h3>
    </div>
    
</body>
</html>