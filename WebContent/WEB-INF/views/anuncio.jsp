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
            Reputa��o</br><input type="text" id="reputacao"></br></br>
            Localiza��o</br><input type="text" id="localizacao"></br></br>
            Data de Cria��o</br><input type="text" id="datadecriacao"></br></br>
            Endere�o</br><input type="text" id="endereco"></br></br>
            Comodidades</br><input type="text" id="comodidades"></br></br>
            �rea Total</br><input type="text" id="areatotal"></br></br>
            </h7> 
        </h6>
        <h4>
            Localiza��o</br></br></br></br></br></br>
            Pre�o</br></br></br></br></br></br>
            Comodidades</br></br></br></br></br></br>
            �rea Total
        </h4>
        <h5>
            <select> 
             <option value="Bras�lia">Bras�lia</option>
             <option value="S�o Paulo">S�o Paulo</option>
             <option value="Rio de Janeiro">Rio de Janeiro</option>
             <option value="Goi�nia">Goi�nia</option>
             <option value="Fortaleza">Fortaleza</option>
            </select>
            </br></br></br></br></br></br></br></br></br>
            <select> 
             <option value="at� 1000">at� 1000</option>
             <option value="1001 at� 3000">1001 at� 3000</option>
             <option value="3001 ou mais">3001 ou mais</option>
            </select>
                </br></br></br></br></br></br></br></br></br>
                    <select> 
             <option value="Geladeira">Geladeira</option>
             <option value="Banheira Particular">Banheira Particular</option>
             <option value="Seguran�a Particular">Seguran�a Particular</option>
             <option value="Caf� da Manh�">Caf� da Manh�</option>
             <option value="Almo�o">Almo�o</option>
             <option value="Lanche">Lanche</option>
             <option value="Janta">Janta</option>
            </select>
                </br></br></br></br></br></br></br></br></br>
                      <select> 
             <option value="at� 50m">at� 50m</option>
             <option value="51m at� 150m">B51m at� 150m</option>
             <option value="151m ou mais">151m ou mais</option>
            </select>
                
        </h5>

        <h3>
          Anuncio x  
        </h3>
        <p1>
            Pre�o a combinar
        </p1>
        
        <p2>
            Consultar Disponibilidade entre</br>
            <input type="date" id="data1">&nbsp; e&nbsp; 
            <input type="date" id="data2"></br></br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <input type="button" id="consultar" value="Consultar" onclick="">
        </p2>
        <p3>
            Descri��o:</br>
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