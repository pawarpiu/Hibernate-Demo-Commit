package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteClassmate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("advaith");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Classmate c1 = em.find(Classmate.class, 10);

		et.begin();
		em.remove(c1);
		et.commit();

		System.out.println("all good");

	}
}
