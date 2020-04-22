<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Mesas</title>
</head>
<body>
	<h4>Lista de Mesas</h4>
	
	<h4><a href="/mesa">Novo</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${mesas}">
		<h5>${item} <a href="/mesa${item.idMesa}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>