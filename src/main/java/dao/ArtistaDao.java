/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa:  Interface DAO que apresenta os métodos obritatórios em relação a classe Artistapackage dao;
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */

package dao;

import java.util.List;

import dominio.Artista;

public interface ArtistaDao {

	public void inserirAtualizar(Artista x);
	public void excluir(Artista x);
	
	public List<Artista> buscarTodos();
	public List<Artista> buscarTodosOrdenadosPorNome();
	public List<Artista> buscarPorNome(String trecho);

	public Artista buscaNomeExato(String nome);
	public Artista buscaNomeExatoDiferente(Integer codigo, String nome);
	public Artista buscar(int cod);

}
