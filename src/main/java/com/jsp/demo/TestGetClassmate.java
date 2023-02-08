package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetClassmate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("advaith");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Classmate c1 = em.find(Classmate.class, 4);
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getEmail());

	}
}
