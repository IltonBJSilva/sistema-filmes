package web;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Artista;
import dominio.Filme;
import dominio.Participacao;
import servico.ArtistaServico;
import servico.FilmeServico;
import servico.ParticipacaoServico;
import servico.ServicoException;

@WebServlet("/ServletTeste")
public class ServletTeste extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			sdf.parse("01/01/200");
			
			ArtistaServico as = new ArtistaServico();
			FilmeServico fs = new FilmeServico();
			ParticipacaoServico ps = new ParticipacaoServico();
			
			//Tentando inserir um artista com nome repetido
		
			Artista a1 = new Artista(null, "Leonardo Di Caprio", "EUA", new BigDecimal("10000000.00"),sdf.parse("11/11/1971"));		
			try {
				as.inserir(a1);
				response.getWriter().append("Inserido "+a1.getNome());
			}finally {
				
			}
		}catch(ServicoException e) {
			response.getWriter().append("Erro: "+ e.getMessage()+"\n");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
