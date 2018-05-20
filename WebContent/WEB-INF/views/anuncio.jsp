<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Shared Room</title>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css\anuncio.css">
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
        <h6>
            Detalhes:</br></br>
            <h7>
                Anunciante</br><input type="text" id="anunciante"></br></br>
            Reputação</br><input type="text" id="reputacao"></br></br>
            Localização</br><input type="text" id="localizacao"></br></br>
            Data de Criação</br><input type="text" id="datadecriacao"></br></br>
            Endereço</br><input type="text" id="endereco"></br></br>
            Comodidades</br><input type="text" id="comodidades"></br></br>
            Área Total</br><input type="text" id="areatotal"></br></br>
            </h7> 
        </h6>
        <h4>
            Localização</br></br></br></br></br></br>
            Preço</br></br></br></br></br></br>
            Comodidades</br></br></br></br></br></br>
            Área Total
        </h4>
        <h5>
            <select> 
             <option value="Brasília">Brasília</option>
             <option value="São Paulo">São Paulo</option>
             <option value="Rio de Janeiro">Rio de Janeiro</option>
             <option value="Goiânia">Goiânia</option>
             <option value="Fortaleza">Fortaleza</option>
            </select>
            </br></br></br></br></br></br></br></br></br>
            <select> 
             <option value="até 1000">até 1000</option>
             <option value="1001 até 3000">1001 até 3000</option>
             <option value="3001 ou mais">3001 ou mais</option>
            </select>
                </br></br></br></br></br></br></br></br></br>
                    <select> 
             <option value="Geladeira">Geladeira</option>
             <option value="Banheira Particular">Banheira Particular</option>
             <option value="Segurança Particular">Segurança Particular</option>
             <option value="Café da Manhã">Café da Manhã</option>
             <option value="Almoço">Almoço</option>
             <option value="Lanche">Lanche</option>
             <option value="Janta">Janta</option>
            </select>
                </br></br></br></br></br></br></br></br></br>
                      <select> 
             <option value="até 50m">até 50m</option>
             <option value="51m até 150m">B51m até 150m</option>
             <option value="151m ou mais">151m ou mais</option>
            </select>
                
        </h5>

        <h3>
          Anuncio x  
        </h3>
        <p1>
            Preço a combinar
        </p1>
        
        <p2>
            Consultar Disponibilidade entre</br>
            <input type="date" id="data1">&nbsp; e&nbsp; 
            <input type="date" id="data2"></br></br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <input type="button" id="consultar" value="Consultar" onclick="">
        </p2>
        <p3>
            Descrição:</br>
            <input style="width: 400px; height:150px;" type="fieldset">
        </p3>
        
        <p4>
            <img src="foto2.png">
        </p4>
        
        <p5>
            <img src="foto3.png">
        </p5>
      
        <p6>
            <img src="foto3.png">
        </p6>
            
        <p7>
            <img src="foto3.png">
        </p7>
        <p>
            <input type="button" id="contado" value="Entrar em Contato" onclick="">           
</p>
    </div>
    
</body>
</html>