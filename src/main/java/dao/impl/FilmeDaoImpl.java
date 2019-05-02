/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa:
 Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */
package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.FilmeDao;
import dominio.Filme;

public class FilmeDaoImpl implements FilmeDao {

	private EntityManager em;
	
	public FilmeDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Filme x) {
		if(x.getCodFilme() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(Filme x) {
		x = em.merge(x);
		em.remove(x);
	}

	@Override
	public Filme buscar(int cod) {
		return em.find(Filme.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Filme> buscarTodos() {
		String jpql = "SELECT x FROM Filme x";
		Query query = em.createNamedQuery(jpql); 
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Filme> buscarPorNomeAno(String nome, int anoMin, int anoMax){
		String jpql = "SELECT x FROM Filme x WHERE x.titulo LIKE :p1 AND x.ano >= :p2 AND x.ano <= :p3";
		Query query = em.createQuery(jpql);
		query.setParameter("p1", "%"+nome+"%");
		query.setParameter("p2", anoMin);
		query.setParameter("p3", anoMax);
		return query.getResultList();
	}
	
	

}
