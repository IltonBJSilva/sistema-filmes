/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa:  Interface DAO que apresenta os m�todos obritat�rios em rela��o a classe Filme;
 Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */
package dao;

import java.util.List;

import dominio.Filme;

public interface FilmeDao {

	public void inserirAtualizar(Filme x);
	public void excluir(Filme x);
	public Filme buscar(int cod);
	public List<Filme> buscarTodos();
	public List<Filme> buscarPorNomeAno(String nome, int anoMin, int anoMax);

}