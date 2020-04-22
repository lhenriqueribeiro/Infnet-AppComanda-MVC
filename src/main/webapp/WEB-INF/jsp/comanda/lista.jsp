<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista de comandas</title>
</head>
<body>
	<h4>Listagem de Comandas</h4>
	
	<h4><a href="/comanda">Novo</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${comandas}">
		<h5>${item} <a href="/comanda/${item.idComanda}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>