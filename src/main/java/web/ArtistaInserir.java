/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa: servlet que e responsavel por inserir um novo artista ao banco de dados
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
import servico.ServicoException;
import servico.ValidacaoException;

@WebServlet("/artista/inserir")
public class ArtistaInserir extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/artista/listar.jsp";
	private static String FORM= "/artista/formInserir.jsp";
	private static String ERRO = "/publico/erro.jsp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArtistaServico as = new ArtistaServico();	
		Artista x = Instanciar.artista(request);
		try {
			//Antes de inserir precisa validar
			as.validar(x);
			//Inserindo um artista
			as.inserir(x);
			List<Artista> itens = as.buscarTodosOrdenadosPorNome();
			// setou o atributo com apelido de itens
			request.setAttribute("itens", itens);
			// encaminhou
			request.getRequestDispatcher(DESTINO).forward(request, response);
		} catch (ServicoException e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher(ERRO).forward(request, response);
		} catch (ValidacaoException e) {
			request.setAttribute("erros", e.getErros());
			request.setAttribute("item", x);
			request.getRequestDispatcher(FORM).forward(request, response);
		}
	}
}