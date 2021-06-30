package com.map.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Question {
	@Id
	@Column(name = "question_id")
	private int questionId;
	private String question;
	
	@OneToMany(mappedBy="question")
	private List<Answer> answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}


}
