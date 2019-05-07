/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa: Service que invoca o dao de Participação
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */

package servico;

import java.util.ArrayList;
import java.util.List;

import dao.DaoFactory;
import dao.ParticipacaoDao;
import dao.Transaction;
import dominio.Participacao;

public class ParticipacaoServico {

	private ParticipacaoDao dao;
	
	public ParticipacaoServico() {
		dao = DaoFactory.criarParticipacaoDao();
	}

	public void validar(Participacao x) throws ValidacaoException {
		List<String> erros = new ArrayList<>();
		
		if (x.getPersonagem()==null) {
			erros.add("Favor preencher o campo personagem");
		}
		if (x.getArtista()==null) {
			erros.add("Favor informar um artista");
		}
		if (x.getFilme()==null) {
			erros.add("Favor informar um filme");
		}
		if (x.getDesconto()==null) {
			erros.add("Favor preencher um valor valido para o desconto");
		}
		
		if (!erros.isEmpty()) {
			throw new ValidacaoException("Erro de validação", erros);
		}
	}

	public void inserir(Participacao x) throws ServicoException {
		Participacao aux = dao.buscarExato(x.getPersonagem(), x.getArtista(), x.getFilme());
		if (aux != null) {
			throw new ServicoException("Ja existe esse mesmo personagem cadastrado para o"+
				" artista " + x.getArtista().getNome() + " no filme " + x.getFilme().getTitulo(), 1);
		}
		
		try {
			Transaction.begin();
			dao.inserirAtualizar(x);
			Transaction.commit();
		}
		catch (RuntimeException e) {
			if (Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void atualizar(Participacao x) throws ServicoException {
		Participacao aux = dao.buscarExatoDiferente(x.getCodParticipacao(), x.getPersonagem(), x.getArtista(), x.getFilme());
		if (aux != null) {
			throw new ServicoException("Ja existe esse mesmo personagem cadastrado para o"+
				" artista " + x.getArtista().getNome() + " no filme " + x.getFilme().getTitulo(), 1);
		}
		
		try {
			Transaction.begin();
			dao.inserirAtualizar(x);
			Transaction.commit();
		}
		catch (RuntimeException e) {
			if (Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void excluir(Participacao x) {
		try {
			Transaction.begin();
			dao.excluir(x);
			Transaction.commit();
		}
		catch (RuntimeException e) {
			if (Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public Participacao buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<Participacao> buscarTodos() {
		return dao.buscarTodos();
	}
}