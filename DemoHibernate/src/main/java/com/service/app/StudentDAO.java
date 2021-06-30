package com.service.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.app.StudentDetails;

public class StudentDAO {

	public void setStudent(String string, int j) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		StudentDetails student = new StudentDetails(string, j);
		session.save(student);
		t.commit();
		System.out.println("Successfully saved "+student.getStudentRollNo());
		factory.close();
		session.close();
	}

}
