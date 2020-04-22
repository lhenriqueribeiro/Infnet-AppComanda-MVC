<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bebida</title>
</head>
<body>

	<form action="/bebida" method="post">
		Descrição: <input type="text" name="descricao">
		Nível: <input type="text" name="nivel">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>