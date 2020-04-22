<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Petisco</title>
</head>
<body>

	<form action="/petisco" method="post">
		Descrição: <input type="text" name="descricao">
		Título: <input type="text" name="titulo">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>