package com.map.client;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.model.Answer;
import com.map.model.Question;


public class HibernateMap {

	public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Question q1=new Question();
	q1.setQuestionId(32);
	q1.setQuestion("what is java");
	List<Answer> list=new ArrayList<Answer>();
	Answer answer=new Answer();
	answer.setAnswerId(23);
	answer.setAnswer("programming language");
	answer.setQuestion(q1);
	
	list.add(answer);
	Answer answer1=new Answer();
	answer1.setAnswerId(99);
	answer1.setAnswer("OOPS concept");
	answer1.setQuestion(q1);
	
	list.add(answer1);
	
	
	q1.setAnswer(list);
	
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	session.save(q1);
	session.save(answer);
	session.save(answer1);
	
	transaction.commit();
	session.close();
	factory.close();
	}

}
