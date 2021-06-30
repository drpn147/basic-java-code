package com.model.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentDetails {
	@Id
	@Column(name="student_rollno")
	private int studentRollNo;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_marks")
	private int studentMark;

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMark() {
		return studentMark;
	}

	public void setStudentMark(int studentMarks) {
		this.studentMark = studentMarks;
	}

	public StudentDetails(String studentName, int studentMarks) {
		super();
		//this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentMark = studentMarks;
	}
}
