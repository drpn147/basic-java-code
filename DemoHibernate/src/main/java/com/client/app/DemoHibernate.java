package com.client.app;

import com.service.app.StudentDAO;

public class DemoHibernate {

	public static void main(String[] args) {
		StudentDAO s = new StudentDAO();
		s.setStudent("Aman", 23);

	}

}
