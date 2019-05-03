<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tecnofilmes &middot; Twitter Bootstrap</title>

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
			<h1>Tecnofilmes para você</h1>
		</div>
		<p class="lead">
			O melhor filme com a melhor qualidade do mercado para assistir
			<code>INICIAR</code>
			não vai querer largar e temos lista de artista e suas participações
			veja oque cada um deles foi em cada filme e cadastre um novo
		</p>
		<p>
			acesse <a href="https://static2.comicvine.com/uploads/original/3/39027/4450728-url.png" target="_blank"> e veja oque deseja</a> temos lista
			de artistas.
		</p>
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
