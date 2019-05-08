<!--
Nome do autor: Ilton Batista da Silva J�nior
Data de cria��o do arquivo: 11/04/2019
Objetivo sucinto do programa: pagina jsp que lista todo os artistas.
Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Artista &middot; Twitter Bootstrap</title>

<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>	/resources/css/sticky-footer-navbar.css"
	rel="stylesheet">
</head>
<body>

	<jsp:include page="/resources/templates/navbar.jsp"></jsp:include>

	<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>Artista</h1>
		</div>

		<div class="row">
			<div class="col-sm-2">
				<form class="navbar-form" action="<%=request.getContextPath()%>/artista/novo">
					<button type="submit" class="btn btn-primary">Inserir um
						novo</button>
				</form>
			</div>

			<div class="col-sm-6">
				<form class="navbar-form" action="<%=request.getContextPath()%>/artista/filtrar">
					<div class="form-group">
						<input type="text" name="busca" placeholder="Digite um nome" class="form-control"/>
					</div>
					<button type="submit" class="btn btn-sucess">Filtrar</button>
				</form>
			</div>
		</div>

		<table class="table">
			<thead>
				<tr>
					<th>Codigo</th>
					<th>Nome</th>
					<th>Nacionalidade</th>
					<th>Cache</th>
					<th>nascimento</th>
					<th>A��o</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${itens}" var="x">
					<tr>
						<td>${x.codArtista}</td>
						<td>${x.nome}</td>
						<td>${x.nacionalidade}</td>
						<td><fmt:setLocale value="pt_BR"/><fmt:formatNumber type="currency" value="${x.cache}"></fmt:formatNumber> </td>
						<td><fmt:formatDate type="date" pattern="dd/MM/yyyy" value="${x.nascimento}"/> </td>
						<td><a href="<%=request.getContextPath()%>/artista/editar?cod=${x.codArtista}" class="btn btn-primary btn-xs"> Editar </a> 
						<a href="<%=request.getContextPath()%>/artista/remover?cod=${x.codArtista}" class="btn btn-danger btn-xs"> Excluir </a> </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<jsp:include page="/resources/templates/rodape.jsp"></jsp:include>
	<!-- CORE JS -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"
		integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ"
		crossorigin="anonymous"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>
