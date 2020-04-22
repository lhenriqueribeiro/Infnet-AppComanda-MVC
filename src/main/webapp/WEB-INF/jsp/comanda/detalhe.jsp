<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Comanda</title>
</head>
<body>

	<form action="/comanda" method="post">
		Comanda: <input type="text" name="descricao">
		Mesa: <input type="text" name="mesa.descricao">
		
		<c:forEach var="p" items="${cardapios}">
			<h5>
			<input type="checkbox" value="${p.idCardapio}" name="cardapios"> ${p.descricao}
			</h5>
		</c:forEach>
		
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>