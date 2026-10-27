<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Choisis ta faction</title>
</head>
<body>

<h2>Choisis ta faction dans Star Wars</h2>

<form action="${pageContext.request.contextPath}/faction" method="post">

    <label>
        <input type="radio" name="faction" value="jedi">
        Jedi
    </label>

    <br>

    <label>
        <input type="radio" name="faction" value="sith">
        Sith
    </label>

    <br><br>

    <button type="submit">Confirmer mon choix</button>

</form>

</body>
</html>