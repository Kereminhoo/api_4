<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Playlist</title>
</head>
<body>

<h2><c:out value="${playlist.name}" /></h2>

<p>
    Propriétaire :
    <c:out value="${playlist.owner}" />
</p>

<c:choose>

    <c:when test="${empty playlist.songs}">
        <p>Cette playlist est vide</p>
    </c:when>

    <c:otherwise>
        <ol>
            <c:forEach var="song" items="${playlist.songs}">

                <li>
                    <c:if test="${song.favorite}">⭐</c:if>

                    <a href="<c:out value='${song.url}' />" target="_blank">
                        <c:out value="${song.title}" />
                    </a>

                    -
                    <c:out value="${song.artist}" />
                </li>

            </c:forEach>
        </ol>
    </c:otherwise>

</c:choose>

</body>
</html>