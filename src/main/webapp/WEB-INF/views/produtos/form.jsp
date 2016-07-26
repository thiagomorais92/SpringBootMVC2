<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=UTF-8">
<title>Livros de Java,Android Ruby, PHP e muito mais</title>
</head>
<body>
	<form action="/casadocodigo/produtos/" method="POST">
		<div>
			<label>T�tutlo</label> <input type="text" name="titulo">
		</div>
		<div>
			<label>Descri��o</label>
			<textarea rows="10" name="descricao" cols="20"></textarea>
		</div>
		<div>
			<label>P�ginas</label> <input type="text" name="paginas">
		</div>
		<c:forEach  items="${tipos}" var="tipoPreco" varStatus="status">
			<div>
			<label>${tipoPreco}</label>
			<input type="text" name="precos[${status.index}].valor" >
			<input type="hidden" name="precos[${status.index}].tipo" value="${tipoPreco}">
		</div>
		</c:forEach>
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>