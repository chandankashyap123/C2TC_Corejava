package com.tns.to1bid;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("cv");
		Addresss homeAddress = new Addresss();
		homeAddress.setStreet("19 th cross");
		homeAddress.setCity("Bangalore");
		homeAddress.setState("KARNATAKA");
		homeAddress.setZipcode("560058");
		student.setAddress(homeAddress);
		em.persist(student);
		em.getTransaction().commit();
		System.out.println("Added the student details");
		

	}

}
