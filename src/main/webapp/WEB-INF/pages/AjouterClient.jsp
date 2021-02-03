<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un Client</title>
</head>
<body>
 <%@include file="common/menu.jsp"%>
 <form action="" method="post">
 <label for="nomClient">Nom </label> <input type="text" name="nomClient" />
 <label for="adresseClient">Adresse </label> <input type="text" name="adresseClient" />
 
 <input class="waves-effect waves-light btn" type="submit" value="Valider">
</form>
  <%@include file="common/footer.jsp"%> 
</body>
</html>