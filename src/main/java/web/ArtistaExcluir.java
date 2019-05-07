/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa: servlet que e responsavel por abrir a pagina que apaga um artista
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
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

@WebServlet("/artista/excluir")
public class ArtistaExcluir extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/artista/listar.jsp";
	private static String ERRO = "/publico/erro.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArtistaServico as = new ArtistaServico();
		int cod = Integer.parseInt(request.getParameter("cod"));
		Artista art = as.buscar(cod);
		
		try {
			//Excluir
			as.excluir(art);
			
			List<Artista> itens = as.buscarTodosOrdenadosPorNome();
			// setou o atributo com apelido de itens
			request.setAttribute("itens", itens);
			// encaminhou
			request.getRequestDispatcher(DESTINO).forward(request, response);
		} catch (ServletException e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher(ERRO).forward(request, response);
		}
	}
}