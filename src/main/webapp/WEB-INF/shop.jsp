
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Boutique de l'aventurier</title>
</head>
<body>

<h1>Boutique de l'aventurier</h1>

<form action="${pageContext.request.contextPath}/shop" method="post">

    <h2>Choisissez votre objet :</h2>


    <c:forEach var="item" items="${items}">
        <label>
            <input type="radio" name="item" value="${item.name}">
            <c:out value="${item.name}"/> -
            <c:out value="${item.price}"/> rubis
        </label>
        <br>
    </c:forEach>


    <br>

    <label for="rubies">Combien de rubis possédez-vous ?</label>
    <input type="text" id="rubies" name="rubies">

    <br><br>

    <button type="submit">Acheter</button>

</form>

<c:if test="${not empty message}">
    <h2>Résultat</h2>
    <p><c:out value="${message}"/></p>
</c:if>

</body>
</html>
