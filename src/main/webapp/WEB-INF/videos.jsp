<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
  <title>Vidéos de Squeezie</title>
</head>
<body>

<h2>Vidéos de Squeezie</h2>

<ol>
  <c:forEach var="video" items="${videos}">
    <li>
      <a href="<c:out value='${video.url}' />" target="_blank">
        <c:out value="${video.title}" />
      </a>
      -
      <c:out value="${video.description}" />
    </li>
  </c:forEach>
</ol>

</body>
</html>