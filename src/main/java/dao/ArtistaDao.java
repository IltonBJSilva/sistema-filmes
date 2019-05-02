/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa:  Interface DAO que apresenta os m�todos obritat�rios em rela��o a classe Artistapackage dao;
 Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
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
