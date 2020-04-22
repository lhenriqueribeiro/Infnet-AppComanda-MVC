<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Bebidas</title>
</head>
<body>
	<h4>Bebidas</h4>
	
	<h4><a href="/bebida">Novo</a> | <a href="/cardapios">Cardapios</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${bebidas}">
		<h5>${item} <a href="/bebida/${item.idCardapio}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>