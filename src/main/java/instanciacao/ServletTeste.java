/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa: class que testa os metodos e as exceções
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */
package instanciacao;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Filme;
import servico.ArtistaServico;
import servico.FilmeServico;
import servico.ParticipacaoServico;

@WebServlet("/ServletTeste")
public class ServletTeste extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.parse("01/01/2000");

			ArtistaServico as = new ArtistaServico();
			FilmeServico fs = new FilmeServico();
			ParticipacaoServico ps = new ParticipacaoServico();
			/*
			 * //Tentando inserir um artista com nome repetido
			 * 
			 * Artista a1 = new Artista(null, "Leonardo Di Caprio", "EUA", new
			 * BigDecimal("10000000.00"),sdf.parse("11/11/1971")); try { as.inserir(a1);
			 * response.getWriter().append("Inserido "+a1.getNome()); }finally {
			 * 
			 * } }catch() { response.getWriter().append("Erro: "+ e.getMessage()+"\n"); }
			 */
			/*
			 * //Tentando atualizar Artista Artista a1 = as.buscar(1);
			 * response.getWriter().append("FORA DO TRY\n"); try {
			 * a1.setCache(a1.getCache().add(new BigDecimal("4.00"))); as.Atualizar(a1);
			 * response.getWriter().append("Artista atualizado!\n"); }
			 * catch(ServicoException e) { response.getWriter().append(e.getMessage() +
			 * "\nCATCH \n"); } }
			 */

			/*
			 * // Tentando atualizar o nome de um artista(2) Artista a2 = as.buscar(2); try
			 * { a2.setNome("Peter Parker"); as.Atualizar(a2);
			 * response.getWriter().append("Artista atualizado\n"); }catch(ServicoException
			 * e) { response.getWriter().append(e.getMessage()+"\n");
			 * 
			 * }
			 */

			/*
			 * //Tentando inserir uma participação não repetida: Filme f1 = fs.buscar(2);
			 * Artista a1 = as.buscar(1);
			 * 
			 * Participacao p = new Participacao(null, "Joaozinho", new
			 * BigDecimal("0.00"),f1,a1); try { ps.inserir(p);
			 * response.getWriter().append("Participação inserida!!\n");
			 * }catch(ServicoException e) { response.getWriter().append(e.getMessage()); }
			 */

			/*
			 * //Tentando inserir uma participação repetida: Filme f1 = fs.buscar(2);
			 * Artista a1 = as.buscar(1);
			 * 
			 * Participacao p = new Participacao(null, "Jack Dawson", new
			 * BigDecimal("0.00"),f1,a1); try { ps.inserir(p);
			 * response.getWriter().append("Participação inserida!!\n");
			 * }catch(ServicoException e) { response.getWriter().append(e.getMessage()); }
			 */

			// Realizar a consulta de filmes:
			List<Filme> lista = fs.buscarPorNomeAno("a", 1997, 2010);
			for (Filme x : lista) {
				response.getWriter().append(x + "\n");
				response.getWriter().append("\n\n");
				as.buscarTodos();
				response.getWriter().append("\n\n");
				fs.buscarTodos();
				response.getWriter().append("\n\n");
				ps.buscarTodos();
			}

		} catch (Exception e) {
			response.getWriter().append(e.getMessage() + "CATCH 2 \n");

		}
	}
}