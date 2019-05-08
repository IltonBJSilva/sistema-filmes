/*
 Nome do autor: Ilton Batista da Silva J�nior
 Data de cria��o do arquivo: 10/04/2019
 Objetivo sucinto do programa: Exce��o personalizada de servi�o
 Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */
package servico;

public class ServicoException extends Exception {
	private static final long serialVersionUID = 1L;

	private Integer codigo;

	public ServicoException(String msg, Integer codigo) {
		super(msg);
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}
}
