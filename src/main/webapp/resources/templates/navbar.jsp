<!--
Nome do autor: Ilton Batista da Silva Júnior
Data de criação do arquivo: 11/04/2019
Objetivo sucinto do programa: templete da navbar
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
-->

<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="<%=request.getContextPath()%>">Sistema
				de filmes</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="index.jsp">Inicio</a></li>
				<li><a href="<%=request.getContextPath()%>/artista/listar">Cadastro
						de artista</a></li>
				<li><a href="<%=request.getContextPath()%>/filme/pesquisar">Pesquisar
						filmes</a></li>
				<li><a href="<%=request.getContextPath()%>/participacao/filmes">Inserir
						participação</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>