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

@WebServlet("/artista/inserir")
public class ArtistaInserir extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/artista/listar.jsp";
	private static String ERRO = "/publico/erro.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArtistaServico as = new ArtistaServico();	
		Artista x = Instanciar.artista(request);
		try {
			as.inserir(x);
			List<Artista> itens = as.buscarTodosOrdenadosPorNome();
			// setou o atributo com apelido de itens
			request.setAttribute("itens", itens);
			// encaminhou
			request.getRequestDispatcher(DESTINO).forward(request, response);
		} catch (ServicoException e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher(ERRO).forward(request, response);
		}
	}
}