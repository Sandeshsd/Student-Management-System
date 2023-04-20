package com.project.studentdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.studentdto.Admin;

public class AdminDAO {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sandy");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void adminSinup(Admin admin) {
		et.begin();
		em.persist(admin);
		et.commit();
	}
	public Admin adminLogin(String email,String password) {
		
		return admin;
		
	}

}
