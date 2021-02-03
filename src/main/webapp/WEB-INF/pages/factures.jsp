<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<%@include file="common/header.jsp"%>
</head>
<body>
 <%@include file="common/menu.jsp"%>
 
   <table>
        <thead>
	          <tr>
		        	<th>Numero</th>
		            <th>client</th>
		            <th>prix</th>
		            <th>date</th>		            
		            <th>Détail</th>
	          </tr>
        </thead>
        <tbody>
		 	<c:forEach items="${ listeFactures }" var="facture">
		        <tr>
		          	<td><c:out value="${ facture.numero }"></c:out></td>
		          	<td><c:out value="${ facture.client.nom }"></c:out></td>
		          	<td><c:out value="${ facture.prix }"></c:out> euros</td>
        			<td><c:out value="${ facture.date }"></c:out></td>		          	
		          	<td><a href="detailFacture?id=${ facture.id }">Détail de la facture</a></td>
		        </tr>
		 	</c:forEach>
        </tbody>
    </table>
   <%@include file="common/footer.jsp"%>
</body>
</html>