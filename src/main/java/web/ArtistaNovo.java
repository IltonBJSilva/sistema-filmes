/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa: servlet que e responsavel por inserir um novo artista
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */

package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Artista;

@WebServlet("/artista/novo")
public class ArtistaNovo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/artista/formInserir.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		// setou o atributo com apelido de itens
		request.setAttribute("item",  new Artista());
		// encaminhou
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}
}