<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista de sobremesas</title>
</head>
<body>
	<h4>Listagem de Sobremesas</h4>
	
	<h4><a href="/sobremesa">Novo</a> | <a href="/cardapios">Cardapios</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${sobremesas}">
		<h5>${item} <a href="/sobremesa/${item.idCardapio}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>