<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Section Articles</title>
<%@include file="common/header.jsp"%>
</head>
<body>
 <%@include file="common/menu.jsp"%>
 
   <table>
        <thead>
          <tr>
            <th>Nom</th>
            <th>Prix</th>
        	<th>Numéro</th>            
          </tr>
        </thead>

        <tbody>
        	<% int i = 1; %>
		 	<c:forEach items="${ listeArticles }" var="article">
		        <tr>
		          	<td><c:out value="${ article.nom }"></c:out></td>
		          	<td><c:out value="${ article.prix }"></c:out> euros</td>
		        	<td><% out.println(i); %></td>		          	
		        </tr>
		        <% i++; %>
		 	</c:forEach>
        </tbody>
    </table>
 	<br /> <br />
 
 	<a class="waves-effect waves-light btn" href="ajouter/article">Formulaire d'ajout d'article</a>

   <%@include file="common/footer.jsp"%> 

</body>
</html>