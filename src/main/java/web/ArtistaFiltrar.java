/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa: servlet responsavel por filtrar por nome os artistas
 Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */

package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Artista;
import servico.ArtistaServico;

@WebServlet("/artista/filtrar")
public class ArtistaFiltrar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/artista/listar.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArtistaServico as = new ArtistaServico();
		String nome = request.getParameter("busca");
		List<Artista> itens = as.buscarPorNome(nome);
		// setou o atributo com apelido de itens
		request.setAttribute("itens", itens);
		// encaminhou
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}
}