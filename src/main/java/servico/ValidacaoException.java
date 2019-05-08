/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa: Exceção personalizada de validação
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */
package servico;

import java.util.List;

public class ValidacaoException extends Exception {
	private static final long serialVersionUID = 1L;

	private List<String> erros;

	public ValidacaoException(String msg, List<String> erros) {
		super(msg);
		this.erros = erros;
	}

	public List<String> getErros() {
		return erros;
	}
}
