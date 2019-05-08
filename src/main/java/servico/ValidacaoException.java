/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa: Exce��o personalizada de valida��o
 Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
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
