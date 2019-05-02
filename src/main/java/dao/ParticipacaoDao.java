/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa:
 Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */

package dao;

import java.util.List;

import dominio.Artista;
import dominio.Filme;
import dominio.Participacao;

public interface ParticipacaoDao {

	public void inserirAtualizar(Participacao x);
	public void excluir(Participacao x);
	public Participacao buscar(int cod);
	public List<Participacao> buscarTodos();
	
	public Participacao buscarExato(String personagem, Artista artista, Filme filme);
	public Participacao buscarExatoDiferente(Integer codigo, String personagem, Artista artista, Filme filme);

}
