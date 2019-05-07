/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa: class que realiza a Transação do banco que gera os commit e retorna os problemas
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */

package dao;

import dao.impl.EM;

public class Transaction {

	public static void begin() {
		EM.getLocalEm().getTransaction().begin();
	}

	public static void commit() {
		EM.getLocalEm().getTransaction().commit();
	}

	public static void rollback() {
		EM.getLocalEm().getTransaction().rollback();
	}

	public static boolean isActive() {
		return EM.getLocalEm().getTransaction().isActive();
	}
}
