package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateClassmate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("advaith");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Classmate c1 = em.find(Classmate.class, 1);

		if (c1 != null) {
			c1.setName("adv");
			et.begin();
			em.merge(c1);
			et.commit();
		} else
			System.out.println("classmate not found");
		System.out.println("all good");
	}
}
