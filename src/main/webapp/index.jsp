<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/><br/>
<a href="Visite">Page count Servlet</a>
<br/><br/>
<a href="admin/stats">Voir les statistiques</a>

<hr>
<h3>Exercice API 4 : Test de la SecondeServelet</h3>


<p>
    <a href="SecondeServelet?nom=Kerem&age=21">Test avec Kerem, 21 ans (> 18)</a>
</p>
<p>
    <a href="SecondeServelet?nom=Samed&age=15">Test avec Samed, 15 ans (< 18)</a>
</p>

<p>
<h3>--------------------------------------------------------------------------------------</h3>
</p>

<br/>
<p>
    <a href="connection1">Test Connection Servlet 1</a>
</p>
<p>
    <a href="connection2">Test Connection Servlet 2</a>
</p>
<h3>--------------------------------------------------------------------------------------</h3>


<br/>
<a href="QueryStringSender.html">Query String Sender</a>
<br/><br/>
<a href="QueryStringReceiver">Query String Receiver</a>

<h3>--------------------------------------------------------------------------------------</h3>


<br/>
<a href="FormDataSender.html">Form Data Sender</a>
<br/><br/>
<a href="DataReceiver">Data Receiver</a>

<h3>--------------------------------------------------------------------------------------</h3>

<br/>
<a href="PokemonSelector.html">Form Pokemon Sender</a>





</body>
</html>

