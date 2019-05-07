/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa: servlet responsavel por mostrar um tela para inserir anoMin e anoMax e titulo do filme e realizar a pesquisa
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

import dominio.Filme;
import servico.FilmeServico;

@WebServlet("/filme/resultado")
public class FilmeResultado extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/filme/resultadoBusca.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		FilmeServico fs = new FilmeServico();
		String titulo = request.getParameter("titulo");
		
		int anoMin = Integer.parseInt(request.getParameter("anoMin"));
		int anoMax = Integer.parseInt(request.getParameter("anoMax"));
		
		List<Filme> itens = fs.buscarPorNomeAno(titulo, anoMin, anoMax);
		
		// setou o atributo com apelido de item
		request.setAttribute("itens", itens);
		// encaminhou
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}
}