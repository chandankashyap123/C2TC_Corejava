package com.tns.manytomany;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Product eleProduct = new Product();
		eleProduct.setId(18);
		eleProduct.setName("LED TV");
		eleProduct.setPrice(30000);
		
		
		Order first = new Order();
		first.setId(78);
		first.setPurchaseDate(new Date());
		first.addProduct(eleProduct);
		em.persist(first);
		em.getTransaction().commit();
		System.out.println("Successfull");

	}

}