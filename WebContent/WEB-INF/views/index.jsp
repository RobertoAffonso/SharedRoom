<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Shared Room</title>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css\inicial.css">
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
        <p1>
            Anuncio 1 </br> <img src="foto.png" ></br></br></br>
             Anuncio 4</br>  <img src="foto.png" ></br></br></br>
            Anuncio 7 </br>  <img src="foto.png" ></br></br></br>   
        </p1>
        
        <p2>
           Anuncio 2  </br> <img src="foto.png" ></br></br></br>
            Anuncio 5 </br>  <img src="foto.png" ></br></br></br>
            Anuncio 8 </br>  <img src="foto.png" ></br></br></br>   
        </p2>
        
        <p3>
          Anuncio 3  </br>  <img src="foto.png" ></br></br></br>
            Anuncio 6  </br> <img src="foto.png" ></br></br></br>
             Anuncio 9 </br> <img src="foto.png" ></br></br></br>   
        </p3>
    </div>
    
</body>
</html>