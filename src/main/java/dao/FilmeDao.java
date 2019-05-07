/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa:  Interface DAO que apresenta os métodos obritatórios em relação a classe Filme;
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
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