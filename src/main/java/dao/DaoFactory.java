/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa Class que cria uma participacao, um artista e um filme
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */
package dao;

import dao.impl.ArtistaDaoImpl;
import dao.impl.FilmeDaoImpl;
import dao.impl.ParticipacaoDaoImpl;

public class DaoFactory {
	
	public static ArtistaDao criarArtistaDao() {
		return new ArtistaDaoImpl();
	}
	
	public static FilmeDao criarFilmeDao() {
		return new FilmeDaoImpl();
	}
	
	public static ParticipacaoDao criarParticipacaoDao() {
		return new ParticipacaoDaoImpl();
	}
}
