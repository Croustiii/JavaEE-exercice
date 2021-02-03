<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="common/header.jsp"%>
</head>
<body>

 <%@include file="common/menu.jsp"%>
 
  <table>
  
        <thead>
          <tr>
              <th>Nom</th>
              <th>Adresse</th>
          </tr>
        </thead>



        <tbody>
		 	<c:forEach items="${ listeClients }" var="client">
		        <tr>
		          <td><c:out value="${ client.nom }"></c:out></td>
		          <td><c:out value="${ client.adresse }"></c:out></td>
		        </tr>
		 	</c:forEach>
        </tbody>
    </table>
 	<br /> <br />
 	
 	
 	<a class="waves-effect waves-light btn" href="ajouter/client">Ajouter un client</a>


   <%@include file="common/footer.jsp"%> 
</body>
</html>