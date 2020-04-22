<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Pestiscos</title>
</head>
<body>
	<h4>Pestiscos</h4>
	
	<h4><a href="/petisco">Novo</a> | <a href="/cardapios">Cardapios</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${petiscos}">
		<h5>${item} <a href="/livro/${item.idCardapio}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>