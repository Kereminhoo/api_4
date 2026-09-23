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
<a href="PageServlet">Page count Servlet</a>

<hr>
<h3>Exercice API 4 : Test de la SecondeServelet</h3>


<p>
    <a href="SecondeServelet?nom=Kerem&age=21">Test avec Kerem, 21 ans (> 18)</a>
</p>
<p>
    <a href="SecondeServelet?nom=Samed&age=15">Test avec Samed, 15 ans (< 18)</a>
</p>

</body>
</html>