<!--  
Nome do autor: Ilton Batista da Silva J�nior
Data de criação do arquivo: 10/04/2019 
Objetivo sucinto do programa: Template de p�gina padr�o de erro
Referencia ao enunciado/origem do exercicio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
-->

<!-- Corresponde a uma p�gina completa padr�o/modelo -->
<%@ page language="java" contentType="text/html; charsert=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Sistema de Filmes</title>
	<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
</head>

<body>

	<jsp:include page="/resources/templates/navbar.jsp"/>

	<!-- Conte�do da p�gina -->
	<div class="container">
		<div class="page-header">
			<h1>Erro!</h1>
		</div>
		<p class="lead">
		${msg}
		</p>
	</div>

	<jsp:include page="/resources/templates/rodape.jsp"/>

	<!-- Core JS (Corresponde ao n�cleo de processamento do JavaScript)-->
	<!-- Conta com as bibliotecas do bootstrap e do jquery -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>