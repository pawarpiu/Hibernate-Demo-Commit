package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveClassmate {

	public static void main(String[] args) {
		Classmate c1 = new Classmate();
		c1.setId(4);
		c1.setName("xyz");
		c1.setEmail("xyz@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("advaith");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(c1);
		et.commit();
		System.out.println("all good");

	}
}
