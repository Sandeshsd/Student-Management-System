package com.project.studentdao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
		try {
			Query query=em.createQuery("select a from Admin a where a.adminEmail=?1 and a.adminPassword=?2");
			query.setParameter(1, email);
			query.setParameter(2, password);
			Admin admin=(Admin)query.getSingleResult();
			return admin;
		}catch (Exception e) {
			return null;
		}
		
	}
	public void updateAdmin(Admin admin) {
		et.begin();
		em.merge(admin);
		et.commit();
	}

}
