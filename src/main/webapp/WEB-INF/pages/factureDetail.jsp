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
 
	<h3>Facture <c:out value ="${ facture.numero }"></c:out></h3>
	<h3>Date <c:out value ="${ facture.date }"></c:out></h3>
	<h3>Prix <c:out value ="${ facture.prix }"></c:out></h3>
	<h2>Client associé</h2>
	<h4>Nom : <c:out value ="${ facture.client.nom }"></c:out></h4>
	<h4>Adresse : <c:out value ="${ facture.client.adresse }"></c:out></h4>
	
  <table>
  
        <thead>
          <tr>
              <th>Nom de l'article</th>
              <th>Qte</th>
              <th>Prix</th>
          </tr>
        </thead>
        
        <tbody>
		 	<c:forEach items="${ facture.lignesFacture }" var="ligneFacture">
		        <tr>
		          <td><c:out value="${ ligneFacture.article.nom }"></c:out></td>
		          <td><c:out value="${ ligneFacture.qte }"></c:out></td>
		          <td><c:out value="${ ligneFacture.prix }"></c:out></td>
		        </tr>
		 	</c:forEach>
        </tbody>
    </table>



   <%@include file="common/footer.jsp"%> 


</body>
</html>