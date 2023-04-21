package com.project.studentdao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.project.studentdto.Admin;
import com.project.studentdto.Student;

public class StudentDAO {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sandy");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveStudent(Student student) {
		et.begin();
		em.persist(student);
		et.commit();
	}
	public List<Student> getAllStudents(Admin admin) {
		Query query=em.createQuery("select s from Student s where s.admin=?1");
		query.setParameter(1, admin);
		List students=query.getResultList();
		
		return students;
	}
	public Student getStudentById(int studentId) {
		return em.find(Student.class, studentId);
	}
	
	public void updateStudent(Student student) {
		et.begin();
		em.merge(student);
		et.commit();
	}
	public void removeStudent(int studentId) {
		et.begin();
		em.remove(em.find(Student.class,studentId));
		et.commit();
	}

}
