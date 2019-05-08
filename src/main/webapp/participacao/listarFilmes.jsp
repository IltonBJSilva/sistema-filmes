<!--
Nome do autor: Ilton Batista da Silva Júnior
Data de criação do arquivo: 11/04/2019
Objetivo sucinto do programa: pagina jsp form que lista os filmes apos inserir uma participação.
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Filmes</title>
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css"
	rel="stylesheet">
</head>

<body>

	<jsp:include page="/resources/templates/navbar.jsp" />

	<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>Escolha um filme</h1>
		</div>

		<table class="table">
			<thead>
				<tr>
					<th>Codigo</th>
					<th>Titulo</th>
					<th>Duracao</th>
					<th>Ano</th>
					<th>Ação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${itens}" var="x">
					<tr>
						<td>${x.codFilme}</td>
						<td>${x.titulo}</td>
						<td>${x.duracao}</td>
						<td>${x.ano}</td>
						<td><a href="<%=request.getContextPath()%>/participacao/novo?codFilme=${x.codFilme}" 
						class="btn btn-primary btn-xs">Escolher</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<jsp:include page="/resources/templates/rodape.jsp"></jsp:include>

	<!-- Core JS -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>