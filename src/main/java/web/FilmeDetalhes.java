/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa: servlet responsavel por mostrar os detalhes de um filme
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */

package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Filme;
import servico.FilmeServico;

@WebServlet("/filme/detalhes")
public class FilmeDetalhes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/filme/detalhes.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		FilmeServico fs = new FilmeServico();
		int cod = Integer.parseInt(request.getParameter("cod"));
		Filme filme = fs.buscar(cod);
		// setou o atributo com apelido de item
		request.setAttribute("item", filme);
		// encaminhou
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}
}