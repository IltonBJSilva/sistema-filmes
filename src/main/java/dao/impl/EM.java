/*
 Nome do autor: Ilton Batista da Silva Júnior
 Data de criação do arquivo: 10/04/2019
 Objetivo sucinto do programa:
 Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
 */
package dao.impl;

import javax.persistence.EntityManager;

public class EM {
	private static ThreadLocal<EntityManager> localEm = new ThreadLocal<EntityManager>();
	
	public static synchronized EntityManager getLocalEm() {
		EntityManager em = localEm.get();
		if(em == null) {
			em = EMF.get().createEntityManager();
			localEm.set(em);
		}
		return em;
	}
	
	public static void closeLocalEm() {
		EntityManager em = localEm.get();
		if(em == null) {
			localEm.get().close();
			localEm.set(null);
		}
	}
}
