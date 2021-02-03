<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Ajout d'article</title>
    <%@include file="common/header.jsp"%>
</head>
<body>
	 <%@include file="common/menu.jsp"%>
	 
		<form action="" method="post">
		 <label for="nomArticle">Nom </label> <input type="text" name="nomArticle" />
		 <label for="prixArticle">Prix </label> <input type="text" name="prixArticle" />
		 
		 <input class="waves-effect waves-light btn" type="submit" value="Valider">
		</form>
	 
	
	   <%@include file="common/footer.jsp"%> 
</body>
</html>