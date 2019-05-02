
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
					<th>Ação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${itens}" var="x">
					<tr>
						<td>${x.codArtista}</td>
						<td>${x.nome}</td>
						<td>${x.nacionalidade}</td>
						<td>${x.cache}</td>
						<td>${x.nascimento}</td>
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
