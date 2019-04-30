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
