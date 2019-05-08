/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa: servlet responsavel por remover um artista
 Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */
package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Artista;
import servico.ArtistaServico;

@WebServlet("/artista/remover")
public class ArtistaRemover extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/artista/confirmarExclusao.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArtistaServico as = new ArtistaServico();

		int cod = Integer.parseInt(request.getParameter("cod"));
		Artista art = as.buscar(cod);

		// setou o atributo com apelido de itens
		request.setAttribute("item", art);
		// encaminhou
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}
}