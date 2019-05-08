/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa: Service que invoca o dao de Filme
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */

package servico;

import java.util.List;

import dao.DaoFactory;
import dao.FilmeDao;
import dao.Transaction;
import dominio.Filme;

public class FilmeServico {

	private FilmeDao dao;

	public FilmeServico() {
		dao = DaoFactory.criarFilmeDao();
	}

	public void inserirAtualizar(Filme x) {
		try {
			Transaction.begin();
			dao.inserirAtualizar(x);
			Transaction.commit();
		} catch (RuntimeException e) {
			if (Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void excluir(Filme x) {
		try {
			Transaction.begin();
			dao.excluir(x);
			Transaction.commit();
		} catch (RuntimeException e) {
			if (Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public Filme buscar(int cod) {
		return dao.buscar(cod);
	}

	public List<Filme> buscarTodos() {
		return dao.buscarTodos();
	}

	public List<Filme> buscarPorNomeAno(String nome, int anoMin, int anoMax) {
		return dao.buscarPorNomeAno(nome, anoMin, anoMax);
	}
}
