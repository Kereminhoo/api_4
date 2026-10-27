<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Quiz Manga</title>
</head>
<body>

<h2>Quiz Manga</h2>

<p>Question : <c:out value="${question.text}" /></p>

<form>
    <c:forEach var="option" items="${question.options}">
        <label>
            <input type="radio" name="answer" value="${option}">
            <c:out value="${option}" />
        </label>
        <br>
    </c:forEach>

    <br>
    <button type="submit">Soumettre</button>
</form>

</body>
</html>